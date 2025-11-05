package MultiThreading;

public class ThreadPriority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}
class MyClass{
    public static void main(String[] args) {
        ThreadPriority T1 = new ThreadPriority();
        ThreadPriority T2 = new ThreadPriority();
        ThreadPriority T3 = new ThreadPriority();
        T1.setPriority(Thread.MAX_PRIORITY);
        T2.setPriority(Thread.MIN_PRIORITY);
        T3.setPriority(Thread.NORM_PRIORITY);
        T2.start();
        T3.start();
        T1.start();
    }
}
