package revision;
import java.util.*;
public class secondLargestElement {
    static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int largestNo(int[] arr){
         int mx= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx){
                mx= arr[i];
            }
        }
        return mx;
    }
    static int secondLargestNo(int[] arr){
        int mx= largestNo(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== mx){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        int secondMax= largestNo(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n Elements ");
                 int n =sc.nextInt();
                 int[] arr = new int[n];
                System.out.println("Enter the elements ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
        System.out.println("Second largest no is  "+ secondLargestNo(arr));


    }
}
//Enter the n Elements
//5
//Enter the elements
//2 3 4 5 6
//Second largest no is  5
