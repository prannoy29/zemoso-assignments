package yourname.assignment.data;

/**
 * @author Prannoy Sarkar
 */
public class firstClass{

    int num;
    char c;

    /**
     * Prints variables
     */
    public void printVar(){
        System.out.println(num);
        System.out.println(c);
    }

    
    public void printMethod2(){
       /* int num1;
        int num2;
        System.out.println(num1);
        System.out.println(num2);
        */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // EXPLAINATION
    /*
    Any Instance variables used has  a default value set for int is 0 and for char it is
    null ('\u0000') hence any reference can be made with these variables. In case of local variables
    declared in the method 'printMethod2()'num1 and num2 don't have any default valuees, i.e, they
    have to be initialised in order to use it for any further calculations. This is designed already
    in java becuase local variables are declared mostly to do some calculation. So its the programmer's
     decision to set the value of the variable and it should not take a default value. If the programmer
     , by mistake, did not initialize a local variable and it take default value, then the output could
     be some unexpected value. So in case of local variables, the compiler will ask the programmer to
     initialize with some value before they access the variable to avoid the usage of undefined values.
    */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }



    public static void main(String[] args){
        firstClass firstinstance = new firstClass();
        //firstclass secondinstance = new firstclass();

        firstinstance.printVar();
        //secondinstance.printMethod2();
    }

}
