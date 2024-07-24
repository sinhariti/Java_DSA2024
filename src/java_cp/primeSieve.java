package java_cp;

import java.util.Scanner;

public class primeSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit to find primes: ");
        int limit = sc.nextInt();
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        //algo
        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        long product = 1;
        long sum = 0;

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                product *= i;
                sum += i;
            }
        }
        System.out.println("Product of all primes up to " + limit + ": " + product);
        System.out.println("Sum of all primes up to " + limit + ": " + sum);
        System.out.println("Difference between product and sum: " + (product-sum));

        sc.close();
    }
}
