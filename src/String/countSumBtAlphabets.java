//Java program to calculate sum of all numbers present
// in a string containing alphanumeric characters
package String;
import java.util.*;
public class countSumBtAlphabets {
    public static int countSumBtAlphabets(String str){

        //This is a temporary string that accumulates digits as we traverse through the characters in the input string.
        // It starts as "0" to handle cases where no digits are found in the beginning.
       String tempo ="0";

       //sum = 0: This integer variable stores the cumulative sum of all the numbers found in the input string.
        int sum=0;

//The idea is to inspect each character to determine if it is a digit (part of a number) or a non-digit
// (which acts as a delimiter between numbers).
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {

                //Character.isDigit(ch): This method checks if the current character ch is a digit.
                //If ch is a digit, it appends the digit to the temp string (which is collecting digits to form a number).
                //Thought Process:
                //Why append digits to temp?
                //Since numbers can consist of multiple digits, the program needs to collect digits consecutively until
                // a non-digit is encountered. This way, temp will accumulate digits to form a complete number.
                tempo += ch;

            }else {

                //If the character ch is not a digit, the program:
                //sum += Integer.parseInt(temp): Converts the accumulated digits in temp into an integer using
                // Integer.parseInt(temp) and adds it to sum.
                //temp = "0": Resets the temp string to "0" to start collecting digits for the next number.
                //Thought Process:
                //Why add temp to sum when a non-digit is encountered?
                //A non-digit marks the end of a number. Therefore, once a non-digit character is found, the program
                // treats the collected digits in temp as a complete number, adds it to the running sum, and then resets
                // temp to start fresh.
                sum+=Integer.parseInt(tempo);
                tempo="0";

            }
        }

//        After the loop finishes, there might still be digits left in temp (if the string ends with a number).
//        The program adds this final number to sum before returning the result.
//                Thought Process:
//        Why handle temp after the loop?
//        If the string ends with a number, no non-digit character will trigger the sum calculation for the last number.
//        This final addition ensures that the last number is included in the sum.
         return sum+ Integer.parseInt(tempo);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String Str= sc.nextLine();
       int sum= countSumBtAlphabets(Str);
        System.out.println(sum);
    }
}
//Enter the String
//23efg45h2gy80
//150





//How the Code Works with Example:
//For the input string "12abc20yz68":
//
//First Loop Iteration (ch = '1'):
//
//The character is a digit, so temp = "01".
//Second Loop Iteration (ch = '2'):
//
//The character is a digit, so temp = "012".
//Third Loop Iteration (ch = 'a'):
//
//The character is not a digit.
//Convert temp = "012" to 12 and add it to sum. Now, sum = 12.
//Reset temp = "0".
//Next Iterations for 20:
//
//The program accumulates the digits 20 and adds it to sum. Now, sum = 12 + 20 = 32.
//Reset temp = "0".
//Next Iterations for 68:
//
//The program accumulates the digits 68 and adds it to sum. Now, sum = 32 + 68 = 100.
