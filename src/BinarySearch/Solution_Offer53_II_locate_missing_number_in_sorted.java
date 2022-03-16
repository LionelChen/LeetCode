package BinarySearch;

public class Solution_Offer53_II_locate_missing_number_in_sorted {
    public int missingNumber(int[] nums) {
        int low = 0;
        int high = nums.length;
        while(low<high){
            int mid = low + (high - low) /2;
            if(nums[mid]==mid){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}
