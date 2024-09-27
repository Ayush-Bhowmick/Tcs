package array;
import java.util.*;

public class uniquePth {

    public static int uniquePath(int m , int n){
        int[][] up = new int[m][n];

        for (int i = 0; i < m; i++) {
            up[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            up[0][j]= 1;
        }

        for (int i = 1; i < m ; i++) {
            for (int j = 1; j < n; j++) {
                up[i][j]= up[i-1][j] + up[i][j-1];
            }
        }
        return up[m-1][n-1];
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
         int m =sc.nextInt();
         int n =sc.nextInt();
        System.out.println("no.of unique ways of "+ m +"X"+ n +" "+uniquePath(m,n));
    }
}
//3
//7
//no.of unique ways of 3X7 28
