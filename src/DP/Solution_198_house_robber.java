package DP;

public class Solution_198_house_robber {
    public static int rob(int[] nums){
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if(nums.length==1){
            return dp[0];
        }
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }

        return dp[nums.length-1];
    }
}
