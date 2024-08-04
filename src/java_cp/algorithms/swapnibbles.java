package java_cp.algorithms;
// swapping nibbles - dividing a byte in 2 parts left and right and swapping the left and right parts with eachother
// it uses the concept of dividing the data using hexadecimal value 00001111 - 0xof and 11110000- 0xf0 and shifting it
// using bitwise shif >> 4

/*
swapping 2 nibbles can be useful in certain applications like
-- data encryption
-- data compression

* */
import java.util.Scanner;
public class swapnibbles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=sc.nextInt();
        int swap= ((0x0f & num) << 4| (0xf0 &num)>>4 );
        System.out.println("Before swap :"+num);
        System.out.println("After swap :"+swap);

    }
}
