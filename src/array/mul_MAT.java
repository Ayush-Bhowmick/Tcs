package array;
import java.util.*;
public class mul_MAT {
    static void printMat(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multiply(int[][] matrix1, int r1, int c1, int[][] matrix2, int r2, int c2){
        if (r1 != c2 || r2 != c1) {
            System.out.println("Wrong Input");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] = matrix1[i][k] * matrix2[k][j] ;
                }
            }
        }
        System.out.println("MULTIPLICATION OF 2 MATRICES-  ");
        printMat(mul);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the no of rows 1 -  ");
                 int r1=sc.nextInt();
        System.out.println("enter the no of columns 1- ");
                 int c1=sc.nextInt();
                 int[][] matrix1 =new int[r1][c1];
                 System.out.println("Enter the "+ r1*c1  +" elements ");
                 for (int i = 0; i < r1; i++) {
                     for (int j = 0; j < c1; j++) {
                         matrix1[i][j] = sc.nextInt();
                     }
                 }
        System.out.println("Enter the no of rows 2 -  ");
                          int r2=sc.nextInt();
        System.out.println("Enter the no of columns 2- ");
                          int c2=sc.nextInt();
                          int[][] matrix2 =new int[r2][c2];
                          System.out.println("Enter the "+ r2*c2  +" elements ");
                          for (int i = 0; i < r2; i++) {
                              for (int j = 0; j < c2; j++) {
                                  matrix2[i][j] = sc.nextInt();
                              }
                          }

        System.out.println("Matrix 1");
                          printMat(matrix1);
        System.out.println("Matrix 2");
        printMat(matrix2);
        multiply(matrix1, r1, c1, matrix2, r2, c2);
    }
}
//output

//Enter the no of rows 1 -
//2
//enter the no of columns 1-
//2
//Enter the 4 elements
//2 3
//4 5
//Enter the no of rows 2 -
//2
//Enter the no of columns 2-
//2
//Enter the 4 elements
//2 3
//4 5
//Matrix 1
//2 3
//4 5
//Matrix 2
//2 3
//4 5
//MULTIPLICATION OF 2 MATRICES-
//12 15
//20 25
//
//Process finished with exit code 0
