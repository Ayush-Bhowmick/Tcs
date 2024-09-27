package array;
import java.util.*;
public class zerosAtEnd {

    public static void zerosAtEnd(int[] arr){
        int nonZeros= 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
            arr[nonZeros++] = arr[i];
            }
        }
        while(nonZeros< arr.length){
            arr[nonZeros++] = 0;
        }
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
        zerosAtEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
//Enter the n Elements
//12
//Enter the elements
// 1 0 3 4 6 8 0 4 0 3 2 6
//[1, 3, 4, 6, 8, 4, 3, 2, 6, 0, 0, 0]
