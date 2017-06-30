package assignjava.assignjava.problem4;

/**
 * Created by Prannoy Sarkar on 30/6/17.
 */

interface cycle{
    void method();
}

interface cycleFactory{
    cycle getcycle();
}

class Unicycle implements cycle {

    @Override
    public void method() {
        System.out.println("Riding Unicycle");
    }
}
class UnicycleFactory implements cycleFactory{
    @Override
    public cycle getcycle(){return new Unicycle();}
    }

class Tricycle implements cycle {

    @Override
    public void method() {
        System.out.println("Riding Tricycle");
    }
}
class TricleFactory implements cycleFactory{
    @Override
    public cycle getcycle(){return new Tricycle();}
}


class Bicycle implements cycle {

    @Override
    public void method() {
        System.out.println("Riding Bicycle");
    }
}
class BicycleFactory implements cycleFactory{
    @Override
    public cycle getcycle(){return new Bicycle();}
}

public class Cycle {
    public static void RideCycle(cycleFactory cf) {
        cycle c = cf.getcycle();
        c.method();
    }
    public static void main (String args[]){
        RideCycle(new BicycleFactory());
        RideCycle(new UnicycleFactory());
        RideCycle(new TricleFactory());
    }
}

