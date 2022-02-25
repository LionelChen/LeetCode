package BinarySearch;

public class Solution_Offer53_locate_numer_in_sorted_array {

    public int search(int[] nums, int target) {
        if(nums.length==0){
            return 0;
        }
        int right = binarySearch(nums, target);
        if(right==-1){
            return 0;
        }
        int left = binarySearch(nums, target-1);
        return right - left;
    }

    public int binarySearch(int[] nums, int target){
        //Search for the target right boundary
        int low = 0;
        int high = nums.length-1;
        int mid;
        int result = -1;
        while(low<=high){
            mid = low + (high - low) / 2;
            if(nums[mid]>target){
                result = mid;
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid + 1;
            }else{//nums[mid] == target
                result = mid;
                low = mid + 1;
            }
        }
        return result;
    }

}
