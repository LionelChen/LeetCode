package DP;

public class Solution_1014_best_sightseeing_pair {
    public int maxScoreSightseeingPair(int[] values) {
        int[] dp = new int[values.length];
        dp[1] = values[0]+values[1]-1;
        int pre = values[1];
        int skip = 1;
        for(int i = 2; i < values.length; i++){
            if(values[i]>pre){
                dp[i] = dp[i-1]+values[i]-pre-skip;
                pre = values[i];
                skip = 1;
            }else{
                dp[i] = dp[i-1];
                skip++;
            }
        }
        return dp[values.length-1];
    }
}
