//you are a hiking trail representing by an array A of length N
// where trail initially asends and desends forming single peek
// your task to find and return the integer value representing the elevation of the summit
package array;
import java.util.*;
public class A1 {
    public static int highestPeak(int[] A){
         int left=0;
         int right= A.length-1;

        while(left < right) {

             int mid= left+(right-left)/2;

            if (A[mid] < A[mid+1]) {
                  left=mid+1;
            }else {
                right=mid;
            }
        }
        return A[left];

    }
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        System.out.println("Enter the n Elements ");
                 int n =sc.nextInt();
                 int[] arr = new int[n];
                System.out.println("Enter the elemenets ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
        System.out.println("the highest peak "+highestPeak(arr));
    }
}
