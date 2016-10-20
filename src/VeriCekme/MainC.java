package VeriCekme;

/**
 * Created by cenk.akdeniz on 19.10.2016.
 */
import java.util.regex.*;
public class MainC {
    public static void main(String[] args)
    {
        String txt="19:Oct:2016 \"This is an Example!\"";

        String re1=".*?";	// Non-greedy match on filler
        String re2="(\".*?\")";	// Double Quote String 1

        Pattern p = Pattern.compile(re1+re2,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        Matcher m = p.matcher(txt);
        if (m.find())
        {
            String string1=m.group(1);
            System.out.print("("+string1.toString()+")"+"\n");
        }
    }
}
