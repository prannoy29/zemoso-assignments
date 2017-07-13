import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author Prannoy Sarkar
 */
public class pingMed {
    private String command;
    private String ip;
    public String s = new String();
    List<Double> timeList = new ArrayList<Double>();

    List<Double> getProcessInput(String ip, String command) throws IOException,StringIndexOutOfBoundsException,NumberFormatException{
        Process p = Runtime.getRuntime().exec(command+" "+ip);
        BufferedReader bf = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while((s=bf.readLine())!=null) {
            if (Pattern.compile(".*time=.*").matcher(s).matches())
            timeList.add(Double.parseDouble(s.substring(s.indexOf("time=")+5,s.indexOf("time=")+9)));
        }
        p.destroy();
        return timeList;
    }

    double medianArray(List<Double> arr){
        Collections.sort(arr);
        int size = arr.size();
        if(size%2==0)return (arr.get(size / 2) +arr.get((size/2)-1))/2;
        else return arr.get(size/2);

    }

    public static void main(String args[]) throws IOException{
        pingMed ping = new pingMed();
        System.out.println("Enter a Valid Linux ping command for example - ping -c n , where n is number of ping requests");
        ping.command = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        System.out.println("Enter a valid ip address/hostname");
        ping.ip = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        try {
           double result =  ping.medianArray(ping.getProcessInput(ping.ip,ping.command));
            System.out.println("Median time taken to ping"+" is"+" "+result+" pms");
        } catch (IOException|StringIndexOutOfBoundsException|NumberFormatException e) {
            e.printStackTrace();
        }
    }
}


