package BinarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_Offer068_find_array_peak {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int mid = left + (right-left) / 2;
        while(left<right){
            mid = left + (right-left) / 2;
            if(mid>=1 && arr[mid-1]>arr[mid]){//peak on arr[left, mid-1]
                right = mid-1;
            }else if(mid<=arr.length-2 && arr[mid+1]>arr[mid]){ //peak on arr[mid+1]
                left = mid+1;
            }else{
                return mid;
            }
        }
        return right;
    }

    @Test
    public void testPeakIndexInMountain(){
        int expected = 1;
        int[] arr_1 = new int[]{3,5,3,2,0};
        Assertions.assertEquals(expected, peakIndexInMountainArray(arr_1));
    }
}
