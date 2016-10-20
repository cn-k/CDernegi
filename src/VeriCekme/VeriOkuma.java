package VeriCekme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * Created by cenk.akdeniz on 18.10.2016.
 */
public class VeriOkuma {

    ArrayList<String> veriListesi = new ArrayList<String>();
    public ArrayList<String> veriOku(String urlPath){

        try {
            URL url = new URL(urlPath);
            URLConnection urlConn = url.openConnection();
            urlConn.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader( urlConn.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null){
                veriListesi.add(inputLine);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return veriListesi;
    }

}
