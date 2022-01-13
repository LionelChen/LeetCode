package double_pointer;

public class Solution_209_minimum_size_subarray_sum {
    public static int minSubArrayLen(int target, int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int left = 0, right = 0, sum = 0, ans = Integer.MAX_VALUE;
        while(right< nums.length){
            sum += nums[right];
            right++;
            while(sum>=target){
                ans = Math.min(ans, right-left);
                sum-=nums[left];
                left++;
            }

        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
