package javaassignment.slist;

/**
 * Created by zemoso on 5/7/17.
 */

public class SListIterator<T> {//Creating SListIterator
    Link tail;                 //Keeping track of last link element
    Link head;                 //Keeping the address of head
    Link current;              //keeping track of current pointer

    SListIterator(){                //defining the constructor
        this.head = new Link();
        this.tail = head;
        this.current = head;
    }

    public boolean hasNext(){       // method to check whether current has next element or not
        if((current==null)||(current.next==null))
            return false;
        else return true;
    }

    public void insert(T t){     ///Method to insert specified object
        if(tail.t==null) {
            tail = new Link(t, null);
            head = tail;        }
        else {
            Link l = new Link(t, tail.next);
            tail.next = l;
            tail = tail.next;
        }
    }


    public void delete(T t){  /// Method to delete specified object
        current = head;
        Link temp = current;
        if(head.next!=null) {
            if (head.t == t) {
                current = current.next;
                head = current;
                tail = head;
            } else {
                while (current.t != t) {
                    temp = current;
                    current = current.next;
                }
                temp.next = temp.next.next;
                current = temp;
                tail = current;
            }
        }
        else{
            head = new Link();
            current = head;
            tail = current;
        }
    }

    public void setCurrent(){ ///sets current pointer to head
        current = head;
    }
    public void next(){       /// shifts current to next link
        current = current.next;
    }

}
