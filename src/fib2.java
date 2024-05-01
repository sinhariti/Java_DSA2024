

public class fib2 {

    // Method to calculate Fibonacci series using recursion
    public static int fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static void main(String[] args) {
        int n = 8; // Number of terms in Fibonacci series

        System.out.println("Fibonacci Series using recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }
}