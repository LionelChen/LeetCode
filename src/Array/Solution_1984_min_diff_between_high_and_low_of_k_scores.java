package Array;

import java.util.Arrays;

public class Solution_1984_min_diff_between_high_and_low_of_k_scores {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length==k){
            return Math.abs(nums[0]-nums[k-1]);
        }
        int result = Integer.MAX_VALUE;
        for(int i = k; i <= nums.length; i++){
            int diff = Math.abs(nums[i-k] - nums[i-1]);
            result = Math.min(result, diff);
        }
        return result;
    }
}
