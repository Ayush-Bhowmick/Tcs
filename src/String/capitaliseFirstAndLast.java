package String;
import java.util.*;
public class capitaliseFirstAndLast {
    public static String capitaliseFirstAndLast(String str){
        char[] ch =str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int k =i;//The variable k is initialized to store the index of the first character of the current word.
            while (i < ch.length && ch[i] !=' ' ) {//it stops when a space ' ' is found or when the end of the string is reached
                i++;
            }
            if (ch[k] >='a' && ch[k]<='z'){
                ch[k]= (char) ((int)ch[k]-32);
            }else {
                ch[k]= (char) ((int)ch[k]);
            }


            if(ch[i-1] >='a' && ch[i-1] <='z'){
                ch[i-1]= (char)((int)ch[i-1]-32);//After subtracting 32 from the integer value,
                // you cast the result back to a char using (char).
            }else {
                ch[i-1]= (char)((int)ch[i-1]);
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String  ");
        String str= sc.nextLine();
        System.out.println(capitaliseFirstAndLast(str));

    }
}
//Enter the String
//asdf cvghu bnjko
//AsdF CvghU BnjkO


//This Java program capitalizes the first and last character of each word in a given string.
// Let's go through the program step by step to understand how it works.
//
//1. Class Definition:
//2. FirstAndLast Method:
//static String FirstAndLast(String str)
//This method takes a string (str) as input and returns a new string where the first and last characters of each word
// are capitalized.
//3. Converting the String to a Character Array:
//char[] ch = str.toCharArray();
//The method first converts the input string str into a character array ch. This allows easy manipulation of individual
// characters since strings in Java are immutable (they cannot be changed directly).
//4. Iterating Over the Character Array:
//java
//Copy code
//for (int i = 0; i < ch.length; i++) {
//A for loop is used to iterate through each character in the array ch.
//5. Finding the First and Last Characters of Each Word:
//java
//Copy code
//int k = i;
//while (i < ch.length && ch[i] != ' ')
//    i++;
//The variable k is initialized to store the index of the first character of the current word.
//The while loop continues to increment i until it reaches the end of the current word
// (i.e., it stops when a space ' ' is found or when the end of the string is reached).
//Thought Process:
//k marks the position of the first character of the word.
//i will eventually point to the space after the last character of the word or the end of the string.
//6. Capitalizing the First Character of the Word:
//java
//Copy code
//ch[k] = (char)(ch[k] >= 'a' && ch[k] <= 'z'
//            ? ((int)ch[k] - 32)
//            : (int)ch[k]);
//This line checks if the first character (ch[k]) is a lowercase letter (a-z).
//If the character is lowercase, it is converted to uppercase by subtracting 32 from its ASCII value
// (since the ASCII value of lowercase letters is 32 more than their uppercase equivalents).
//Thought Process:
//The program ensures that if the first letter is a lowercase letter, it will be capitalized.
// If it is already uppercase, no change is made.
//7. Capitalizing the Last Character of the Word:
//java
//Copy code
//ch[i - 1] = (char)(ch[i - 1] >= 'a' && ch[i - 1] <= 'z'
//            ? ((int)ch[i - 1] - 32)
//            : (int)ch[i - 1]);
//i - 1 represents the index of the last character of the current word (since i points to the space or end of
// the string after the word).
//Similar to the first character, it checks if the last character is lowercase and capitalizes
// it if necessary by converting its ASCII value.
//Thought Process:
//This step ensures that the last character of each word is capitalized, if needed.
//8. Loop Continues for Each Word:
//The for loop continues to the next word by finding the next non-space character and repeating the process of
// capitalizing the first and last characters of the word.
//9. Returning the Modified String:
//java
//Copy code
//return new String(ch);
//After processing the entire string, the modified character array ch is converted back into a string using
// new String(ch) and returned as the result.
//Driver Code (main method):
//java
//Copy code
//public static void main(String args[])
//{
//    String str = "Geeks for Geeks";
//    System.out.println(str);
//    System.out.println(FirstAndLast(str));
//}
//The string "Geeks for Geeks" is passed to the FirstAndLast method.
//The method returns the new string with the first and last characters of each word capitalized, and the result is printed.
//Output:
//rust
//Copy code
//Geeks for Geeks
//GeekS FoR GeekS
//Input: "Geeks for Geeks"
//Output: "GeekS FoR GeekS"
//The first and last characters of each word are capitalized:
//"Geeks" becomes "GeekS"
//"for" becomes "FoR"
//"Geeks" becomes "GeekS"
//How the Code Works:
//The string is converted into a character array for easy manipulation.
//The program iterates over the characters, identifying the start (k) and end (i - 1) of each word.
//It capitalizes the first and last characters of each word (if they are lowercase).
//The modified character array is converted back to a string and returned.
//Key Points:
//Efficient Word Traversal: The program finds each word by looking for spaces (' '), which serve as delimiters between words.
//ASCII Conversion: The program uses ASCII arithmetic to convert lowercase letters to uppercase
// by subtracting 32 from their ASCII value.
//
//
//
//
//
//You said:
//ch[k] = (char)(ch[k] >= 'a' && ch[k] <= 'z'
//            ? ((int)ch[k] - 32)
//            : (int)ch[k]);
//ch[i - 1] = (char)(ch[i - 1] >= 'a' && ch[i - 1] <= 'z'
//            ? ((int)ch[i - 1] - 32)
//            : (int)ch[i - 1]);
//convert it into if-else statement
//ChatGPT said:
//ChatGPT
//The ?: operator (also known as the ternary operator) can be replaced with an if-else statement to make
// the code more explicit.
//
//Here's how the two lines can be rewritten using if-else statements:
//
//First Line:
//java
//Copy code
//if (ch[k] >= 'a' && ch[k] <= 'z') {
//    ch[k] = (char)((int)ch[k] - 32);
//} else {
//    ch[k] = (char)(int)ch[k];
//}
//Second Line:
//java
//Copy code
//if (ch[i - 1] >= 'a' && ch[i - 1] <= 'z') {
//    ch[i - 1] = (char)((int)ch[i - 1] - 32);
//} else {
//    ch[i - 1] = (char)(int)ch[i - 1];
//}
//Explanation:
//In each case, the ternary condition condition ? true_value : false_value is converted into a standard if-else structure.
//If the character is a lowercase letter (i.e., ch[k] >= 'a' && ch[k] <= 'z'), it gets converted to uppercase
// by subtracting 32 from its ASCII value.
//Otherwise, it remains unchanged in the else part.
//
//
//
//
//
//You said:
//  ch[i - 1] = (char)((int)ch[i - 1] - 32); explain the syntax and the concept about it
//ChatGPT said:
//ChatGPT
//The line of code:
//
//java
//Copy code
//ch[i - 1] = (char)((int)ch[i - 1] - 32);
//is converting the character at index i - 1 (which is the last character of a word) to uppercase, but it's using some
// specific casting techniques to do so. Let's break down the syntax and concept involved:
//
//1. ch[i - 1]
//ch is a character array, and i - 1 accesses the last character of the current word in the loop.
//So, ch[i - 1] refers to the character at the last index of the current word.
//2. (int)ch[i - 1]
//This part casts the character to its integer (ASCII) value.
//Every character in Java has a corresponding ASCII code. For example, 'a' has an ASCII value of 97, and 'A' has an
// ASCII value of 65.
//By casting the character to int, you're working directly with its ASCII value.
//3. - 32
//Subtracting 32 from the ASCII value of a lowercase letter converts it to its uppercase equivalent.
//In the ASCII table, the uppercase letters (A-Z) are 32 values lower than their lowercase counterparts (a-z). For example:
//ASCII value of 'a' = 97
//ASCII value of 'A' = 65
//97 - 32 = 65, which is the ASCII value for 'A'.
//4. (char)
//After subtracting 32 from the integer value, you cast the result back to a char using (char).
//This converts the adjusted integer (ASCII value of the uppercase letter) back into its character representation.
//Putting It Together:
//ch[i - 1] = (char)((int)ch[i - 1] - 32); means:
//Convert the character at index i - 1 to its ASCII value.
//Subtract 32 from the ASCII value (if it's a lowercase letter).
//Convert the result back to a character, which is now the uppercase version.
//Assign the uppercase character back to ch[i - 1].
//Example:
//If the last character of the word is 'z':
//
//The ASCII value of 'z' is 122.
//Subtracting 32 gives 90, which is the ASCII value for 'Z'.
//Cast 90 back to char, which results in 'Z'.
