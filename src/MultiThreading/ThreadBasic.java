package MultiThreading;
import java.lang.*;
//creating thread using thread class
public class ThreadBasic extends Thread{
    public void run(){
        System.out.println("Thread A");
    }
    public static void main(String[] args) {
        ThreadBasic obj = new ThreadBasic();
        obj.start();
        A obj1 = new A();
        Thread t = new Thread(obj1);
        t.start();
    }
}

//creating thread using interface
class A implements Runnable{
    public void run(){
        System.out.println("Interface Thread A");
    }
}
