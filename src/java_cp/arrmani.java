package java_cp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrmani {
   //create 2d array and take in inputs
   static int[][] arrc(int m,int n,int[][] arr){
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               System.out.print("Enter element value for index ["+i+", "+j+"] :");
               arr[i][j]= sc.nextInt();
           }
       }
       return arr;
   }
   //adding elements of an array
   static int elesum(int m,int n,int[][] arr){
       int sum=0;
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               sum+=arr[i][j];
           }
       }
       return sum;
   }
    public static void main(String args[]){

//        int[] arr={2,3,4,5,1};
//        int maxi=0;
//        int minim=0;
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a index value to be searched :");
//        int target = sc.nextInt();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>arr[maxi]){
//                maxi=i;
//            }
//            if(arr[i]<arr[minim]){
//                minim = i;
//            }
//            if(i==target){
//                System.out.println("Target value is :"+ arr[i]);
//            }
//        }
//
//        System.out.println("max :"+arr[maxi]);
//        System.out.println("min :"+arr[minim]);

        //create 2d array
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of column: ");
        int n = sc.nextInt();
        int[][] arr1=new int[m][n];
        arr1= arrc(m,n,arr1);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("sum: "+elesum(m,n,arr1));

    }
}
