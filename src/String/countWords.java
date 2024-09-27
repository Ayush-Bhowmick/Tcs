package String;
import java.util.*;
public class countWords {
    public static  int countWords(String str){
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String str= sc.nextLine();
        System.out.println("No of words in the given sentence " +countWords(str));
    }
}
//Enter the String
//How are you my friend
//No of words in the given sentence 5
