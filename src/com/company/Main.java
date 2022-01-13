package com.company;

import java.util.Arrays;

//import static Array.Solution_33_search_in_rotated_sorted_array.search;
//import static Array.Solution_34_find_first_and_last_pos_of_elm_in_sorted_array.searchRange;
import static Array.Solution_153_find_min_in_rotated_sorted_array.findMin;
import static Array.Solution_162_find_peak_element.findPeakElement;
import static Array.Solution_74_search_matrix.searchMatrix;
import static LinkedList.Solution_82_remove_duplicates_from_sorted_list_ii.deleteDuplicates;
import static double_pointer.Solution_209_minimum_size_subarray_sum.minSubArrayLen;
import static double_pointer.Solution_713_subarray_product_less_than_k.numSubarrayProductLessThanK;
import static double_pointer.Solution_844_backspace_string_compare.backspaceCompare;
import static double_pointer.Solution_986_interval_list_intersections.intervalIntersection;

import com.company.ListNode;

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
        System.out.println(minSubArrayLen(11, nums7));

    }

}
