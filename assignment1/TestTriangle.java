package assignment1;
//ID Numbers
//CSC/18u/4395
//CSC/18u/17u/4190
import java.util.Scanner;
/**
*This method checks if three integers can create a triangle
@params it it takes three integers parameters
@params it returns a boolean where true(can form a triangle) and false (cannot form a triangle)
@
*/
public class TestTriangle {
public static boolean isTriangle(int a, int b, int c){
  if(a>b+c ){
    return false; 
  }else if(b>a+c){
    return false;
  }else if(c >a+b){
    return false; 
  }
  return true;
}

  public static void main(String[] args) {
  int a;int b;int c;
  Scanner in = new Scanner(System.in);
  System.out.print("Enter an integer for triangle length a \n");
  a = in.nextInt();
  System.out.print("Enter an integer for triangle length b \n");
  b = in.nextInt();
  System.out.print("Enter an integer for triangle length c \n");
  c = in.nextInt();
  boolean isTrue = isTriangle(a,b,c);
  if(isTrue) {
    System.out.print("can form a triangle");
  } else{
    System.out.print("can not form a triangle");
  }
  in.close();
  }
}
