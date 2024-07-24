package java_cp;
//write a java program to find the number of elements in a hashset formed my adding weighted substring in the hashset
// eg : abcde is the string
import java.util.HashSet;
import java.util.Scanner;

public class weightedsubstring {
    static int distinctSS(String P, String Q, int K, int N){
        HashSet <String> S= new HashSet<String>();
        for(int i=0; i<N;i++){
            int sum=0;
            String s=""; // empty string - immutable
            for (int j=i;j<N;j++){
                int pos=P.charAt(j)-'a';
                sum+= Q.charAt(pos)-'0';
                s+=P.charAt(j); // we are concatenation the string, not replacing its value
                if(sum<=K){
                    S.add(s);
                }else{
                    break;
                }
            }
        }
        return S.size();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String P= sc.nextLine();
        System.out.print("Enter the numbers :");
        String Q= sc.nextLine();
        System.out.print("Enter the target :");
        int K = sc.nextInt();
        int N = P.length();

        int result = distinctSS(P,Q,K,N);
        System.out.println("The size is :"+ result);
    }
}
