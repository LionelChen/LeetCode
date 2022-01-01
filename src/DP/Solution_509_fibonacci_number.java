package DP;

public class Solution_509_fibonacci_number {
    public static int fib(int n) {
        int result[] = new int[Math.max(n+1,2)];
        result[0] = 0;
        result[1] = 1;
        for(int i = 2; i < n+1; i++){
            result[i]=result[i-1]+result[i-2];
        }
        return result[n];
    }
}
