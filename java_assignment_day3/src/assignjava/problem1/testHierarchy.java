package assignjava.problem1;

/**
 * Created by Prannoy Sarkar on 30/6/17.
 */
abstract class Rodent{
    Rodent(){System.out.println("This is Rodent object constructor");}

 public abstract void colour();
 public abstract void shape();
 public abstract void food();
}

class Mouse extends Rodent{
    Mouse(){System.out.println("This is Mouse object constructor");}

    public void colour(){System.out.println("Defines Mouse colour");}
    public void shape(){System.out.println("Defines Mouse shape");}
    public void food(){System.out.println("Describes food habit of Mouse");}
}

class Gerbil extends Rodent{
    Gerbil(){System.out.println("This is Gerbil object constructor");}

    public void colour(){System.out.println("Defines Gerbil colour");}
    public void shape(){System.out.println("Defines Gerbil shape");}
    public void food(){System.out.println("Describes food habit of Gerbil");}
}

class Hamster extends Rodent{
    Hamster(){System.out.println("This is Hamster object constructor");}

    public void colour(){System.out.println("Defines Hamster colour");}
    public void shape(){System.out.println("Defines Hamster shape");}
    public void food(){System.out.println("Describes food habit of Hamster");}

}


public class testHierarchy {
    public static void main(String[] args) {
        Rodent[] arr = {
                new Mouse(),
                new Hamster(),
                new Gerbil()
        };

        for (Rodent r : arr) {
            r.colour();
            r.food();
            r.shape();
        }

    }
}
