package String;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.*;
public class smallestAndLargestWord {
    public static void findSmallestAndLargest(String str){
        String[] words= str.trim().split("\\s+");

        String smallestWord= words[0];
        String largestWord= words[0];


        for (String word:words) {
            if (word.length() < smallestWord.length() ) {
                smallestWord=word;
            }
            if (word.length() > largestWord.length()) {
                largestWord=word;
            }
        }
        System.out.println("Smallest Word " + smallestWord);
        System.out.println("Largest Word "  + largestWord );
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();
        findSmallestAndLargest(str);
    }

}
//output
//enter the string
//GeeksforGeeks A Computer Science portal for Geeks
//Smallest Word A
//Largest Word GeeksforGeeks
