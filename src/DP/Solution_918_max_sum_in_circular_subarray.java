package DP;

public class Solution_918_max_sum_in_circular_subarray {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0, maxSum = nums[0], curMax = 0, minSum = nums[0], curMin = 0;
        for(int num: nums){
            curMax = Math.max(num+curMax, num);
            maxSum = Math.max(curMax, maxSum);
            curMin = Math.min(num+curMin, num);
            minSum = Math.min(curMin, minSum);
            total+=num;
        }

        return maxSum>0 ? Math.max(total-minSum, maxSum): maxSum;
    }
}
