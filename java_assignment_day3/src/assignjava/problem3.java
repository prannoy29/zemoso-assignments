package assignjava;

/**
 * @author Prannoy Sarkar
 */

    class Concreteclass{}
    interface if1{
        void methodif11();
        void methodif12();
    }

    interface if2{
        void methodif21();
        void methodif22();
    }

    interface if3{
        void methodif31();
        void methodif32();
    }

    interface new_interface extends if1,if2,if3{
        void newmethod();
    }

    class newclass extends Concreteclass implements new_interface{

        @Override
        public void methodif11() {
            System.out.println("This is method1 interface 1");
        }

        @Override
        public void methodif12() {
            System.out.println("This is method2 interface 1");
        }

        @Override
        public void methodif21() {
            System.out.println("This is method1 interface 2");
        }

        @Override
        public void methodif22() {
            System.out.println("This is method2 interface 2");
        }

        @Override
        public void methodif31() {
            System.out.println("This is method1 interface 3");
        }

        @Override
        public void methodif32() {
            System.out.println("This is method2 interface 3");

        }

        @Override
        public void newmethod() {
            System.out.println("This is newmethod newinterface");

        }
    }


public class problem3{
        public static void m1(if1 i){System.out.println("m1");}
        public static void m2(if2 i){System.out.println("m2");}
        public static void m3(if3 i){System.out.println("m3");}
        public static void m4(new_interface i){System.out.println("m4");}



    public static void main(String a[]){
            newclass obj = new newclass();
            m1(obj);
            m2(obj);
            m3(obj);
            m4(obj);
        }
}

