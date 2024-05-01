import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class largestnum {
    public static void main(String[] args){
        int num,max;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number of elements in the array :");
        num = sc.nextInt();
        int[] a = new int[num];
        for (int i =0;i<num;i++){
            System.out.print("Enter a number :");
            a[i]=sc.nextInt();
        }
        max=a[0];
        for (int i =0;i<num;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        System.out.println("The maximum number is : "+max);

    }



}
