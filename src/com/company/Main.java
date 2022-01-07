package com.company;

import java.util.Arrays;

//import static Array.Solution_33_search_in_rotated_sorted_array.search;
//import static Array.Solution_34_find_first_and_last_pos_of_elm_in_sorted_array.searchRange;
import static Array.Solution_153_find_min_in_rotated_sorted_array.findMin;
import static Array.Solution_74_search_matrix.searchMatrix;
//import static DP.Solution_338_counting_bits.countBits;
//import static  DP.Solution_55_jump_game.canJump;
//import static  DP.Solution_45_jump_game_II.jump;
//import static DP.Solution_62_unique_paths.uniquePaths;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        int[] arr1 = {0,1,2,3,4};
        int[] nums = {2,3,1,1,4};
        int[] nums1 = {5,1,3};
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int[] nums2 = {3,4,5,1,2};
	    //System.out.println(Arrays.toString(countBits(5)));
        //System.out.println(canJump(nums));
        //System.out.println(jump(nums));
        //System.out.println(uniquePaths(3,7));
        //System.out.println(searchRange(arr1,0)[0]);
        //System.out.println(search(nums1, 3));
        //System.out.println(searchMatrix(matrix, 11));
        System.out.println(findMin(nums2));
    }

}
