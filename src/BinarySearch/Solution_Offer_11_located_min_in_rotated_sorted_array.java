package BinarySearch;

import java.util.Arrays;

public class Solution_Offer_11_located_min_in_rotated_sorted_array {
    public int minArray(int[] numbers) {
        if(numbers.length==1){
            return numbers[0];
        }else if(numbers.length==2){
            return Math.min(numbers[0], numbers[1]);
        }
        int low = 0;
        int high = numbers.length-1;
        int mid = low + (high-low)/2;
        if(numbers[mid]>numbers[high]){
            return minArray(Arrays.copyOfRange(numbers, mid+1, high+1));
        }
        else if(numbers[low]<numbers[mid]){//low to mid is fine, search mid+1 to high
            return minArray(Arrays.copyOfRange(numbers, low, mid+1));
        }else{
            return minArray(Arrays.copyOfRange(numbers, low, high));
        }

    }
}
