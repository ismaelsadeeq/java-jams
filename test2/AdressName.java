package com.test2;
//LTH/18u/3300
public class AdressName {
  public static String AddressName(){
   String houseNumber="53";
   String streetName="Limawa";
   String town="Sangere";
   String state="Adamawa";
   String postCode="988263";
   String Address = houseNumber +"\n"+streetName+"\n"+town+"\n"+state+"\n"+postCode;
   return Address;
 }
  public static void main(String[] args) {
   System.out.println(AddressName());
  }
}
