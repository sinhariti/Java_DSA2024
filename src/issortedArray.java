import java.util.Scanner;
public class issortedArray {
    public static int issortedarray(int arr[],int n){
        if (n==0 || n==1){
            return 1;
        }
        if(arr[n-1]<arr[n-2]){
            return 0;
        }
        return (issortedarray(arr,n-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of elements in the array :");
        n = sc.nextInt();
        int arr[]= new int[n];
        for (int i =0;i<n;i++){
            System.out.print("Enter number " +(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        if (issortedarray(arr, n) != 0)
            System.out.println("Yes, it is sorted. ");
        else
            System.out.println("No, it is not sorted.");

    }
}
