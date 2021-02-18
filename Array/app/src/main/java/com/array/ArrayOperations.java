package com.array;
import java.util.Arrays;
import java.util.Random;
//copy of util class
//traversing of array
//random
//pseudo random
public class ArrayOperations {
  
 public static int[] Array(int a){
   int i;
   int [] arr ;
   arr= new int[a];
   for(i=1;i<a ;i++){
   
     arr[i] = arr[i];
     System.out.print(arr[i]);
   }
   return  arr;
   
 }
 public static int[] randomArray(int size){
   Random rand = Random.ints();
   int[] a= new int[size];
   for(int i=0;i<size;i++){
     a[i] = rand.nextInt();
   }
   return a;
 }
  public static void main(String[] args) {
   System.out.print(Arrays.toString(Array(5)));
   int [] arrLoops;
   arrLoops= new int[10];
   for(int i=0; i<arrLoops.length;i++){
     arrLoops[i]+=5;
     
   }
   
  for(int value:arrLoops){
     arrLoops[]+=5;
     
   }
   System.out.print(randomArray(5));
   System.out.print(Arrays.toString(arrLoops));
  }
}
