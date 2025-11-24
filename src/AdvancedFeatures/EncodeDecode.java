package AdvancedFeatures;
import java.util.Base64;
public class EncodeDecode {
    public static void main(String[] args) {
        String originalInput = "HelloWorld123";
        // Encode
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println("Encoded: " + encodedString);
        // Decode
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded: " + decodedString);
    }
}
