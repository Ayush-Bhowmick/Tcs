package array;
import java.util.*;
 public class mat_add {

     static void printArray(int[][] matrix){
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 System.out.print(matrix[i][j]+" ");
             }
             System.out.println();
         }

     }
     static void addMat( int[][] mat1, int r1,int c1, int[][] mat2, int r2, int c2){
         if (r1 != r2 || c1 != c2 ) {
             System.out.println("Wrong input");
          return;
         }
         int[][] sum = new int[r1][c1];
         for (int i = 0; i < r1; i++) {
             for (int j = 0; j < c1; j++) {
                 sum[i][j] += mat1[i][j] + mat2[i][j];
             }
         }
         printArray(sum);
     }
     public static void main(String[] args) {
         Scanner  sc= new Scanner(System.in);
         System.out.println("Enter the r1- ");
         int r1= sc.nextInt();
         System.out.println("Enter the c1- ");
          int c1=sc.nextInt();

          System.out.println("Enter the "+ r1*c1 + "elements- ");
         int[][] mat1 = new int[r1][c1];
          for (int i = 0; i < r1; i++) {
             for (int j = 0; j < c1; j++) {
                 mat1[i][j] = sc.nextInt();
             }
         }

          System.out.println("Enter the r2- ");
           int r2=sc.nextInt();
         System.out.println("Enter the c2- ");
          int c2=sc.nextInt();

         System.out.println("Enter the " + r2*c2 + " elements- ");
         int[][] mat2= new int[r2][c2];
         for (int i = 0; i < r2; i++) {
             for (int j = 0; j < c2; j++) {
                 mat2[i][j] = sc.nextInt();
             }
         }
         System.out.println("Matrix 1- ");
         printArray(mat1);
         System.out.println("Matrix 2- ");
         printArray(mat2);
         System.out.println("Addition of two matrices is -  ");
         addMat(mat1, r1, c1, mat2, r2, c2);

     }
}
//output

//Enter the r1-
//2
//Enter the c1-
//2
//Enter the 4elements-
//1 2
//3 4
//Enter the r2-
//2
//Enter the c2-
//2
//Enter the 4 elements-
//1 2
//3 4
//Matrix 1-
//1 2
//3 4
//Matrix 2-
//1 2
//3 4
//Addition of two matrices is -
//2 4
//6 8
//
//Process finished with exit code 0
