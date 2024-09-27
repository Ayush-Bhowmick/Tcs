package String;

import java.util.*;
public class duplicates {
    public static void duplicates(String str){
        char[] chars= str.toCharArray();
        Arrays.sort(chars);
        String sb = new String(chars);

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            while (i < str.length() -1 && sb.charAt(i) == sb.charAt(i + 1)) {
                count++;
                i++;
            }

            if (count > 1) {
                System.out.println(sb.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String str= sc.nextLine();
        duplicates(str);
    }
}
//Enter the String
//geeksforgeeks
//e
