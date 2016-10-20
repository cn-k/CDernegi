package Threads;

/**
 * Created by cenk.akdeniz on 11.10.2016.
 */
public class MainClass {
    public static void main(String [] args){

        //MyThread mythread=new MyThread("MyThread" ,3);
       // mythread.start();
        String tut = "adım";
        char sonuc = harfAra(tut);
        if(sonuc == 1){
            System.out.println("Aynı harf yok");
        }
        else {
            System.out.println("Aynı harf var-" + sonuc);
        }


    }
    public static char harfAra(String kelime){

        char c ;
        for(int i = 0 ; i<kelime.length() ; i++){

            for(int k = i ; k <kelime.length() ; k++ ){

                if(k+1>=kelime.length())
                    return 1;
                else if(kelime.charAt(i)==kelime.charAt(k+1))
                    return kelime.charAt(i);
            }

        }
                return 1;

    }

}
