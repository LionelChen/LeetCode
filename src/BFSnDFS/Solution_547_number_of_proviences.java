package BFSnDFS;

public class Solution_547_number_of_proviences {
    public static int findCircleNum(int[][] isConnected){
        int provinces = 0;
        int[] visited = new int[isConnected.length];
        for(int i = 0; i<isConnected.length; i++){
            if(visited[i]==0){
                visited[i]=1;
                provinces++;
                dfs(isConnected,visited,i);
            }
        }
        return provinces;

    }

    public static void dfs(int[][] isConnected, int[] visited, int i){
        for(int j = 0; j < isConnected.length; j++){
            if(isConnected[i][j]==1&&visited[j]==0){
                visited[j]=1;
                dfs(isConnected, visited, j);
            }
        }
    }
}
