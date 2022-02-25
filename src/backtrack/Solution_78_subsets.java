package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Solution_78_subsets {
    public static List<List<Integer>> subsets(int[] nums){
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
