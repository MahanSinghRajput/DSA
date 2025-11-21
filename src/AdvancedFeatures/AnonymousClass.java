package AdvancedFeatures;
interface Student{
    public String run22(String name);
}
public class AnonymousClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("thread created"));
        t1.start();
        Student engineeringStudent = new Student(){
            @Override
            public String run22(String name) {
                return name + " is engineering student.";
            }
        };
        Student lawStudent = (name) -> {
            return name + " is law student.";
        };
        Student abc = name -> name + " abc";
        String b = lawStudent.run22("abc");
        String a = engineeringStudent.run22("Ram");
        System.out.println(a);
        System.out.println(b);
    }
}