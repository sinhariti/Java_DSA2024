package java_cp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class stringpermu {
    static int fac(int a){
        if(a<=1){
            return 1;
        }
        return a*fac(a-1);
    }

    static String permu(String s){
        HashMap<Character, Integer> charcount
                = new HashMap<Character, Integer>();
        char[] c = s.toCharArray();
        for (char c1 : c) {
            if(charcount.containsKey(c1)){
                charcount.put(c1,charcount.get(c1)+1);
            }else{
                charcount.put(c1,1);
            }
        }
        float per = fac(s.length()-1);
        for(Map.Entry e: charcount.entrySet()){

        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string;");
        String s = sc.nextLine();
        permu(s);
    }
}
