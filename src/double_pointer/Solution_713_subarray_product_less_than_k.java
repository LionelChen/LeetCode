package double_pointer;

public class Solution_713_subarray_product_less_than_k {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(nums == null || k == 0 || k == 1){
            return 0;
        }
        int l = 0,r = 0,count = 0, product = 1;
        while(r<nums.length){
            product*=nums[r];
            while(product>=k){
                product/=nums[l];
                l++;
            }
            count += r-l+1;
            r++;
        }
        return count;

    }
}
