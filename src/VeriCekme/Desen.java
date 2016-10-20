package VeriCekme;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cenk.akdeniz on 20.10.2016.
 */
public class Desen {

    String word1;
    public String desenKullan(String metin){


        String re1 = "@<blockquote>(.*?)</blockquote>@si";
        String re2 = "(Esmer)";

        Pattern p = Pattern.compile(re1,Pattern.CASE_INSENSITIVE|Pattern.DOTALL);

        Matcher m = p.matcher(metin);
        StringBuilder builder = new StringBuilder();

            if(m.find()) {
                word1=m.group(1);
            }
        return word1;
    }
}
