package Dynamic Programming.Fib Using Tabulation;

public class FibUsingTabulation {
    static int fib(int n) {
        // Write your code here
        if (n == 0)
            return 0;

        int fib[] = new int[n + 1];
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
}
