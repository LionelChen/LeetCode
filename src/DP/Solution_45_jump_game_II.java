package DP;

public class Solution_45_jump_game_II {
    public int jump(int[] nums) {
        int start = 0;
        int end = 1;
        int count = 0;
        while(end<nums.length){
            int maxPos = 0;
            for(int i = start; i < end; i++){
                maxPos = Math.max(maxPos, i+nums[i]);
            }
            start = end;
            end = maxPos+1;
            count++;
        }
        return count;
    }
}
