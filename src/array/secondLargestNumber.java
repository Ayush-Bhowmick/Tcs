package array;
import java.util.Scanner;
public class secondLargestNumber {
    static int largestno(int[] arr){
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }
   static int secondLargest(int[] arr){
        int mx= largestno(arr);
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == mx) {
               arr[i]=Integer.MIN_VALUE;
           }
       }
       int secondMax=largestno(arr);
       return secondMax
   }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    }
}
