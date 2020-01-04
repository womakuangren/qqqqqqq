package learn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest  implements Runnable{

    private Thread t;
    private String threadName;

    ThreadTest( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public ThreadTest() {

    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

//    public void start () {
//        System.out.println("Starting " +  threadName );
//        if (t == null) {
//            t = new Thread (this, threadName);
//            t.start ();
//        }
//    }

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest("aaa");
       // t.run();
        Thread tt = new Thread(t,"asdfasdf");
//        tt.start();
//        System.out.println(tt.getName());
        //线程池。。
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for(int i = 0; i< 5; i++){
            pool.submit(tt);
            System.out.println("asdfasdfasdfasdfasdf------------");
        }
    }
}


