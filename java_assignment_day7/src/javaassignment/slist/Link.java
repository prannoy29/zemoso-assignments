package javaassignment.slist;

/**
 * Created by zemoso on 5/7/17.
 */
public class Link<T> { //Creating Link class
        T t;            // Defining Generic field
        Link next;      // Defining Link filed to store reference of next link

        Link(T t,Link next){  // non-default constructor
            this.t = t;
            this.next = next;
        }

        Link(){}               // Default constructor

    @Override
    public String toString() {  //Overriding toString method
        return t.toString();
    }
}
