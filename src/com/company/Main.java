package com.company;

import java.util.Arrays;

//import static Array.Solution_33_search_in_rotated_sorted_array.search;
//import static Array.Solution_34_find_first_and_last_pos_of_elm_in_sorted_array.searchRange;
//import static Array.Solution_153_find_min_in_rotated_sorted_array.findMin;
//import static Array.Solution_162_find_peak_element.findPeakElement;
//import static Array.Solution_74_search_matrix.searchMatrix;
//import static BFSnDFS.Solution_1091_shortest_path_in_binary_matrix.shortestPathBinaryMatrix;
//import DP.Solution_213_house_robber_ii;
//import DP.Solution_740_delete_and_earn;
//import static LinkedList.Solution_82_remove_duplicates_from_sorted_list_ii.deleteDuplicates;
//import static backtrack.Solution_78_subsets.subsets;
//import static double_pointer.Solution_209_minimum_size_subarray_sum.minSubArrayLen;
//import static double_pointer.Solution_713_subarray_product_less_than_k.numSubarrayProductLessThanK;
//import static double_pointer.Solution_844_backspace_string_compare.backspaceCompare;
//import static double_pointer.Solution_986_interval_list_intersections.intervalIntersection;
//import com.company.ListNode;
//import static backtrack.Solution_90_subsets_ii.subsetsWithDup;
//import static double_pointer.Solution_438_find_all_anagrams_in_a_string.findAnagrams;
//import Greedy.Solution_1405_longest_happy_string;
//import Array.Solution_1447_simplified_fractions;
//import Array.Solution_1984_min_diff_between_high_and_low_of_k_scores;
//import Hashmap.Solution_1189_maximum_number_of_ballons;
//import DP.Solution_688_knight_probability_in_chessboard;
//import Greedy.Solution_1405_longest_happy_string;
//import Array.Solution_969_pancake_sorting;
//import Array.Solution_717_1_bit_and_2_bit_characters;
//import DP.Solution_1137_n_th_tribonacci_num;
//import BinarySearch.Solution_Offer53_locate_numer_in_sorted_array;
//import DP.Solution_740_delete_and_earn;
//import DP.Solution_45_jump_game_II;
//import DP.Solution_53_max_subarray;
//import DP.Solution_918_max_sum_in_circular_subarray;
import DP.Solution_152_max_product_subarray;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        int[] arr1 = {0,1,2,3,4};
        int[] nums = {2,3,1,1,4};
        int[] nums1 = {5,1,3};
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int[] nums2 = {3,4,5,1,2};
        int[] nums3 = {1,2,3,1};
        int[] nums4 = {1};
        int[] nums5 = {6,5,4,3,2,3,2};
        int[][] firstList = {{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList = {{1, 5},{8, 12},{ 15, 24 },{ 25, 26 }};
        int[] nums6 = {1,1,1};
        int[] nums7 = {1,2,3,4,5};
        ListNode node6 = new ListNode(5);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);
        int[] nums8 = {1,7,9,2};
        int[] nums9 = {1,2,2};
        int[][] nums10 = {{0,1},{1,0}};

	    //System.out.println(Arrays.toString(countBits(5)));
        //System.out.println(canJump(nums));
        //System.out.println(jump(nums));
        //System.out.println(uniquePaths(3,7));
        //System.out.println(searchRange(arr1,0)[0]);
        //System.out.println(search(nums1, 3));
        //System.out.println(searchMatrix(matrix, 11));
        //System.out.println(findMin(nums2));
        //System.out.println(findPeakElement(nums3));
        //ListNode noDup = deleteDuplicates(head);
        /*while(noDup!=null){
            System.out.println(noDup.val);
            noDup = noDup.next;
        }*/
        //System.out.println(backspaceCompare("xywrrmp","xywrrmu#p"));
        //System.out.println(Arrays.deepToString(intervalIntersection(firstList, secondList)));
        //System.out.println(numSubarrayProductLessThanK(nums6, 1));
        //System.out.println(minSubArrayLen(11, nums7));
        //System.out.println(rob(nums8));
        //System.out.println(subsetsWithDup(nums9));
        //System.out.println(shortestPathBinaryMatrix(nums10));
        //System.out.println(findAnagrams("cbaebabacd", "abc"));
        //Solution_1405_longest_happy_string s = new Solution_1405_longest_happy_string();
        //System.out.println(s.longestDiverseString(1,1,7));
        //Solution_1447_simplified_fractions s = new Solution_1447_simplified_fractions();
        //System.out.println(s.simplifiedFractions(4));
        //Solution_1984_min_diff_between_high_and_low_of_k_scores s = new Solution_1984_min_diff_between_high_and_low_of_k_scores();
        //System.out.println(s.minimumDifference(new int[]{9, 4, 1, 7}, 2));
        //Solution_1189_maximum_number_of_ballons s = new Solution_1189_maximum_number_of_ballons();
        //System.out.println(s.maxNumberOfBalloons("nlaebolko"));
        //Solution_688_knight_probability_in_chessboard s = new Solution_688_knight_probability_in_chessboard();
        //System.out.println(s.knightProbability(3,2,0,0));
        //Solution_969_pancake_sorting s = new Solution_969_pancake_sorting();
        //System.out.println(s.pancakeSort(new int[]{1,2,3}));
        //Solution_717_1_bit_and_2_bit_characters s = new Solution_717_1_bit_and_2_bit_characters();
        //System.out.println(s.isOneBitCharacter(new int[]{1,1,1,0}));
        //Solution_1137_n_th_tribonacci_num s = new Solution_1137_n_th_tribonacci_num();
        //System.out.println(s.tribonacci(4));
        //Solution_Offer53_locate_numer_in_sorted_array s = new Solution_Offer53_locate_numer_in_sorted_array();
        //System.out.println(s.search(new int[]{1}, 1));
        //Solution_740_delete_and_earn s = new Solution_740_delete_and_earn();
        //System.out.println(s.deleteAndEarn(new int[]{2,2,3,3,3,4}));
        //Solution_213_house_robber_ii s = new Solution_213_house_robber_ii();
        //System.out.println(s.rob(new int[]{1,2,3,1}));
        //Solution_45_jump_game_II s = new Solution_45_jump_game_II();
        //System.out.println(s.jump(new int[]{2,3,1,1,4}));
        //Solution_53_max_subarray s = new Solution_53_max_subarray();
        //System.out.println(s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        //Solution_918_max_sum_in_circular_subarray s = new Solution_918_max_sum_in_circular_subarray();
        //System.out.println(s.maxSubarraySumCircular(new int[]{-3,-2,-3}));
        Solution_152_max_product_subarray s = new Solution_152_max_product_subarray();
        System.out.println(s.maxProduct(new int[]{-2,0,-1}));
    }

}
