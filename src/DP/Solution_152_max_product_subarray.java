package DP;

public class Solution_152_max_product_subarray {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, curMax = 1, curMin = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                int tmp = curMax;
                curMax = curMin;
                curMin = tmp;
            }
            //imax = Math.max(imax*nums[i], nums[i]);
            curMax = Math.max(curMax*nums[i], nums[i]);
            curMin = Math.min(curMin*nums[i], nums[i]);

            max = Math.max(max, curMax);
        }
        return max;
    }
}
