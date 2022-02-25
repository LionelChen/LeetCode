package DP;

public class Solution_1137_n_th_tribonacci_num {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }
        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        for(int i = 3; i<=n; i++){
            result[i] = result[i-3] + result[i-2] + result[i-1];
        }
        return result[n];
    }
}
