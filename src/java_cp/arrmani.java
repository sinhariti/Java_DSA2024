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
   static void arrsum(){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number of rows for both matrix : ");
       int m = sc.nextInt();
       System.out.print("Enter number of column for both matrix: ");
       int n = sc.nextInt();
       int[][] arr1= new int[m][n];
       int[][] arr2= new int[m][n];
       int[][] arr3 = new int[m][n];
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               System.out.print("Enter element value for maxtrix1 index ["+i+", "+j+"] :");
               arr1[i][j]= sc.nextInt();
           }
       }
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               System.out.print("Enter element value for maxtrix2 index ["+i+", "+j+"] :");
               arr2[i][j]= sc.nextInt();
           }
       }

       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               arr3[i][j]=arr1[i][j] + arr2[i][j];
           }
       }
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               System.out.print(arr3[i][j]+" ");
           }
           System.out.println();
       }
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

//        System.out.print("Enter number of rows: ");
//        int m = sc.nextInt();
//        System.out.print("Enter number of column: ");
//        int n = sc.nextInt();
//        int[][] arr1=new int[m][n];
//        arr1= arrsum();
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(arr1[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("sum: "+elesum(m,n,arr1));
        arrsum();



    }
}
