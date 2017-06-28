package javaassignment.day2.problem2;

/**
 * Created by Prannoy Sarkar on 28/6/17.
 */
public class myclass {
    int i;
    myclass(){
        i = 0;
        System.out.println("This is default constructor");

    }
    myclass(int seti){
        this(); //calling the first constructor from "this"
        this.i = seti;
        System.out.println("This is overloading constructor with i = "+ this.i);
    }

    public static void main (String args[]){

        myclass obj1 = new myclass();
        myclass obj2 = new myclass(25);
    }
}
