import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Prannoy Sarkar
 */
public class Regex {
    String s;

    /**
     *
     * @param s input string that has to be checked against given REGEX
     * @return string message, giving matching status
     *
     * The method displays message "Yes, it matches",if pattern matches else flashes "No, it doesn't match".
     */
    String checkpattern(String s){
    String REGEX = "^[A-Z].*[.]$";
    Pattern PATTERN = Pattern.compile(REGEX);
    Matcher m = PATTERN.matcher(s);
    if(m.matches()) {
        String ss = "Yes, it matches";
        return ss;
    }
    else
    {
        String ss = "No, it doesn't match";
        return ss;
    }
    }


    public static void main(String args[]){
        Regex r = new Regex();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter sentence to check");
        r.s = in.nextLine();
        System.out.println(r.checkpattern(r.s));

    }
}
