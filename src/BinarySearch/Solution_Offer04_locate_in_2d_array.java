package BinarySearch;

public class Solution_Offer04_locate_in_2d_array {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //locate row
        int low = 0;
        int high = matrix.length-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(target<matrix[mid][0]){
                high = mid-1;
            }else if(target>matrix[mid][0]){
                low = mid;
            }else{
                return true;
            }
        }
        int row = low;
        low = 0;
        high = matrix[row].length;
        while(low<high){
            int mid = low + (high-low)/2;
            if(target<matrix[row][mid]){
                high = mid-1;
            }else if(target>matrix[row][mid]){
                low = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}
