import java.util.Arrays;
public class Flow {
  public static  String newLine(String times) {
    System.out.println(times);
    return "hsjccdcj";
  }
  public static void threeLine(){ 
    // newLine();
    // newLine();
    // newLine();
  }
  public static String loops(){
    int i = 1;
    while (i<10) {
      double x = i;
      System.out.println(x + " " + Math.log(x));
      i = i *2;
    }
    return "done";
  } 
  public static String newLine(String times,int number){
    return "";
  }
  public static void main(String[] args) {
    System.out.print(Arrays.toString(args));
    String name = "sadeeq";
    System.out.println("First line.");
    System.out.println();
    newLine(name);
    newLine("hasheem");
    System.out.println("Second line.");
    newLine("ssdf",22);
    System.out.println(System.out);
    loops();
    int size =5;
    int[] names;
    names = new int[5];
    int[] counts;
    double[] values;
    counts = new int[4];
    values = new double[size];
  }
}