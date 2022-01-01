package DP;

public class Solution_55_jump_game {
    public static boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int potential = 0;
        for(int i = 0; i < nums.length; i++){
            potential = Math.max(potential, nums[i]);

            if(potential==0&&i!=nums.length-1){
                return false;
            }
            potential--;
            if(potential > nums.length-i){
                return true;
            }

        }
        return true;
    }
}
