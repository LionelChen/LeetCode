package Array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution_56_merge_intervals {
    public int[][] merge(int[][] intervals) {
        Queue<int[]> pq = new PriorityQueue<>((v1, v2)-> v1[0]-v2[0]);

        for(int[] interval: intervals){
            pq.offer(interval);
        }
        int[] pre = pq.poll();
        List<int[]> ans = new ArrayList();

        while(pq.size()>=1){
            int[] cur = pq.poll();
            if(cur[0]>pre[1]){ //no overlap
                ans.add(new int[]{pre[0], pre[1]});
                pre = cur;
            }else{ //overlap, combine
                pre[1] = Math.max(pre[1],cur[1]);
            }
        }

        ans.add(new int[]{pre[0], pre[1]});



        int[][] result = new int[ans.size()][2];
        for(int i = 0; i < ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }


    @Test
    public void testMerge(){
        int[][] expected = new int[][]{{1,4}};
        int[][] input = new int[][]{{1,4},{2,3}};
        Assertions.assertArrayEquals(expected, merge(input));
    }
}
