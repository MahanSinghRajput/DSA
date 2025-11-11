package Trees;

public class BinarySearchTree {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
            this.height = 0;
        }
        public int getValue(){
            return value;
        }
        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    private Node root;
    public BinarySearchTree(){

    }

    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root,"Root Node: ");
    }

    private void display(Node node, String details){
        if(node == null) return;
        System.out.println(details + node.getValue());
        display(node.getLeft(), "Left child of " + node.getValue() + ": ");
        display(node.getRight(), "Right child of " + node.getValue() + ": ");
    }

    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length-1);
    }
    private void populateSorted(int[] nums,int start,int end){
        if(start >= end) return;
        int mid = (start + end)/2;
        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid + 1,end);
    }

    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value, Node node){
        if(node == null) {
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if(value > node.value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null) return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        //tree.populate(new int[]{5,2,7,1,4,6,9,8,3,10});
        //tree.display();

        tree.populateSorted(new int[]{1,2,3,4,5,6,7});
        tree.display();
    }
}
