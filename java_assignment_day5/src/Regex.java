import com.sun.org.apache.regexp.internal.RE;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Prannoy Sarkar on 3/7/17.
 */
public class Regex {
    String s;
    void checkpattern(String s){
    String REGEX = "^[A-Z].*[.]$";
    Pattern PATTERN = Pattern.compile(REGEX);
    Matcher m = PATTERN.matcher(s);
    if(m.matches()) {
        System.out.println("yes");
    }
    else
    {System.out.println("No");}
    }

    public static void main(String args[]){
        Regex r = new Regex();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter sentence to check");
        r.s = in.nextLine();
        r.checkpattern(r.s);

    }
}
