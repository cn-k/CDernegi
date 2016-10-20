package Threads;

/**
 * Created by cenk.akdeniz on 15.10.2016.
 */
public class YourThread extends Thread{


    int sayi;
    public YourThread(String name ,int sayi){
        super(name);
        this.sayi=sayi;
    }

    @Override
    public void run() {
        System.out.println(getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
