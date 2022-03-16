package DP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_64_minimum_path_sum {
    public int minPathSum(int[][] grid) {
        int[] dp = new int[grid[0].length];
        dp[0] = grid[0][0];
        for(int i = 1;i<grid[0].length;i++){
            dp[i] = grid[0][i] + dp[i-1];
        }
        for(int row = 1; row < grid.length; row++){
            for(int col = 0; col<grid[0].length; col++){
                if(col==0){
                    dp[0] += grid[row][0];
                }else{
                    dp[col] = Math.min(dp[col-1], dp[col]) + grid[row][col];
                }
            }
        }
        return dp[grid[0].length-1];
    }

    @Test
    public void testMinPathSum(){
        int[][] grid = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        Assertions.assertEquals(7, minPathSum(grid));
    }
}
