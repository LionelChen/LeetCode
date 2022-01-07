package Array;

public class Solution_33_search_in_rotated_sorted_array {
    public static int search(int[] nums, int target) {

        //corner case
        if(nums.length==0){
            return -1;
        }else if(nums.length==1){
            return nums[0]==target ? 0:-1;
        }
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            boolean leftSorted = nums[0] <= nums[mid];
            if(leftSorted){
                if(nums[0]<=target && target<nums[mid]){
                    right = mid-1;//left sorted & nums[0]<target<nums[mid]: use normal binary search
                }else{
                    left = mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
