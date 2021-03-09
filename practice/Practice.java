import java.util.Scanner;
public class Practice {
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
  }
}
