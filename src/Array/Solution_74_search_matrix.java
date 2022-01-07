package Array;

public class Solution_74_search_matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        //find row
        int row = binarySearchFirstCol(matrix, target);
        if(row<0){
            return false;
        }
        int left = 0;
        int right = matrix[row].length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            if(target<matrix[row][mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }

    public static int binarySearchFirstCol(int[][] matrix, int target){
        int low = -1;
        int high = matrix.length-1;
        while(low<high){
            int row = (high - low + 1)/2 + low;//向上取整
            if(matrix[row][0]<=target){
                low = row;
            }else{
                high = row-1;
            }
        }
        return low;
    }
}
