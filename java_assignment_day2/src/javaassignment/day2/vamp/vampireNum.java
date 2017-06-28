package javaassignment.day2.vamp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 *
 * Created by Prannoy Sarkar on 27/6/17.
 */
public class vampireNum { // creating a vampireNum class in order
    int i; // iterator
    int vamp; // vampire number count

    int digitLength(int j) {//calculates the number of digits
        int num = 0;
        while (j != 0) {
            j = j / 10;
            num += 1;
        }
        return num;
    }

    boolean isVampire(int a, int b,int num) {// checks whether number and fangs form vampire numbers
        int k = Integer.valueOf(String.valueOf(a) + String.valueOf(b)); // concatenates the factors
        return sortdigits(k)== sortdigits(num); //rearranges the digits of concatenated factor and checks with that of given number

    }



    int sortdigits(int number){ // method to rearrange digits of a number in ascending order
        int sort = 0;
        List<Integer> numbers = new LinkedList<Integer>(); // a LinkedList to store all digits
        for (int k = number; k > 0; k /= 10)
            numbers.add(k % 10);
          Comparator<Integer> order = Integer::compare; //comparator
          numbers.sort(order.reversed());
        for (int k = digitLength(number)-1; k >= 0; k-- ){
            sort = (numbers.get(k))*((int)Math.pow(10,(k)))+sort; //combining elements of list to reform number, such that digits are in ascending order
        }
         return sort;
    }



    ArrayList<MyPair> facPair(int num) { // Create an array of pairs
        int numlen = digitLength(num);
        int t = (int) Math.pow(10, (numlen / 2)-1); // iterate only for numbers having half-length of the input
        ArrayList<MyPair> pairlist = new ArrayList<MyPair>();
        while (digitLength(t) == numlen / 2 ) {
            if((t%10 ==0) && ((num/t)%10 ==0))t++;
            else if (((num % t) == 0) && (digitLength(num/t) == numlen / 2)) {
                MyPair pair = new MyPair(t, (num / t)); // identify factors
                pairlist.add(pair);// append the factors into list
                t = t + 1;
            } else {

                t =t + 1;
            }
        }
        return pairlist;
    }

    public static void main(String args[]) {
        vampireNum obj1 = new vampireNum();
        obj1.i = 10; //initialize the iterator to 10, as it is first even lengthed number
        obj1.vamp = 0; //intializing the vampire number count

        while (obj1.vamp!=100) {
            if ((obj1.digitLength(obj1.i) % 2) != 0) { // neglect the odd-lengthed number
                obj1.i ++;

            } else {
                ArrayList<MyPair> mylist = new ArrayList<MyPair>();
                mylist = obj1.facPair(obj1.i); //creating list of factors of input number

                for (MyPair data : mylist) { //going through mypair objects, a class i made
                    //if (obj1.isVampire(data.key(), data.value(),obj1.i) == true) {
                        if (obj1.isVampire(data.key(), data.value(),obj1.i) == true) {//checking whether the factors form fangs of a vampire number or not
                            System.out.println(obj1.i);
                            obj1.vamp = obj1.vamp + 1;
                            break;
                        }
                    //}
                }
               obj1.i++;
            }
        }

    }
}
