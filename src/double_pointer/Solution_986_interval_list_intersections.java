package double_pointer;

import java.util.ArrayList;
import java.util.List;

public class Solution_986_interval_list_intersections {
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList){
        int i = 0;
        int j = 0;
        List<int[]> ans = new ArrayList();
        while(i<firstList.length&&j<secondList.length){
            int start_late = Math.max(firstList[i][0],secondList[j][0]);
            int end_early = Math.min(firstList[i][1],secondList[j][1]);
            if(start_late<=end_early){//two event overlapped
                ans.add(new int[]{start_late, end_early});
            }
            if(firstList[i][1]<secondList[j][1]){//Event Row A ended earlier than B
                i++;
            }else{//Event Row B ended earlier than A
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
