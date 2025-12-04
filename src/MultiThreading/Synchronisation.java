package MultiThreading;
//synchronized keyword prevents race condition
class MyThread extends Thread{
    private Counter counter;
    public MyThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            counter.increment();
        }
    }
}
class Counter{
    private int count = 0;
    public synchronized void increment(){ //using synchronized solves this problem or use synchronized block
        count++;
    }
    /*
        //synchronized block
        public void increment(){
            synchronized(this){ // this here refers to the instance when the thread executes this
                count++;
            }
        }
     */
    public int getCount(){
        return count;
    }
}

public class Synchronisation {
    public static void main(String[] args) {
        //both the threads are using the same object hence data may be inconsistent
        // so we need to use synchronized keyword in order to avoid this
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(counter.getCount());
    }
}
