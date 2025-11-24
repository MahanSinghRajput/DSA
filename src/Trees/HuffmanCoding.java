package Trees;

import java.util.HashMap;
import java.util.PriorityQueue;

public class HuffmanCoding {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;
    Node root;

    public HuffmanCoding(String feeder) {
        HashMap<Character, Integer> fMap = new HashMap<>();
        for (int i = 0; i < feeder.length(); i++) {
            char c = feeder.charAt(i);
            fMap.put(c, fMap.getOrDefault(c, 0) + 1);
        }

        // Build priority queue from frequency map
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (char c : fMap.keySet()) {
            pq.add(new Node(c, fMap.get(c)));
        }

        // Build Huffman Tree
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            Node newNode = new Node('$', left.cost + right.cost);
            newNode.left = left;
            newNode.right = right;
            pq.add(newNode);
        }

        root = pq.poll();

        encoder = new HashMap<>();
        decoder = new HashMap<>();
        generateCodes(root, "");
    }

    private class Node implements Comparable<Node> {
        Character data;
        int cost;
        Node left, right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    private void generateCodes(Node node, String code) {
        if (node == null) return;
        if (node.data != '$') {
            encoder.put(node.data, code);
            decoder.put(code, node.data);
        }
        generateCodes(node.left, code + '0');
        generateCodes(node.right, code + '1');
    }

    public String encode(String text) {
        StringBuilder encoded = new StringBuilder();
        for (char c : text.toCharArray()) {
            encoded.append(encoder.get(c));
        }
        return encoded.toString();
    }

    public String decode(String encodedStr) {
        StringBuilder decoded = new StringBuilder();
        String temp = "";
        for (int i = 0; i < encodedStr.length(); i++) {
            temp += encodedStr.charAt(i);
            if (decoder.containsKey(temp)) {
                decoded.append(decoder.get(temp));
                temp = "";
            }
        }
        return decoded.toString();
    }

    // For testing
    public static void main(String[] args) {
        String feeder = "Huffman coding is a lossless data compression algorithm.";
        HuffmanCoding hc = new HuffmanCoding(feeder);

        String message = "data compression";
        String encodedMessage = hc.encode(message);
        String decodedMessage = hc.decode(encodedMessage);

        System.out.println("Original Message: " + message);
        System.out.println("Encoded Message: " + encodedMessage);
        System.out.println("Decoded Message: " + decodedMessage);
    }
}
