package yourname.assignment.main;

import yourname.assignment.data.firstClass;
import yourname.assignment.singleton.secondclass;

/**
 * @author Prannoy Sarkar
 */
public class main {
    public static void main(String args[]){
        firstClass obj1 = new firstClass();
        secondclass  obj2 = new secondclass();
        String s = "Prannoy Sarkar";

        obj1.printVar();
        obj1.printMethod2();
        obj2.method1(s);
        obj2.method2();
    }
}