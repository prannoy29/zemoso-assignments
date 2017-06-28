package javaassignment.day2.vamp;

/**
 * Created by Prannoy Sarkar on 27/6/17.
 */
public class MyPair {//Creating a class to create and represent pair
    private final int key;
    private final int value;

    public MyPair(int akey,int avalue){
        key = akey;
        value = avalue;

    }

    public int key(){
        return key;
    }

    public int value(){
        return value;
    }

    public void add(MyPair pair) {
    }
}
