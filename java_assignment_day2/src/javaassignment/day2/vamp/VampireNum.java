package javaassignment.day2.vamp;

import java.util.*;

/**
 *  @author Prannoy Sarkar
 */
public class VampireNum { 
    private int i;
    private int vamp;
    private int num;

    /**
     *
     * @param j integer number
     * @return number of digits of input number
     *
     * Takes an input number and returns total number of digits of that number
     */
    int digitLength(int j) {
        int num = 0;
        while (j != 0) {
            j = j / 10;
            num += 1;
        }
        return num;
    }

    /**
     *
     * @param a assumed factor1
     * @param b assumed factor2
     * @param num number to be tested
     * @return whether num is vampire number or not
     *
     * Checks whether the given factors rearrange to form the input number
     */
    boolean isVampire(int a, int b,int num) {
        int k = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        return sortDigits(k)== sortDigits(num);

    }


    /**
     *
     * @param number input integral number
     * @return rearranged number digits in ascending order
     *
     * Rearranges the digits of input in such a way so that the digits are in ascending order
     */
    int sortDigits(int number){
        int sort = 0;
        List<Integer> numbers = new LinkedList<Integer>();
        for (int k = number; k > 0; k /= 10)
            numbers.add(k % 10);
         Comparator<Integer> order = Integer::compare;
          numbers.sort(order.reversed());
        for (int k = digitLength(number)-1; k >= 0; k-- ){
            sort = (numbers.get(k))*((int)Math.pow(10,(k)))+sort;
        }
         return sort;
    }


    /**
     *
     * @param num input number
     * @return ArrayList of MyPair objects containing factors
     *
     * Creates a list of all the factors of the input number
     */
    ArrayList<MyPair> facPair(int num) {
        int numlen = digitLength(num);
        int t = (int) Math.pow(10, (numlen / 2)-1);
        ArrayList<MyPair> pairlist = new ArrayList<MyPair>();
        while (digitLength(t) == numlen / 2 ) {
            if((t%10 ==0) && ((num/t)%10 ==0))t++;
            else if (((num % t) == 0) && (digitLength(num/t) == numlen / 2)) {
                MyPair pair = new MyPair(t, (num / t));
                pairlist.add(pair);
                t = t + 1;
            } else {

                t =t + 1;
            }
        }
        return pairlist;
    }

    /**
     *
     * @param num number of Vampire numbers to be printed
     *
     * The method prints first 'num' Vampire numbers
     */
    void printVampNums(int num){
        i = 10;
        vamp = 0;
        while (vamp!=num) {
            if ((digitLength(i) % 2) != 0) {
                i ++;

            } else {
                ArrayList<MyPair> mylist = facPair(i);
                for (MyPair data : mylist) {
                    //System.out.println("567898767890");
                    if (isVampire(data.key(), data.value(),i) == true) {
                        System.out.println(i);
                        vamp = vamp + 1;
                        break;
                    }
                }
                i++;
            }
        }
    }

    public static void main(String args[]) {
        VampireNum obj1 = new VampireNum();
        System.out.println("Enter n for first n Vampire Numbers:");
        Scanner sc = new Scanner(System.in);
        obj1.num = sc.nextInt();
        obj1.printVampNums(obj1.num);

    }
}
