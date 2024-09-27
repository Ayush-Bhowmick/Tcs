package String;

import java.util.*;
import java.util.Scanner;

public class anagram {

    public static boolean anagram(String string, String string2) {
        char[] str= string.toCharArray();
        char[] str2= string2.toCharArray();
        Arrays.sort(str);
        Arrays.sort(str2);
        return Arrays.equals(str,str2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string ");
        String str= sc.nextLine();
        System.out.println("Enter the second string ");
        String str2 = sc.nextLine();

        if (anagram(str,str2)){
            System.out.println("its an anagram ");
        }else {
            System.out.println("its not an anagram");
        }

    }
}
//Enter the first string
//asdfghj
//Enter the second string
//jhgfdsa
//its an anagram
