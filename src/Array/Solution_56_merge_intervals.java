package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution_56_merge_intervals {
    public int[][] merge(int[][] intervals) {
        Queue<Integer[]> pq = new PriorityQueue<>((v1, v2)-> v1[0]-v2[0]);
        Integer[] pre = pq.poll();
        List<int[]> ans = new ArrayList();

        while(pq.size()>=1){
            Integer[] cur = pq.poll();
            if(cur[0]>pre[1]){ //no overlap
                ans.add(new int[]{pre[0], pre[1]});
                pre = cur;
            }else{ //overlap, combine
                pre[1] = cur[1];
            }
        }

        Integer[] cur = pq.poll();
        if(cur[0]>pre[1]){ //no overlap
            ans.add(new int[]{pre[0], pre[1]});
            ans.add(new int[]{cur[0], cur[1]});
        }else{ //overlap, combine
            ans.add(new int[]{pre[0], cur[1]});
        }

        int[][] result = new int[ans.size()][2];
        for(int i = 0; i < ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}
