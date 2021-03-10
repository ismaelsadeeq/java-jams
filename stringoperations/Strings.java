public class Strings {

  public static String Reverse(String str){
    String r="";
    for(int i=str.length()-1; i>=0;i--){
      r=r+str.charAt(i);
    }
    return r;
  }
  //formatter
  public static String timeString(int hour, int minute) {
    String ampm;
    if (hour < 12) {
      ampm = "AM";
    if (hour == 0) {
      hour = 12; // midnight
    }
    } else {
      ampm = "PM";
      hour = hour - 12;
    }
    return String.format("%02d:%02d %s", hour, minute, ampm);
  }

  public static void main(String[] args) {
    System.out.print("Roman alphabet: ");
    for (char c = 'A' ; c <= 'Z' ; c++) {
    System.out.print(c);
    }
    System.out.println();

    System.out.print("Greek Albpahabet :");
    for(int i = 913;i<937;i++){
      System.out.print((char) i);
 
    }
    System.out.println();
    //Strings are immutable if you invoke a string method on a string it doesnt change the object but return a new 
    //value of the object
    String name = "sadeeq ismael";
    String fullName = name.toUpperCase();
    System.out.println("lower case is : "+ name + " and upper case is : "+fullName);
    String text = "java is odd";
    System.out.print(text);
    text = text.replace("odd","cool");
    System.out.println();
    System.out.println(text);
    for(int i =0;i<text.length(); i++){
       char letter = text.charAt(i);
       System.out.println(letter);
    }
    //enhance for loop doesnt work on strings
    for (char letter : text.toCharArray()) {
      System.out.println("hey"+letter);
      }
    System.out.println(Reverse("Sadeeq"));
    String myText = "this is a sample text for test";
    System.out.println(myText.substring(5,16));
    System.out.println(timeString(8, 11));
    //Wrapper classes are methods that are available for primitive data types
    //E.g long Short Boolean and Int
    String str = "1234";
    int num = Integer.parseInt(str);
    System.out.println(num);
    // you can still convert it to string using the Integer.toString(num); method
    //double methods
    double decimalNum = Double.parseDouble(str); // thee arguments can only be a string
    System.out.println(decimalNum);

  }
}
