import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


/**
 *
 */
public class Solution{
    public static void main(String[] args) throws IOException, IndexOutOfBoundsException,NullPointerException {
        FormKYC formobj = new FormKYC();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        formobj.s1 = bf.readLine();
        Calendar cc = Calendar.getInstance();
        cc.set(2017,4,5);
        cc.add(Calendar.DAY_OF_MONTH,-5);

        try {
            String[] slist = formobj.inputToString(formobj.s1);
            Calendar startdate = formobj.startDate(formobj.stringToCal(slist[0]), formobj.stringToCal(slist[1]));
            Calendar enddate = formobj.endDate(startdate, formobj.stringToCal(slist[1]));
            String result = formobj.stringToOutput(formobj.calToString(startdate), formobj.calToString(enddate));
            System.out.println(result);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Enter Date strings in correct format");
        }catch (NullPointerException e){};

    }
}
