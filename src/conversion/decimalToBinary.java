package conversion;
import java.util.*;

public class decimalToBinary {
    public static String binary(int n){
        StringBuilder sb = new StringBuilder();

        if (n == 0) {
            return "0";
        }

        while (n>0){
            int lastDigit = n%2;
            sb.append(lastDigit);
            n=n/2;
        }
        return sb.reverse().toString();

    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         System.out.println(binary(n));
    }
}
//169
//10101001
