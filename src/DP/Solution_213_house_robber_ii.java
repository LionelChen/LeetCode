package DP;

import java.util.Arrays;

public class Solution_213_house_robber_ii {
    /*public static int rob(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(dp(nums,0,nums.length-2),dp(nums,1,nums.length-1));
    }

    public static int dp(int[] nums, int start, int end){
        int[] dp = new int[nums.length-1];
        dp[0] = nums[start];
        if(end-start==0){
            return dp[0];
        }
        dp[1] = Math.max(nums[start],nums[start+1]);
        for(int i = 2; i <= end-start; i++){
            dp[i] = Math.max(dp[i-2]+nums[start+i], dp[i-1]);
        }

        return dp[end-start];
    }*/

    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }else if(nums.length==1) {
            return nums[0];
        }
        return Math.max(dp(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                dp(Arrays.copyOfRange(nums, 1, nums.length)));

    }
    private int dp(int[] nums){
        int pre = 0, cur = 0, tmp;
        for(int num : nums) {
            tmp = cur;
            cur = Math.max(pre + num, cur);
            pre = tmp;
        }
        return cur;
    }
}
