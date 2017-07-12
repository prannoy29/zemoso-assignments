import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zemoso on 10/7/17.
 */
public class inputCheck {
    private char s;



    public static void main(String args[])throws IOException,ArrayIndexOutOfBoundsException{
        inputCheck in = new inputCheck();
        int [] myarray = new int[26];
        int c;
        int sum = 0;
        Arrays.fill(myarray, -1);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       while( (c = bf.read())!=10) {
           in.s = (char) c;
           System.out.println("dkkddkkdkd");
           int a = c-97;
           if (a < 26 && a > -1 && myarray[a] == -1) {
               myarray[a] = 0;
               System.out.println(myarray[a]);

           }
           System.out.println(c);
       }
       System.out.println("1234rfvbhjuytfr");
        int i = 0;
        while(i < 26) {
            sum += myarray[i];
            i++;
            System.out.println(sum);
        }
        System.out.println((sum==0));
    }
}
