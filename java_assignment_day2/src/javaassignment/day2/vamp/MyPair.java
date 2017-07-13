package javaassignment.day2.vamp;

/**
 * @author Prannoy Sarkar
 */
public class MyPair {//Creating a class to create and represent pair
    private final int key;
    private final int value;

    /**
     *
     * @param akey  key(integer) for new pair
     * @param avalue value(integer) corresponding to given key
     */
    public MyPair(int akey,int avalue){
        key = akey;
        value = avalue;

    }

    /**
     *
     * @return returns key
     */
    public int key(){
        return key;
    }

    /**
     *
     * @return returns value
     */
    public int value(){
        return value;
    }

    /**
     *
     * @param pair pair object to be added
     */
    public void add(MyPair pair) {
    }
}
