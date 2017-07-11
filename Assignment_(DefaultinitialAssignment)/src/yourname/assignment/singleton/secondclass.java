package yourname.assignment.singleton;

/**
 * @author Prannoy Sarkar
 */
public class secondclass {

String S1 = new String();

    /**
     *
     * @param s takes any String parameter
     * @return returns object of the parent class
     */
    public static secondclass method1 (String s) {
    secondclass variable = new secondclass();
    variable.S1 = s;
    return variable;
}

    /**
     * Non static method to print String
     */
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
