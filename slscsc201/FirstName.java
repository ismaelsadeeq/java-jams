package com.test;
//LTH/18u/3300
public class Test {
 
public static String FirstName(){
 String A = "* * *    **   * *    * *     **";
 String B = "*    *  *  *  *   *  *   *  *  *";
 String C = "* * *   *  *  * *    * *    *  *";
 String D = "*    *  ****  *      *      ****" ;
 String E = "* * *   *  *  *      *      *  *";
 String Name=A+"\n"+B+"\n"+C+"\n"+D+"\n"+E;
 return Name;
}
  public static void main(String[] args) {
   System.out.println(FirstName());
  }
}
