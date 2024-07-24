import java.util.ArrayList;
import java.util.List;

class Solution {
    public void fizzBuzz(int n) {

        List<String> sol = new ArrayList<>();
        if (n >= 1 && n <= 10000) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    sol.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    sol.add("Fizz");
                } else if (i % 5 == 0) {
                    sol.add("Buzz");
                } else {
                    sol.add(String.valueOf(i));
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(sol.get(i));
        }
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        obj.fizzBuzz(15);
    }
}

