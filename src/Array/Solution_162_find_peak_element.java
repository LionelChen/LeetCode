package Array;

public class Solution_162_find_peak_element {
    public static int findPeakElement(int[] nums){
        int left = 0;
        int right = nums.length-1;
        if(nums.length==1){
            return 0;
        }else if(nums.length==2){
            return nums[0]<nums[1]?1:0;
        }
        while(left<right){
            int mid = left + (right - left) / 2;//floor
            if(nums[mid]<nums[mid+1]){
                //mid < mid+1
                left = mid+1;
            }else{
                //mid > mid+1
                right = mid;
            }
        }
        return left;
    }
}
