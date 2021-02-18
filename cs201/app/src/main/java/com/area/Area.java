package com.area;

public class Area {

  public static double calculateArea(double radius) {
    return Math.PI * (radius * radius);
  }
  
  public static String calculateDays(String name,double age){
  double days = age * 365;
  String message = "Dear "+name+" you lived "+days+" number of days in earth";
  return message;
    
  }
  public static  void checkNumber(double num){
    if(num<0){
      System.out.print("number is negative ");
    }else if(num>0){
      System.out.print("number is positive ");
    }
    
  }
  
  public  static void loop(double num){
    double i = 1;
    while (i <=num){{}
      System.out.print("number is "+i);
      i+=1;
    }
  }
  public static void main(String[] args) {
    double rad = 41.5;
    double area = calculateArea(rad);
    String nam ="sadiq";
    double age =18;
    String days = calculateDays(nam,age);
    loop(5);
    //checkNumber(5);
    //System.out.println(days);
  }
}
