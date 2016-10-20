package Threads;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by cenk.akdeniz on 15.10.2016.
 */
public class MainClass2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        YourThread [] threads = new YourThread[a];
        for (int i = 0 ; i<a ; i++){
            YourThread yt = new YourThread("Thread" + i , a);
            threads[i] = yt;
        }

        for(int j = threads.length ; j>0; j-- ){
            Thread t =threads[j-1];
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
