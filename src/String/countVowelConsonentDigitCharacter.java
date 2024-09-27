package String;
import java.util.*;
public class countVowelConsonentDigitCharacter {
    static void countChar(String str){
         int vowel=0, consonant=0, digit=0, specialChar=0;
        for (int i = 0; i < str.length(); i++) {
           char ch=  str.charAt(i);

;            if ( ch >= 'a' && ch<= 'z'|| ch>= 'A' && ch<= 'Z') {
                ch= Character.toLowerCase(ch);
                if (ch == 'a' || ch =='e' || ch== 'i' || ch== 'o' || ch == 'u') {
                    vowel++;
                }else {
                    consonant++;
                }

            }else if (ch >= '0' && ch <= '9') {
                digit++;
            }else {
                specialChar++;
            }
        }
        System.out.println("No.of vowel is " + vowel);
        System.out.println("No.of consonant is " + consonant);
        System.out.println("No.of digit is " + digit);
        System.out.println("No.of specialCharacter is " + specialChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
                String str = sc.nextLine();
                countChar(str);
    }
}
//enter the string
//h098jkl;'][poi0987
//No.of vowel is 2
//No.of consonant is 5
//No.of digit is 7
//No.of specialCharacter is 4
