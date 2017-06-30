package assignjava.problem2;

/**
 * Created by Prannoy Sarkar on 30/6/17.
 */

//MY OBSERVATIONS COMMENTED AS

/*
1) When we try to call balance on each element of array, as the elements are UPCASTED to the superclass,
    we cant compile the code, because there is no "balance()" method in the superclass Cycle.
2) Now when we try to call balance after DOWNCASTING, we are still unable to compile the code again because
   of no "balance()" method in class Tricycle.
3) Hence i have commented that blocks of code which cannot be compiled (only two lines are commented).
* */
class Cycle{

}

class Unicycle extends Cycle{
    public void balance(){
        System.out.println("This balances the unicycle");
    }
}

class Bicycle extends Cycle{
    public void balance(){
        System.out.println("This balances the bicycle");
    }
}

class Tricycle extends Cycle{

}

public class prob2 {
    public static void main(String args[]){
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle[] arr = {unicycle,bicycle,tricycle};
        for (Cycle c : arr){
            //c.balance(); /// cannot compile beacuse no such method in Cycle

        }
        ((Unicycle)arr[0]).balance();
        ((Bicycle)arr[1]).balance();
        //((Tricycle)arr[2]).balance();annot compile beacuse no such method in Tricycle

    }
}
