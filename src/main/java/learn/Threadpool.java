package learn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class Threadpool {
    public static void main(String[] args) {
        System.out.println("sadfasdfasdfasdfasdf");
        Runnable aaa = new Runnable() {
            public void run() {
                try {
                    System.out.println("aaaaaaaaaaaaaaaa");
                    System.out.println(System.currentTimeMillis());
                    sleep(100);
                    System.out.println(System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        aaa.run();
    }

    public static void aaa(){
        //创建一个可以缓存的线程池。。
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        //线程池中添加线程。。。。
        //  executorService.submit(runable);
        for(int i = 1; i<100; i++){
            try {//sleep可以明显看得到使用的线程池里以前 的线成  没有创建新的线程。。
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"正在被执行");
                }
            });

        }
    }

    public void run() {
        try {
            System.out.println("aaaaaaaaaaaaaaaa");
            System.out.println(System.currentTimeMillis());
            sleep(100);
            System.out.println(System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
