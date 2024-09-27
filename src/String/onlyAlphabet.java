package String;
import java.util.*;
public class onlyAlphabet {
    public static void removeAllExceptAlphabet(String str){
        char[] ch=str.toCharArray();
        int j =0;
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] >='A' && ch[i]< 'Z' || ch[i] >='a' && ch[i]< 'z' ) {
                ch[j]=ch[i];
                j++;
            }
        }
        System.out.println(String.valueOf(ch).substring(0,j));
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the string ");
        String str= sc.nextLine();
        removeAllExceptAlphabet(str);
    }
}
//enter the string
//"$Gee*k;s..fo, r'Ge^eks?
//GeeksforGeeks
