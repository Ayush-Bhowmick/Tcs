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
