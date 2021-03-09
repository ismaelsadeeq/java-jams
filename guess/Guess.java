import java.util.Random;
import java.util.Scanner;
public class Guess {

  public static boolean guess(int a){
    Random random = new Random();
    int number = random.nextInt(10) + 1;
    System.out.println("Your guess is : "+a);
    System.out.println("my guess is : "+number);
    if(number == a){
      System.out.println("Congratulations You win");
      return false;
    }else if(number > a){
      System.out.println("I win");
      int low = number -a;
      System.out.println("you are low by : "+low);
      return false;
    }else if(number<a){
      System.out.println("I win");
      int off = a-number;
      System.out.println("you are off by : "+off);
      return false;
    }
    return false;
  }
  
  public static void main(String[] args){
    boolean status = true;
    int win = 0;
    int lost = 0;
    while(status == true){
      System.out.println("I ' m thinking of a number between 1 and 10");
      System.out.println("Can you guess what it is?");
      Scanner num = new Scanner(System.in);
      System.out.print("Type a number \n");
      int number = num.nextInt();
      num.nextLine();
      boolean game = guess(number);
      if(game){
        System.out.println("do you want to play again:");
        // num.nextLine();
        String play = num.nextLine();
        if(play.equals("yes")){
          win =+1;
          status = true;
        }else{
          win=+1;
          System.out.println("you win : "+win+" times and lost : "+lost+" times");
          status = false;
        }
      }else{
        System.out.println("do you want to play again:");
        String play = num.nextLine();
        if(play.equals("yes")){
          lost +=1;
          status =  true;
        }else{
          lost+=1;
          System.out.println("you win : "+win+" times and lost : "+lost+" times");
          status = false;
        }
      }
    }
  }
}
