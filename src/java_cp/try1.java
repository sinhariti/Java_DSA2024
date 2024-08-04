package java_cp;
//some students got into an engineering college. Now there is a class consisting of such n students, and the HOD came to
//say is time to select the class monitor. But he never gets all of them at one time. So he brought a register, every time
//he gets someone with less rank than the previous time, he cut the name and wrote the name of the student and the rank
// For given number of ranks he gets time, you have to predict how many names are cut in the list.
import java.util.Scanner;
public class try1 {
    public static void main(String[] args){
        int n,p,ans=0,maxi=0;
        System.out.print("Enter the number of students found :");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i==0){
                maxi=sc.nextInt();
                continue;
            }
            p=sc.nextInt();
            if(p<maxi){
                maxi=p;
                ans++;
            }

        }
        System.out.println("The number of cuts :"+ans);
    }


}
