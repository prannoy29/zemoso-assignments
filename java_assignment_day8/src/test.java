

import java.io.*;

/**
 * Created by zemoso on 7/7/17.
 */
public class test {
    public static void main(String args[]) throws FileNotFoundException,
            IOException{
        BufferedReader test = new BufferedReader(new FileReader("input.txt"));
        int c;
        while ((c=test.read())!=-1){
            System.out.println((char)c);
        }
    }
}
