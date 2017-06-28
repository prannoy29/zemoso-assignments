package javaassignment.day2.problem3;

/**
 * Created by zemoso on 28/6/17.
 */
public class mynewclass {
    mynewclass(String s){
        System.out.println(s);
    }


    public static void main (String args[]){
        String s = "ps" ;
        mynewclass [] arr = new mynewclass[5];
        // here created array(of length 5) of object references to class "mynewclass"
        // No initialization message is printed from the constructor
    }
}
