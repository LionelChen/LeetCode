package Array;

public class Solution_34_find_first_and_last_pos_of_elm_in_sorted_array {
    public static int[] searchRange(int[] nums, int target) {
        int[] pos = new int[]{-1,-1};
        pos[0] = bSearch(nums, target, true);
        pos[1] = bSearch(nums,target, false);
        return pos;
    }
    public static int bSearch(int[] nums, int target, boolean isLeft){
        int low = 0;
        int high = nums.length-1;
        int mid = -1;
        int res = -1;
        while(low<=high){ //locate one target
            mid = (low+high)/2;
            if(nums[mid]<target){
                low = mid+1;
            }else if(nums[mid]>target){
                high = mid-1;
            }else{
                res = mid;
                if(isLeft){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }

        }
        return res;
    }
}
