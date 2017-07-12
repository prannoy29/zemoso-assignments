import java.util.Calendar;

/**
 * Created by zemoso on 11/7/17.
 */
public class formKYC {
    private String s1;

    public Calendar stringToCal(String s1){
        String[] fields = s1.split("-");
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(fields[2]),Integer.parseInt(fields[1]),Integer.parseInt(fields[0]));
        return c;
    }

    public String calToString(Calendar c1){
       String field1 = String.valueOf(c1.get(5));
       String field2 = String.valueOf(c1.get(2));
       String field3 = String.valueOf(c1.get(3));

       return field1+"-"+field2+"-"+field3;
    }

    public String[] inputToString(String s1){
        return s1.split(" ");
    }

    public String stringToOutput(String S1, String S2){
        return S1+" "+S2;
    }
    /*public static void main(String[] args) {
        Calendar cc = Calendar.getInstance();
        cc.set(2017, 07, 15);
        cc.add(5,-30);
        System.out.println(cc.get(2));
    }*/

    public Calendar startDate(Calendar signup,Calendar current){
        if(!signup.before(current))return null;
        signup.roll(1, current.get(1) - signup.get(1));
        if (signup.before(current)) {
            signup.add(5, -30);
            }
            else {

        }

            return signup;
    }

    public Calendar endDate(Calendar signup,Calendar current){
        if(!signup.before(current))return null;
        signup.roll(1, current.get(1) - signup.get(1));
        if (signup.before(current)) {
            signup.add(5, -30);
        }
        return signup;
    }

    public static void main(String[] args) {

    }
}