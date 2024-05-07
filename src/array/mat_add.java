package array;
import java.util.*;
public class mat_add {
    
    static void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
        System.out.println();
    }
    static void add(int[][] mat1, int r1, int c1, int[][] mat2, int r2, int c2){
        if (c1 != c2 || r1!=r2) {
            System.out.println("WRONG INPUT");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of r1- ");
        int r1 = sc.nextInt();
        System.out.print("Enter the c1- ");
        int c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];
        System.out.println("ENTER THE "+ r1*c1+" no of element");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the no of r2- ");
        int r2 = sc.nextInt();
        System.out.print("Enter the c2- ");
        int c2 = sc.nextInt();
        int[][] mat2 = new int[r2][c2];
        System.out.println("ENTER THE "+ r1*c1+" no of element");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
    }
}
