import java.util.Random;
import java.util.Scanner;

/**
 * Created by Prannoy Sarkar on 3/7/17.
 */

class firstException extends Exception{}
class secondException extends Exception{}
class thirdException extends Exception{}


public class ExceptionAssignment {
    public void throwingmethod(int i) throws
            firstException, secondException, thirdException{
        if (i<30) {
            System.out.println("throwing first exception");
            throw new firstException();
        }

        else if(i>=30 && i<60){System.out.println("throwing second exception");
        throw new secondException();}

        else if(i>=60 && i<100){
            System.out.println("throwing third exception");
            throw new thirdException();
        }

        else {
            System.out.println("throwing NullPointerException exception");
            throw new NullPointerException();
        }
    }

    public static void main(String a[]) {
       ExceptionAssignment obj = new ExceptionAssignment();
        Random r = new Random();
        int Low = 0;
        int High = 150;
        int i = r.nextInt(High-Low) + Low;

        try {

            obj.throwingmethod(i);
        } catch (firstException | secondException | thirdException | NullPointerException e) {
            e.printStackTrace();

        }
        finally {
            System.out.println("'Finally' is always executed");
        }
    }

}