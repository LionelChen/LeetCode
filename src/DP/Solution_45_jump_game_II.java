package DP;

public class Solution_45_jump_game_II {
    public static int jump(int[] nums) {
        int start = 0;
        int end = 1;
        int count = 0;
        while(end<nums.length){
            int maxJump = start;
            for(int i = start; i<end;i++){
                maxJump = Math.max(maxJump, nums[i]+i);
            }
            start = end;
            end = maxJump+1;
            count++;
        }
        return count;
    }
}
