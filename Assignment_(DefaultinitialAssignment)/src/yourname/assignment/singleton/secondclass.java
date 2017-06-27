package yourname.assignment.singleton;

/**
 * Created by Prannoy Sarkar on 23/6/17.
 */
public class secondclass {

String S1 = new String();

public static secondclass method1 (String s) {
    secondclass variable = new secondclass();
    variable.S1 = s;
    return variable;
}

    public void method2(){
    String s = "Prannoy Sarkar";
    System.out.println(s);
    }

    public static void main(String[] args){

        secondclass firstinstance = new secondclass();
        String s = "Prannoy Sarkar";

        firstinstance.method2();
        firstinstance.method1(s);
    }
}
