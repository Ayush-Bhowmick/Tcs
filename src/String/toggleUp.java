package String;
import java.util.*;
public class toggleUp {
    public static void toggleUp(String str){

        String x = " ";
        for (int i = 0; i < str.length(); i++) {
           char ch= str.charAt(i);
            if (Character.isUpperCase(ch)) {
                x+= Character.toLowerCase(ch);
            }else {
                x+= Character.toUpperCase(ch);
            }
        }
        System.out.print(x);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String str= sc.nextLine();
        toggleUp(str);
    }
}
//Enter the String
//ASDFasdfghjklMNBV
// asdfASDFGHJKLmnbv
//Process finished with exit code 0
