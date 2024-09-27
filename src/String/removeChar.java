package String;
import java.util.*;
public class removeChar {
    static String removeCharacters(String str, String chStr){
        for (int i = 0; i < chStr.length(); i++) {
            char ch= chStr.charAt(i);
            while (str.contains(ch+"")){
                 str= str.replace(ch+"" ,"");
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string ");
        String str=  sc.nextLine();
        System.out.println("enter the characters to me removed ");
        String chStr= sc.nextLine();
        System.out.println("after removing the characters ");
        System.out.println( removeCharacters(str,chStr));
    }
}
//Enter the first string 
//asdfghjkl
//enter the characters to me removed
//asdfg
//after removing the characters
//     hjkl
