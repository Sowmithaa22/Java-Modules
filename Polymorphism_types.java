/* Polymorphism- one name many forms

Compile Time- Static Polymorphism- Method Overloading
Runtime-      Dynamic Polymorphism- Method Overriding

*/

// Method Overloading
class addition {
    void add(int a, int b) {
        System.out.println(a+b);
    }
    
    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    
    double add(double a, double b) {
        return a+b;
    }
}

// Method Overriding
class calculator { // parent class
    void minus() {
        System.out.println("Value deducted");
    }
}

class subtraction extends calculator { //child class
    void minus() {
        System.out.println("Subtraction subtracts a from b");
    }
}

public class Main{
    public static void main(String[] args) {
        
        addition a= new addition();
        a.add(2,788);
        System.out.println(a.add(3.667,9794.34));
        
        calculator c= new subtraction();
        c.minus();
    }
}
