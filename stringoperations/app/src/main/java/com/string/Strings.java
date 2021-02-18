package com.string;

public class Strings {

public static String Reverse(String str){
  String r="";
  for(int i=str.length()-1; i>=0;i--){
    r=r+str.charAt(i);
  }
  return r;
}

  public static void main(String[] args) {
   String text = "java is odd";
   System.out.print(text);
   text = text.replace("odd","cool");
   System.out.println(" ");
   System.out.println(text);
   for(int i =0;i<text.length(); i++){
     char letter = text.charAt(i);
     System.out.println(letter);
   }
   System.out.println(Reverse("Sadeeq"));
   
  }
}
