package BFSnDFS;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_1091_shortest_path_in_binary_matrix {

    public static int shortestPathBinaryMatrix(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        if (grid[0][0] != 0){
            return -1;
        }else{
            dp[0][0] = 1;
        }
        Queue<int []> queue = new LinkedList<>();
        int[][] dirs = new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        //top left, top, top right, left, right, bot left, bot, bot right
        //       0,   1,         2,    3,     4,        5,   6,         7

        return dp[row-1][col-1];
    }

    public int getGrid(int[][] grid, int row, int col){
        if(row<0||row>=grid.length||col<0||col>=grid[0].length){
            return -1;
        }
        return grid[row][col];
    }

}
