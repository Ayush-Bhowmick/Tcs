package array;

import java.util.*;
public class rotate90 {

    static void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap(int[][] matrix,  int i, int j){
        int temp = matrix[i][j];
        matrix[i][j]= matrix[j][i];
        matrix[j][i]=temp;
    }
    static void transpose(int[][] matrix,int r,  int c){
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) { // j=1 oo cholbe
                swap(matrix,i,j);
            }
        }
    }
    static void reverseArray(int[] arr){
        int i = 0,j=arr.length -1;
        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate90degree(int[][] matrix,int n){
        //n stands for last number in mat r iterate korte hbe  , r=n , c=n
        transpose(matrix, n, n);
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }
        printArray(matrix);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the no of rows1 -  ");
                 int r1=sc.nextInt();
        System.out.println("Enter the no columns1  - ");
                 int c1=sc.nextInt();
                 int[][] matrix1 =new int[r1][c1];
                 System.out.println("Enter the "+ r1*c1  +" elements ");
                 for (int i = 0; i < r1; i++) {
                     for (int j = 0; j < c1; j++) {
                         matrix1[i][j] = sc.nextInt();
                     }
                 }
        System.out.println("Enter the no of rows2- ");
              int r2=sc.nextInt();
        System.out.println("Enter the no of columns2- ");
          int c2=sc.nextInt();
          int[][] matrix2= new int[r2][c2];
        System.out.println("Enter the "+ r2*c2  +" elements ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix1- ");
        printArray(matrix1);
        System.out.println("rotated matrix - ");;
        rotate90degree(matrix1, r1);
        System.out.println();
        System.out.println("matrix2- ");
        printArray(matrix2);
        System.out.println("rotated matrix - ");;
        rotate90degree(matrix2, r2);

    }

}
//output
//Enter the no of rows1 -
//2
//Enter the no columns1  -
//2
//Enter the 4 elements
//2 3
//5 6
//Enter the no of rows2-
//3
//Enter the no of columns2-
//3
//Enter the 9 elements
//2 3 4
//4 5 6
//5 6 7
//matrix1-
//2 3
//5 6
//rotated matrix -
//5 2
//6 3
//matrix2-
//2 3 4
//4 5 6
//5 6 7
//rotated matrix -
//5 4 2
//6 5 3
//7 6 4
//
//Process finished with exit code 0
