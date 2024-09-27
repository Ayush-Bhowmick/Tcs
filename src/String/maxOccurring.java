package String;
import java.util.*;
public class maxOccurring {

    public static char maxOccurring(String str){
        int[] freq=new int[256];
//traversing it
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max_freq=-1;
        char end_result= 0 ;

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max_freq){
                max_freq= freq[str.charAt(i)] ;
                end_result= str.charAt(i);
            }
        }
        return end_result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string ");
        String string = sc.nextLine();
        System.out.println( maxOccurring(string));

    }
}

//Enter the string
//geeksforgeeks
//e


//int[] freq = new int[256]; We create an array freq of size 256 to store the frequency of all possible ASCII characters
// . Each index in this array represents a character (based on its ASCII value), and the value at that index represents
// the frequency of that character in the input string.
//
//str.charAt(i): This method is used to get the character at position i in the string str. We use it to increment
// the frequency count for that character.
//
//Finding the maximum frequency:
//
//We initialize maxFreq to -1 and result to ' '.
//Then, we iterate through the string again, checking if the frequency of the current character is greater than maxFreq.
// If it is, we update maxFreq and store the corresponding character in result.
//Return result: After processing the string, the result variable will contain the character with the highest frequency.
