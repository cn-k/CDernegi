package Threads;

/**
 * Created by cenk.akdeniz on 11.10.2016.
 */
public class MyThread extends java.lang.Thread {

    int threadSayisi;

public  MyThread(String name , int threadSayisi){
    super(name);
    this.threadSayisi = threadSayisi;
}

    @Override
    public void run() {

        try {
                for(int i = 0 ; i<threadSayisi; i++){
                System.out.printf("%s:%d%n", getName(), i);
                Thread.sleep(1000);}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        MyThread mt = new MyThread("Thread" + (threadSayisi-1) , threadSayisi-1);
    }
}