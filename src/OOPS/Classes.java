package OOPS;
public class Classes {
    public static void main(String[] args) {
        Student s; // declaration
        s = new Student(); // initialisation
        Student student1 = new Student(); // declaration and initialisation
        // "Student()" is known as constructor
        Student[] students = new Student[5];// if not initialised all will store 'null'

        Student s1 = new Student();
        System.out.println(s1.pass);
       // s1.greeting();
        s1.changeName("bcde");
       // System.out.println(s1.name);
       // s1.greeting();

        Student s2 = new Student(11,"xyz",98.2f,true); //this keyword is replaced by s2
        System.out.println(s2.name);
    }
}
    //syntax to create a class
class Student{
    int rollNo; //by default value is 0
    String name; // by default value is null
    float marks; // by default value is 0.0
    boolean pass; //by default value is false

    void greeting(){
        System.out.println("Hello my name is " + name);
    }

    void changeName(String newName){
        name = newName;
    }

    //creating a constructor

    //we need a way to add the values of the above properties object by object
    // we need a keyword to access every object (this)
//    Student(){
//        this.rollNo = 12;
//        this.name = "abcd";
//        this.marks = 89.6f; // this will be the default values if Student() fun is used
//        this.pass = true;
//    }
    Student(int rollno, String name, float marks, boolean pass){
        this.rollNo = rollno; // if you don't use this keyword then the arguments names cant be same as initializers of this constructor
        this.name = name;
        this.marks = marks; // this is generalised and can be used to give values while initialising
        this.pass = pass; // Student(values...)
    }
    Student(Student other){
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
        this.pass = other.pass;
    }
    //how to call a constructor from another constructor
    Student(){
        // internally : new Student();
        this (11,"ab",98.0f,true); //this is default
    }
}
