package DP;

public class Solution_740_delete_and_earn {
    public int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        for(int i = 1; i<nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        int[] sum = new int[max+1];
        for(int i = 0; i < nums.length; i++){
            sum[nums[i]]++;
        }
        int[] dp = new int[max+1];
        dp[1] = sum[1] * 1;
        dp[2] = Math.max(dp[1], sum[2] * 2);
        for(int i = 3; i < max+1; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + sum[i]*i);
        }
        return dp[max];
    }
}
