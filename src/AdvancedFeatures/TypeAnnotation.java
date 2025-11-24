package AdvancedFeatures;
import java.lang.annotation.*;
import java.util.List;
// Define a custom annotation for type use
@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@interface NonNull {}
public class TypeAnnotation {
    // Field with a type annotation
    private @NonNull String name;
    // Constructor with type annotation on parameter
    public TypeAnnotation(@NonNull String name) {
        this.name = name;
    }
    // Method with annotated return type and parameter
    public @NonNull String greet(@NonNull String greeting) {
        return greeting + ", " + name + "!";
    }
    public void processList() {
// Annotated variable
        List<@NonNull String> items = List.of("Apple", "Banana", "Cherry");
        for (@NonNull String item : items) {
            System.out.println("Item: " + item);
        }
    }
    public static void main(String[] args) {
        TypeAnnotation demo = new TypeAnnotation("Alice");
        System.out.println(demo.greet("Hello"));
        demo.processList();
    }
}