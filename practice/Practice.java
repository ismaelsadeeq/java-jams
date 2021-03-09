import java.util.Scanner;
public class Practice {
  //Static Methods
  public static void printTime(int hour, int minute) {
    System.out.print(hour);
    System.out.print(":");
    System.out.println(minute);
  }
  //Recursion
  public static void countdown(int n) {
    if (n == 0) {
      System.out.println("Blastoff!");
    } else {
      System.out.println(n);
      countdown(n - 1);
    }
  }
  //valued methods
  public static double distance(double x1, double y1, double x2, double y2) {
    double dx = x2 - x1;
    double dy = y2 - y1;
    double dsquared = dx * dx + dy * dy;
    double result = Math.sqrt(dsquared);
    return result;
  }
  //recursion
  public static int factorial(int n) {
    if (n == 0) {
    return 1;
    }
    int recurse = factorial(n - 1);
    int result = n * recurse;
    // System.out.println(result);
    return result;
  }
  public static int fibonacci(int n) {
    if (n == 1 || n == 2) {
    return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
  public static void main(String[] args){
    String dummyText;
    Scanner aim = new Scanner(System.in);
    System.out.println("Type aything nigga");
    dummyText = aim.nextLine();
    // System.out.println(0.1 * 10); output is 10
    System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1+ 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
    System.out.println("hello"+2);
    System.out.println("Your dummy text is : "+dummyText); // String concatenation
    if(!dummyText.equals("fuck")){
      System.out.println("aint you ashamed of yourself");
    } else{
      System.out.println("Good boy");
    }
    // System.out.println(System.out);
    System.out.println("Enter an integer :");
    int a = aim.nextInt();
    System.out.println("Your integer is :"+ a); 
    System.out.println("Enter a decimal number :");
    double b = aim.nextDouble();
    System.out.println("Your decimal number is : "+b);
    

    //Scanner bug 
    /*  to solve the bug of starting with an integer scanner your need
        an empty in.nextLine();  that will break the line
    */
    aim.nextLine();
    String name;
    int age;
    System.out.print("What is your name? ");
    name = aim.nextLine();
    System.out.print("What is your age? ");
    age = aim.nextInt();
    System.out.printf("Hello %s, age %d\n", name, age);

     //Math methods
     double root = Math.sqrt(17.0); //compute the root of the argument
     double angle = 1.5;
     double height = Math.sin(angle); //find the sine of angle note that the result is in radians to covert devide by 180 and times by pi
     double degrees = 90;
     angle = degrees / 180.0 * Math.PI;
     long y = Math.round(Math.PI * 20.0);
     double val = Math.cos(angle + Math.PI / 2.0);
     double power = Math.pow(2.0, 10.0);

    //Static Methods
    int hour = 11;
    int minute = 59;
    printTime(hour, minute);
    //recursion
    countdown(5);
    /**
  * Overloading means naming two or more methods with the same name 
    this can be done if and only if the parameters are not equal.
  *
  * @param how many parameters does the method has
  * @return what a method is returning
  */

  System.out.println(factorial(3));
  }
}
