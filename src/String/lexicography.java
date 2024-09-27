package String;
import java.util.*;

public class lexicography {
    public static String lexicography(String str){

        if (str == "") {
           return "a";
        }

         int i = str.length()-1;
        while(str.charAt(i)== 'z' && i >= 0 ){
            i--;
        }



        if(i == -1)
            str= str +'a';
        else
        str= str.substring(0,i) +
                (char)((int)str.charAt(i) +1)+
                str.substring(i+1);
        return str;
    }

    public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);

        System.out.println("Enter the string ");
        String str= sc.nextLine();
        System.out.println(lexicography(str));

    }
}
//Enter the string
//asd
//ase
