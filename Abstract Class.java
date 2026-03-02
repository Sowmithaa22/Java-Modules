/* Abstract- Hiding implementation details, and showing only the essential features

- Abstract class (general structure)

abstract class classname {
    abstract void methodname(); // no body
}
*/

abstract class Car {
    abstract void engine();
    abstract void gear();
}

class baleno extends Car {
    @Override
    void engine() {
        System.out.println("It has a robust engine");
    }
    
    @Override
    void gear() {
        System.out.println("It has 5 gears and one reverse");
    }
}

public class Main{
    public static void main(String[] args) {
        Car e= new baleno();
        e.gear();
    }
}
