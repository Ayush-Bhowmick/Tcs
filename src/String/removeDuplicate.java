package String;
import java.util.*;
public class removeDuplicate {
    public static String removeDuplicate(String str){

        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String sb= new String(ch);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
             int count = 1 ;// because we want to count the first occurrence of the character before checking
            // for duplicates.
            while (i< sb.length()-1 && sb.charAt(i) == sb.charAt(i+1)){// working with the sorted string sb
                count++;
                i++;
            }

            if (count == 1) {//If a character appears only once (i.e., count == 1),
                // it is appended to the StringBuilder result.
                result.append(sb.charAt(i));
            }
        }


        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(removeDuplicate(str));
    }
}

//geeksforgeeks
//        for
