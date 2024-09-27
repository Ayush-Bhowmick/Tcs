package conversion;
import java.util.*;
public class BinaryToDecimal {

    public static int binaryToDecimal(int n){
        int num = n;
        int decimalNumber = 0;
        int base =1;
        int temp =num;

        while(temp > 0){
         int lastDigit = temp%10;

         decimalNumber += lastDigit*base;
         base = base * 2;

         temp= temp/10;
        }
        return decimalNumber;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int n = sc.nextInt();
        System.out.println( binaryToDecimal(n));
    }
}
//    Enter the number
//        10101001
//    Decimal number
//        169
