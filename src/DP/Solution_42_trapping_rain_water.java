package DP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_42_trapping_rain_water {
    public int trap(int[] height) {
        //scan global maximum
        int g_max = 0;
        for(int i = 0; i < height.length; i++){
            g_max = Math.max(g_max, height[i]);
        }
        int result = 0;
        for(int i = 0; i < height.length; i++){
            int base = height[i];
            int leftWallIndex = i-1;
            int rightWallIndex = i+1;
            int leftWall = base;
            int rightWall = base;
            while((leftWallIndex>=0)||(leftWall==g_max)){
                leftWall = Math.max(height[leftWallIndex--], leftWall);
            }
            while(rightWallIndex<=height.length-1){
                rightWall = Math.max(height[rightWallIndex++], rightWall);
            }
            int maxWater = Math.min(leftWall, rightWall);
            if(maxWater>base){
                result+=maxWater-base;
            }
        }
        return result;

    }
    @Test
    public void testTrap1(){
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        Assertions.assertEquals(trap(height), 6);
    }
}
