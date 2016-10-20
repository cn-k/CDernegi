package VeriCekme;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by cenk.akdeniz on 18.10.2016.
 */
public class VeriyiYazma {

    public boolean veriYaz (ArrayList<String> gelenVeri , String dosyaPath){

        boolean sonuc = true;
        try {
            File file = new File(dosyaPath);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);

            for(int i = 0 ; i<gelenVeri.size(); i++){

                bWriter.write(gelenVeri.get(i));
                bWriter.newLine();
            }


        }catch (Exception e){

            return false;
        }

        return sonuc;
    }
}
