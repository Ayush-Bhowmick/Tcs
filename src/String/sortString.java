package String;
import java.util.*;
public class sortString {
    public static String sortString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.print( String.valueOf(chars) +" ");
        return str;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String str= sc.nextLine();
        sortString(str);
    }
}
//Enter the String
//asdfgtyhjmnbvcfrtyuikjn
//abcdffghijjkmnnrsttuvyy
//Process finished with exit code 0
