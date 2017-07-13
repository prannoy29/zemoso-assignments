package javaassignment.slist;

/**
 *@author Prannoy Sarkar
 *
 *
 */

public class Slist<T>{ // SList class

    Link<T> link = new Link<T>();

    SListIterator<T> iterator(Link link){return new SListIterator<T>();} // iterartor method returns new SListiterator


    public String toString(SListIterator<T> it){//overridden toString() method
        String str = new String();                        // initialising str
        it.setCurrent();                                  // Setting current pointer to head pointer;

        while((it!= null)){                                // While loop to traverse Slist

           try{                                            //Exception handling, when head,current and tail all point to Null
               str = str + " " + it.current.t.toString();
           }
           catch (NullPointerException e){
               System.out.println("Slist is now empty!");
           }
            if(it.hasNext())it.next();
            else break;
        }

        return str;
    }

    public static void main(String a[]){
        Slist<Integer> mylist = new Slist<Integer>(); // Create new SList
        SListIterator<Integer> it = mylist.iterator(mylist.link); // Initialissing Iterator with iterator() method
        // Example                                                 // following is an example
        it.insert(2);
        it.insert(3);
        it.insert(4);
        it.insert(5);
        it.insert(6);

        System.out.println(mylist.toString(it));

        it.delete(2);
        it.delete(3);
        it.delete(4);
        it.delete(5);
        it.delete(6);

        System.out.println(mylist.toString(it));

        it.insert(33);
        System.out.println(mylist.toString(it));
    }
}