package numberSeries;
import java.util.*;
public class primeNumber {
    public static boolean isPrime(int num){
        if (num == 2) {
            return true;
        }
        if (num <= 1) {
            return false;
        }
        if (num %2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the range starting from ");
         int a =sc.nextInt();
        System.out.println("to ");
         int b =sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i +" ");
            }
        }

    }
}
//enter the range starting from
//7
//to
//36
//7 11 13 17 19 23 29 31
