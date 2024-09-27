package String;
import java.util.*;
public class RemoveCharAt_i {
    public static String removeChar(String str, int index){
        if (index >= 0 && index < str.length()) {
            StringBuilder sb = new StringBuilder(str);
            System.out.println("removed element " + sb.charAt(index));
            sb.deleteCharAt(index);
           return sb.toString();
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        System.out.println("enter the index ");
         int n=sc.nextInt();

        String ch= removeChar(str,n);
        System.out.println(ch);
    }
}
//output
//Enter the String
//asdfghjuytgfvbnm,
//enter the index
//8
// removed element y
//asdfghjutgfvbnm,
