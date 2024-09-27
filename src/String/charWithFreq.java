package String;
import java.util.*;
public class charWithFreq {
    public static void charWithFreq(String str){
        Map<Character, Integer> freq= new LinkedHashMap<>() ;

        for (char ch: str.toCharArray()) {

            if (freq.containsKey(ch)) {
                 freq.put(ch, freq.get(ch)+1);
            }
            else{
                freq.put(ch, 1);
            }

            for (Map.Entry<Character, Integer> entry: freq.entrySet())
                System.out.print(entry.getKey() + "" + entry.getValue() + "  ");

        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();

        charWithFreq(str);
    }
}
