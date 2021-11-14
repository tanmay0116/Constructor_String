package Constructor;

public class Tester {
    static{
        System.out.println("I am in static block");
    }
    Tester(){
        System.out.println("I am in constructor");
    }

    public static void main(String[] args) {
        Tester obj1 = new Tester();
        Tester obj2 = new Tester();
        Tester obj3 = new Tester();
    }
}
