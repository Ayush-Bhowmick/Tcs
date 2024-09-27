package String;

import java.util.Scanner;

public class removeVowel {
    static void vowelRemover(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'u' || ch== 'o' || ch=='i' ||ch== 'e') {
                continue;
            }else {
                System.out.print(ch+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        vowelRemover(str);
    }
}
//asdfyuiopwert
//s d f y p w r
// https://xhamster.desi/videos/mommy-is-my-girlfriend-7912391
