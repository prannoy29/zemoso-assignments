package yourname.assignment.main;

import yourname.assignment.data.firstclass;
import yourname.assignment.singleton.secondclass;

/**
 * Created by Prannoy Sarkar on 23/6/17.
 */
public class main {

    //firstclass obj1 = new firstclass();
    //obj1.printVar()
    //obj1.printMethod2()
    //secondclass  obj2 = new secondclass();

    public static void main(String args[]){
        firstclass obj1 = new firstclass();
        secondclass  obj2 = new secondclass();
        String s = "Prannoy Sarkar";

        obj1.printVar();
        obj1.printMethod2();
        obj2.method1(s);
        obj2.method2();
    }
}