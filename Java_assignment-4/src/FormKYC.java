import java.util.Calendar;

/**
 * @author Prannoy Sarkar
 */
public class FormKYC {
    public String s1;

    /**
     * @param s1 input string of 10 characters, in date format delimited by '-'
     * @return returns Calendar object equivalent of the input String.
     */
    public Calendar stringToCal(String s1) {
        if(s1 == null || s1.isEmpty()){
            return null;
        }
        String[] fields = s1.split("-");
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(fields[2]), Integer.parseInt(fields[1])-1, Integer.parseInt(fields[0]));
        return c;
    }

    /**
     * @param c1 Calendar object input
     * @return String of 10 characters, in date format delimited by '-' equivalent to input
     */
    public String calToString(Calendar c1) {
        String field1 = String.valueOf(c1.get(5));
        String field2 = String.valueOf(c1.get(2)+1);
        String field3 = String.valueOf(c1.get(1));

        return field1 + "-" + field2 + "-" + field3;
    }

    /**
     * @param s1 Takes 21 character length String delimited by single whitespace
     * @return returns String array containing delimited by whitespace
     */
    public String[] inputToString(String s1) {
        return s1.split(" ");
    }

    /**
     * @param S1 string input1
     * @param S2 string input 2
     * @return concatenating string1, one whitespace and string2
     */
    public String stringToOutput(String S1, String S2) {
        return S1 + " " + S2;
    }

    /**
     *
     * @param signup Calendar object containing signup date information
     * @param current Calendar object containing current date information
     * @return returns Calender object in form of Start range Date.
     */
    public Calendar startDate(Calendar signup, Calendar current) {
        //System.out.println(calToString(current));
        current.add(1,-1);
        //System.out.println(calToString(current)+"  "+calToString(signup));
        if(!signup.after(current)){
            current.add(1,1);
            signup.set(1,current.get(1));
            signup.add(5,-30);
            return signup;
        }else {
            signup.add(5,-30);
            if(!signup.after(current)){
                signup.add(5,30);
                current.add(1,1);
                signup.set(1,current.get(1));
                signup.add(5,-30);
                return signup;}
            System.out.println("No Range");
            return null;
        }

    }

    /**
     *
     * @param startdate Calendar object containing start date
     * @param current Calendar object containing current date
     * @return Calendar object returning current date
     */
    public Calendar endDate(Calendar startdate, Calendar current)throws NullPointerException {
        Calendar startdatenew = (Calendar) startdate.clone();
        if (startdatenew==null)return null;
        startdatenew.add(5,60);
        if(startdatenew.before(current))return startdatenew;
        else return current;
    }

}