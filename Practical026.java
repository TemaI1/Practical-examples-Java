// recursion

public class Practical026 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial2(6));
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    private static int factorial2(int n){
        if (n == 1){
            return n; // return 1;
        }

        return n * factorial(n - 1);
    }
}
