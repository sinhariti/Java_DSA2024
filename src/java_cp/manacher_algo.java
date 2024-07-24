//package java_cp;
////hyphen question "hello-wprld-" to "--helloworld"
//public class manacher_algo {
//    static int ma(String s, int N){
//        String str= getmodifiedString(s,N);
//        int len =(2*N)+1;
//        int[] P = new int [len];
//        int c=0,r=0;
//        int maxLen = 0;
//        for(int i=0;i<len ;i++){
//            int mirror=(2*c)-1;
//            if(i<c){
//                P[i]=Math.min(r-1,P[mirror]);
//            }
//            int a = i+(1+P[i]);
//            int b = i-(1+P[i]);
//            while(a<len && b>=0 && str.charAt(a)==str.charAt(b)){
//                P[i]++;
//                a++;
//                b--;
//            }
//            if(i+P[i]>r){
//                c=i;
//                r=i+P[i];
//                if(P[i]>maxLen){
//                    maxLen=P[i];
//                }
//            }
//        }
//        return maxLen;
//    }
//
//    static String getmodifiedString(String s , int N){
//
//    }
//    public static void main(String args[]){
//        String str= "inputString";
//        int N = str.length();
//        System.out.println(ma(str,N));
//    }
//}
