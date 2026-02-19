import java.util.Scanner;
// Non-static method → needs object
// Static method → call with class name
public class Main {
    static class utilclass{
    public static int add(int a,int b) {
      return a+b;
    }
    public static int subtract(int a,int b) {
      return a-b;
    }
    public static int multiply(int a,int b) {
      return a*b;
    }
    public static int divide(int a, int b) {
      return a/b;
    }
  }
  public static void main(String[] args) {
    System.out.println("Hi Buddy!");
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter two numbers:");
    int c= sc.nextInt();
    int d=sc.nextInt();
    System.out.println("Addition: "+utilclass.add(c,d));
    System.out.println("Subtraction: "+utilclass.subtract(c,d));
    System.out.println("Multiplication: "+utilclass.multiply(c,d));
    System.out.println("Division: "+utilclass.divide(c,d));

  }
  
}
  

