package String;
import java.util.*;
public class firstNonRepeatingElement {
    public static int firstNonRepeatingElement(String str){
        int[] freq = new int[26];
        for (char ch:str.toCharArray()) {
            freq[ch - 'a']++;
        }
        //find first ch with freq
             for (int i = 0; i < str.length(); ++i) {
                  if (freq[str.charAt(i) - 'a']== 1) {
                      return i;
                  }
             }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(firstNonRepeatingElement(str));
    }
}
