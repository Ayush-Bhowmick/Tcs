package array;
import java.util.*;
public class nonRepeatingElement {
    static  int firstOccurence(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j=0;
            for ( j = 0; j < arr.length; j++) {
                if (i!=j && arr[i]==arr[j]){//i != j ensures that the element is not being compared with itself.
                                            // arr[i] == arr[j] checks if the element at index i is equal to the element
                    // at index j.

                    break;//If both conditions are true,
                    // it means a duplicate is found, and the loop breaks (exits) since there's no need to keep checking
                    // further
                }
            }
            if(j==arr.length){ //checks if the inner loop finished without breaking early,
                // which means the element arr[i] is not found elsewhere in the array.
               // If true, it returns the non-repeating element arr[i]
                return arr[i];
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements ");
         int n=sc.nextInt();
         int[] arr= new int[n];
        System.out.println("enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("the first non repeating element is " + firstOccurence(arr));
    }
}
//Enter the no of elements
//5
//enter the elements
//1 2 3 2 1
//the first non repeating element is 3
