package assignjava;

/**
 * @author Prannoy Sarkar
 */
class outer1{
    class inner1{
        inner1(String s){}

    }
}
class outer2 extends outer1 {
    class inner2 extends outer1.inner1 {
        public inner2(String s) {
            super(s);
        }
    }
}

public class problem5{
    public static void main(String a[]){
        String s = "Hello";
        outer2 obj1 = new outer2();
        outer2.inner2 obj = obj1.new inner2(s);
    }
}