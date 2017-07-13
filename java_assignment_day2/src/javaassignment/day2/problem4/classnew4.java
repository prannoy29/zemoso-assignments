package javaassignment.day2.problem4;

/**
 * @author Prannoy Sarkar
 */
public class classnew4 {
    classnew4(String s){
        System.out.println(s);
    }


    public static void main (String args[]){
        String ss = "ps" ;
        classnew4 [] arr = new classnew4[5];
        for (int i=0;i<5;i++) arr [i] = new classnew4(ss);
        // we get the initialization messages
    }
}