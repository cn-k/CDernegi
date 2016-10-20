package VeriCekme;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by cenk.akdeniz on 18.10.2016.
 */
public class VeriCek {

    public static void main(String[] args) throws Exception {

        String url = "http://isimanlamlari.net/Ya%C4%9F%C4%B1z-isminin-anlami-21776.aspx";
        String a = "                    <div class=\"col-md-8  col-sm-8 col-xs-12\">\n" +
                "\n" +
                "                             <div class=\"panel-body ustbilgi\">\n" +
                "\n" +
                "                <b>Cinsiyet: </b>\n" +
                "                <a href='/erkek-ismi-bul.aspx'>Erkek İsimleri</a>\n" +
                "                <b>Köken: </b>\n" +
                "                <a href='/bilinmiyor-bul.aspx'>Bilinmiyor</a>\n" +
                "            </div>\n" +
                "\n" +
                "                        <blockquote>\n" +
                "                            1. Esmer. 2. Doru. 3. Yiğit. 4. Bakımlı hayvan.\n" +
                "                        </blockquote>\n" +
                "\n" +
                "                        Yağız ismi kuranda <b>geçiyor</b>.\n" +
                "                    </div>\n" +
                "                </div>\n";
        String filePath="dosya.txt";
        VeriOkuma veriokuma = new VeriOkuma();
        VeriyiYazma veriyazma = new VeriyiYazma();
        Desen desen = new Desen();
        ArrayList liste =  veriokuma.veriOku(url);


        String tut = desen.desenKullan(a);
        System.out.println(tut);
       // boolean sonuc = veriyazma.veriYaz(liste , filePath);
        //System.out.println(sonuc);
    }


}
