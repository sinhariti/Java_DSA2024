package java_cp;

import java.io.*;
public class Test{
    static int numOfPaths(int m,int n){
        if(m==1 || n==1){
            return 1;
        }
//        System.out.println(m+" "+n);
        return numOfPaths(m-1,n)+numOfPaths(m,n-1);
    }
    public static void main(String[] args){
        System.out.println(numOfPaths(3,3));;
    }
}


