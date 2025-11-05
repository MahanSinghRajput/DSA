package MultiThreading;

public class MultiThreadBasic {
    public static void main(String[] args) {
        A1 a = new A1();
        a.start();
        B b = new B();
        b.start();
        C c = new C();
        c.start();
    }
}

class A1 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A1" + i);
        }
        System.out.println("Exit from Thread A1");
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread B" + i);
        }
        System.out.println("Exit from Thread B");
    }
}
class C extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread C" + i);
        }
        System.out.println("Exit from Thread C");
    }
}


