package DP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_221_maximal_square {
    public int maximalSquare(char[][] matrix) {
        int result = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[0][i] == '1'){
                dp[0][i] = 1;
                result = 1;
            }else{
                dp[0][i] = 0;
            }
        }

        for(int i = 1; i < matrix.length; i++){
            if(matrix[i][0]=='1'){
                dp[i][0] = 1;
                result = Math.max(result, dp[i][0]);
            }else{
                dp[i][0] = 0;
            }
        }

        for(int row = 1; row < matrix.length; row++){
            for(int col = 1; col<matrix[0].length; col++){
                dp[row][col]=0;
                if(matrix[row][col]=='1'){
                    dp[row][col] = Math.min(dp[row-1][col-1], Math.min(dp[row-1][col], dp[row][col-1])) + 1;
                }
                result = Math.max(result, dp[row][col]);
            }
        }
        return result*result;
    }


    @Test
    public void testMaximalSquare(){
        char[][] matrix = new char[][]{
                {'0','1'}
        };
        Assertions.assertEquals(1, maximalSquare(matrix));
    }
}
