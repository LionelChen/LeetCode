package com.company;

import java.util.Arrays;

import static DP.Solution_338_counting_bits.countBits;
import static  DP.Solution_55_jump_game.canJump;
import static  DP.Solution_45_jump_game_II.jump;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        int[] nums = {2,3,1,1,4};
	    //System.out.println(Arrays.toString(countBits(5)));
        //System.out.println(canJump(nums));
        System.out.println(jump(nums));
    }



}
