package backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_90_subsets_ii {
    List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
    LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果

    public static List<List<Integer>> subsetsWithDup(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for(int i = 0; i < nums.length; i++){
            int size = result.size();
            for(int j = 0; j<size;j++){
                List<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(nums[i]);
                result.add(temp);
            }
        }

        return result;
    }
}
