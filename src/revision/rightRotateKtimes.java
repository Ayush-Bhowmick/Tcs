package revision;
import java.util.*;

public class rightRotateKtimes {
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] rotateByKTimes(int[] arr,  int k){ //2 3 4 5 6
         int n= arr.length;
         k=k%n;// to cater the rotation greater than n or equal to n
        int[] ans= new int[n];
         int j=0;

        for (int i = n-k; i < n; i++) { // 4 5 6
            ans[j++]=arr[i]; //update korchi karon pechon er er elements gulo agey bhora holo
        }
        for (int i = 0; i < n-k; i++) { // niye bki ta bhorchi // 2 3
            ans[j++]= arr[i];
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements ");
        int n = sc.nextInt();
         int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("no of right rotation ");
         int k=sc.nextInt();
        System.out.println("original array");
        display(arr);
        int[] ans =rotateByKTimes(arr, k);
        System.out.println( k + " times right rotated array is ");
        display(ans);
    }
}
//
//Enter the no of elements
//5
//Enter the elements
//2 3 4 5 6
//no of right rotation
//3
//original array
//2 3 4 5 6
//3 times right rotated array is
//4 5 6 2 3
//
//Process finished with exit code 0
//Process finished with exit code 0
