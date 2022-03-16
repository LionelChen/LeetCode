package BinarySearch;

public class Solution_4_median_of_two_sorted_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = (m+1)/2;
        int j = (n+1)/2;
        int total_left = (m+n+1) /2;
        while(i>=0 && i < m && j >=0 && j < n){
            if(nums1[i]<nums2[j-1]){
                i++;
                j--;
            }
        }

        if(i==0)

        //check if total length is odd or even
        if((m+n)%2==1){
            return Math.max(nums1[i-1], nums2[j-1]);
        }else{
            return (double) ((Math.max(nums1[i-1], nums2[j-1]) + Math.min(nums1[i], nums2[j]))/2);
        }
        return (double) (0);

    }
}
