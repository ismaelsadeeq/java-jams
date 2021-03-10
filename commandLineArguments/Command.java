import java.util.Arrays;

public class Command {
  public static void main(String[] args){
    System.out.println(Arrays.toString(args));
    int max = Integer.MAX_VALUE;
    for(String arg:args){
      int value = Integer.parseInt(arg);
      if(value>max){
        max = value;
      }
    }
    System.out.println("the maximum value is :"+max);
    System.out.print("aasdedd"+'3');
  }
}
