package DP;

public class Solution_53_max_subarray {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int max = nums[0];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(dp[i-1]<=0){
                dp[i] = nums[i];
            }else{
                dp[i] = nums[i] + dp[i-1];
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
