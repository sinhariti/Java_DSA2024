package java_cp;

import java.util.Scanner;

public class maxequi {
    static int findmax(int arr[], int n){
        int res = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int pn =arr[i];
            for(int j =n-1;j<i;j++){
                pn +=arr[j];
            }
            int sn=arr[i];
            for(int j=n-1;j>i;j--){
                sn+=arr[j];
            }
            if(pn==sn) {
                res = Math.max(res, pn);
            }
        }
        return res;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findmax(arr,n));
    }

}
