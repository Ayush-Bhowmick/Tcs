//The goal of the program is to simplify an algebraic string by removing parentheses and applying the correct signs to
// the variables and terms inside those parentheses.
package String;
import java.util.*;
public class bracketRemover {

    public static String bracketRemover(String str){
        //noting the  length of the string
        int len=str.length();
        //building a  StringBuilder
        StringBuilder result = new StringBuilder();

        int currentSign=1;//1 is for positive and -1 for negative
        int globalSign=1;// it is foe handling the outer brackets
        boolean flipped=false;

        //now iterating the loop
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if (ch == '+') {

                if (currentSign * globalSign == -1) {
                    result.append('-'); // Append a minus if the sign is negative
                }else {
                    result.append('+');
                }

            } else if (ch == '-') {
                currentSign = -currentSign;//flipping the sign

                if (currentSign * globalSign == -1) {
                    result.append('-'); // Append a minus if the sign is negative

                }else {
                    result.append('+');
                }




            } else if (ch == '(') {
                if (i>0 && str.charAt(i-1) == '-') { // -( then throughout the signs will change

                        globalSign = -globalSign;
                        flipped=true;

                }
                currentSign = 1; //reset currentSign

            }else if (ch==')'){
                if (flipped) {
                    // If we flipped the global sign due to a previous '(', restore it
                    globalSign = -globalSign;
                    flipped = false; // Reset the flip state after exiting this context
                }
            }else {
                if (currentSign * globalSign == -1) {
                    result.append('-');
                }
                result.append(ch);
                currentSign=1;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Algebraic equation need to be simplified - ");
        String str = sc.nextLine();
        System.out.println(bracketRemover(str));
    }
}
