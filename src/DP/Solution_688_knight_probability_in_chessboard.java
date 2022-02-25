package DP;

public class Solution_688_knight_probability_in_chessboard {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] dirs = new int[][]{{-1,-2},{-1,2},{1,-2},{1,2},{-2,1},{-2,-1},{2,1},{2,-1}};
        double[][][] dp = new double[k + 1][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[0][i][j] = 1;
            }
        }
        for (int step = 1; step <= k; step++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    for(int[] d : dirs){
                        int nx = i + d[0];
                        int ny = j + d[1];
                        if(nx>=0 && nx<n && ny>=0 && ny<n) {
                            dp[step][i][j] += dp[step - 1][nx][ny] / 8;
                        }
                    }
                }
            }
        }

        return dp[k][row][column];
    }
}
