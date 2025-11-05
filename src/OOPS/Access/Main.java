package OOPS.Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(new int[10],"abc");
        System.out.println(obj.getNum());
    }
}
