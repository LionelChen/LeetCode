package BFSnDFS;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_1197_minimum_knight_moves {
    class Node{
        int x;
        int y;
        public int min_dis;
        public Node(int x, int y, int min_dis){
            this.x = x;
            this.y = y;
            this.min_dis = min_dis;
        }

    }
    public int minKnightMoves(int x, int y) {
        int[][] dirs = new int[][]{{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
        x = Math.abs(x);
        y = Math.abs(y);
        int[][] visited = new int[301][301];
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0,0,0));
        while(q.size()!=0){
            int level_size = q.size();
            for(int i = 0; i < level_size; i++){
                Node temp = q.poll();
                for(int[] dir: dirs){
                    int next_x = temp.x + dir[0];
                    int next_y = temp.y + dir[1];
                    if(next_x>=0 && next_x<=300 && next_y>=0 && next_y<=300){
                        if(next_x==x && next_y==y){
                            return temp.min_dis+1;
                        }
                        if(visited[next_x][next_y]==0){
                            visited[next_x][next_y] = temp.min_dis+1;
                            q.offer(new Node(next_x, next_y, temp.min_dis+1));
                        }
                    }
                }
            }
        }
        return -1;

    }

    @Test
    public void testMinKnightMoves(){
        int expected = 2;
        Assertions.assertEquals(expected, minKnightMoves(1,1));
    }
}
