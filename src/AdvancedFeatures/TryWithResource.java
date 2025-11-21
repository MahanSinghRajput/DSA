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
/*

try (ResourceType resource = new ResourceType()) {
    // use the resource
} catch (ExceptionType e) {
    // handle exceptions
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("testRead.txt"));
             PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {

            while (scanner.hasNext()) {
                writer.println(scanner.nextLine());
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }
    }
}


import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream output = new FileOutputStream("filename.txt")) {
            output.write("Hello".getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}

 */
