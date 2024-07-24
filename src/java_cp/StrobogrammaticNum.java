package java_cp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrobogrammaticNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lowerBound = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        if (lowerBound > upperBound) {
            System.out.println("Invalid bounds. Lower bound must be less than or equal to upper bound.");
            return;
        }
        List<String> strobogrammaticNumbers = findStrobogrammaticNum(lowerBound, upperBound);
        System.out.println("Strobogrammatic numbers between " + lowerBound + " and " + upperBound + ":");
        for (String num : strobogrammaticNumbers) {
            System.out.println(num);
        }

        sc.close();
    }

    public static List<String> findStrobogrammaticNum(int lowerBound, int upperBound) {
        List<String> result = new ArrayList<>();

        for (int i = lowerBound; i <= upperBound; i++) {
            if (isStrobogrammatic(String.valueOf(i))) {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }

    public static boolean isStrobogrammatic(String num) {
        int left = 0;
        int right = num.length() - 1;
        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);
            if (!isStrobogrammaticPair(leftChar, rightChar)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isStrobogrammaticPair(char c1, char c2) {
        return (c1 == '0' && c2 == '0') ||
                (c1 == '1' && c2 == '1') ||
                (c1 == '6' && c2 == '9') ||
                (c1 == '8' && c2 == '8') ||
                (c1 == '9' && c2 == '6');


    }
}

