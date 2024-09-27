package array;
import java.util.*;
public class equillibrium {
    static int equilibrium(int[] arr,  int n){
        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum

        //sum of the whole array
        for (int i = 0; i < n; i++) {
            sum +=arr[i];
        }

        for (int i = 0; i < n; i++) {
            sum -= arr[i]; // whole value of array theke ekta kore minus right er sum er jnne

            if (leftsum == sum) {
                return i;
            }
            leftsum += arr[i];
        }
    return -1;
    }


    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        System.out.println("enter the no of element ");
         int n=sc.nextInt();
         int[] ans = new int[n];
        System.out.println("enter the elements:  ");
        for (int i = 0; i < n; i++) {
            ans[i] = sc.nextInt();
        }
        System.out.println("The equilibrium index is " + equilibrium(ans ,n));
    }
}
//Output
//enter the no of element
//6
//enter the elements:
//1 7 3 6 5 6
//The equilibrium index is 3

//APPROACH
//The idea is to get the total sum of the array first.
//Then Iterate through the array and keep updating the left sum which is initialized as zero.
//In the loop, we can get the right sum by subtracting the elements one by one.
//Initial State:
//
//sum = 28 (total sum of array)
//leftsum = 0 (initially no elements are on the left)
//Iteration 1 (i = 0):
//
//sum -= arr[0] → sum = 28 - 1 = 27 (this is now the sum of elements on the right side of index 0)
//Compare leftsum (0) with sum (27) → Not equal, so no equilibrium here.
//Update leftsum → leftsum += arr[0] → leftsum = 0 + 1 = 1.
//Iteration 2 (i = 1):
//
//sum -= arr[1] → sum = 27 - 7 = 20 (sum of elements on the right side of index 1)
//Compare leftsum (1) with sum (20) → Not equal, so no equilibrium here.
//Update leftsum → leftsum += arr[1] → leftsum = 1 + 7 = 8.
//Iteration 3 (i = 2):
//
//sum -= arr[2] → sum = 20 - 3 = 17 (sum of elements on the right side of index 2)
//Compare leftsum (8) with sum (17) → Not equal, so no equilibrium here.
//Update leftsum → leftsum += arr[2] → leftsum = 8 + 3 = 11.
//Iteration 4 (i = 3):
//
//sum -= arr[3] → sum = 17 - 6 = 11 (sum of elements on the right side of index 3)
//Compare leftsum (11) with sum (11) → They are equal!
//Since leftsum is equal to sum, index 3 is the equilibrium index.
