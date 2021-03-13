import java.util.Arrays;
import java.util.Random;

public class MyArray{

	/**
	*This method creates a random array of integers
	*@param size is the size of the array to becreated.
	*@return Array of integers created
	*/	
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    /**
	*This method uses linear search to find an element in an array of numbers.
	*@param a is the array.
	*@param target is the element we are looking for.
	*@return The index of the element in the array.
	*/
    public static int search(double[] a, double target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
	*This method counts the number of elements within a certain range in an array of integers.
	*@param a is the array.
	*@param low is the minimum value in the range.
	*@param a is the maximum value in the range.
	*@return The index of the item in the array.
	*/
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }


	public static void main(String[] args){
		int size=20;
        int [] arr= randomArray(size); //create the random array
        System.out.print("Array generated: ");
        System.out.println(Arrays.toString(arr));

        //display the frequency of values in the range 70 to 100
        System.out.println("Number of elements between 70 and 100: "+ inRange(arr,70,100));

        //create an array that shows the frequency of each value
        int[] counts = new int[100];
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            counts[index]++;
        }

        System.out.println("Number of times 86 appears: "+ counts[86]);

	}
}