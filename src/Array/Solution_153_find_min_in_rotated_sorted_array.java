package Array;

//How to select mid value for b search:https://blog.csdn.net/CaspianSea/article/details/106392104

public class Solution_153_find_min_in_rotated_sorted_array {
    public static int findMin(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left+ (right-left)/2;//floor
            if(nums[mid]<nums[right]){
                //shrink right
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return nums[left];
    }
}
