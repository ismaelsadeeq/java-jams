import java.util.Arrays;

public class OurArray{
	public static void main(String[] args){
		int [] arr;
        int [] values;
        arr=new int[5];
        values= arr;
        arr[0]=3;
        arr[4]=16;
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            arr[i] +=5;
        }

        // For each does not modify the array, that's why our vales do not change
        // It can only traverse the array and access each element
        for(int value: values){
            value +=10;
        }

        System.out.println(Arrays.toString(arr));
       
	}
}