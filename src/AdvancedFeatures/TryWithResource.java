package AdvancedFeatures;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class TryWithResource {
    public static void main(String[] args) {
        // The FileOutputStream resource is declared in the try-with-resources statement
        try (FileOutputStream output = new FileOutputStream("filename.txt")) {
            output.write("Hello".getBytes());
            // no need to call output.close() explicitly
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
