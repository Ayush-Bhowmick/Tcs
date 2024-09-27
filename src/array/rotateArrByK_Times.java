//rotate the array by K times like by 2 arr-1 2 3 4 5 will be  4 5 1 2 3

package array;
import java.util.Scanner;

public class rotateArrByK_Times {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static int[] rotateByK( int[] arr,  int k){
        int n = arr.length;
         k= k % n; //no of rotation
        int[] ans = new int[n];
        int j = 0;

        for (int i = n-k; i < n; i++) {
//            System.out.println(arr[i]+" "); fault correction update kor
            ans[j++]= arr[i]; //update answer array // agey pechoner er ta k bhorchiii array te
        }
        for (int i = 0; i < n-k; i++) {
//            System.out.println(arr[j]+" "); fault correction update kor
            ans[j++]= arr[i]; //update answer array // niye samner ta k
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of Elements ");
                 int n =sc.nextInt();
                 int[] arr = new int[n];
                System.out.println("Enter the elemenets ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("Enter k");
                int k= sc.nextInt();

        System.out.println("Original array: ");
        printArray(arr);
        System.out.println();
        int[] ans =  rotateByK(arr , k);
        System.out.println("Array after Rotation : ");
        printArray(ans);
    }
}
//output
//Enter the no of Elements
//5
//Enter the elemenets
//1 2 3 4 5
//Enter k
//2
//Original array:
//1
//2
//3
//4
//5
//
//Array after Rotation :
//4
//5
//1
//2
//3
//
//Process finished with exit code 0
