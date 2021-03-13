package assignment2;

import java.util.Scanner;
//ID Numbers
//CSC/18u/4395
//CSC/18u/17u/4190

public class MyAck {
  public static int ack(int m, int n) {

    if (m == 0) {

      return n + 1;

    } else if ((m > 0) && (n == 0)) {

      return ack(m - 1, 1);

    } else if ((m > 0) && (n > 0)) {

      return ack(m - 1, ack(m, n - 1));

    } else return n + 1;
  }

  public static void main(String[] args) {
    int m;
    int n;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer for the value of m \n");
    m = in.nextInt();
    System.out.print("Enter an integer for the value of n \n");
    n = in.nextInt();
    in.close();
    System.out.print(ack(m, n));
    
  }
  
}
