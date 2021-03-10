import java.util.Arrays;
import java.util.Random;
//copy of util class
//traversing of array
//random
//pseudo random
public class ArrayOperations {
  
 public static int[] Array(int a){
   int [] arr ;
   arr= new int[a];
   for(int i=1; i<a;i++){
      arr[i] = i;
     System.out.println(arr[i]);
   }
   return  arr;
   
 }
 public static int[] randomArray(int size){
   Random rand = new Random();
   int[] a= new int[size];
   for(int i=0;i<size;i++){
     a[i] = rand.nextInt();
   }
   return a;
 }
  public static int search(double[] a, double target) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == target) {
        return i;
      }
    }
    return -1;
  }
  public static int inRange(int[] a, int low, int high) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] >= low && a[i] < high) {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int[] myArray = {1,2,3,4,5};
    System.out.println(myArray[1]);
    System.out.println(Arrays.toString(Array(5)));
    int [] arrLoops;
    arrLoops= new int[10];
    for(int i=0; i<arrLoops.length;i++){
      arrLoops[i]= i;  
    }
   
    for(int value:arrLoops){
      System.out.println(value);
    }
    System.out.print(randomArray(5));
    System.out.println(Arrays.toString(arrLoops));
    //copying the value of an array\
    double[] a = new double[3];
    for(int i =0;i<a.length;i++){
      a[i]=i+1.0;
    }
    // double[] b = a; // this doesnt create a new array rather reference the array to the reference of array b i.e if i change any array elemet of b it  affect a likewise a
    //the alternative to the above way is either loop through array a and copy each element and insert to b or use the java.util copyOf method
    double[] b = new double[3];
    for (int i = 0; i < 3; i++) {
      b[i] = a[i];
    }  
    double[] d = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      d[i] = a[i];
    }
    //or
    double[] c = Arrays.copyOf(a, 3);
    //looping through each element of array is called traversal
    System.out.println(search(a, 3.0));

  }
}
