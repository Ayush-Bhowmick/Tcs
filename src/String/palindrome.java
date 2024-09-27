package String;
import java.util.*;
public class palindrome {
    static boolean Palindrome(String str){
        int i = 0;
        int j = str.length() -1;

        while (i<j){
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        if (Palindrome(str)){
            System.out.println("palindrome " + str);
        }else {
            System.out.println(" not a palindrome " + str);
        }
    }
}
//Enter the String
//abcba
//palindrome abcba
