package hard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_72_edit_distance {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length-1;
            int sum = nums[i] * (-1);
            if (i > 0 && nums[i]==nums[i-1]) continue;
            while(j < k)
                if(nums[j]+nums[k]==sum){
                    //System.out.println("sum:"+sum);
                    //System.out.println("i"+nums[i]+"j"+nums[j]+"k"+nums[k]);
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    while(j<k&&nums[j]==nums[j+1])
                        j++;
                    while(j<k&&nums[k] == nums[k-1])
                        k--;
                    j++;
                    k--;
                }else if(nums[j]+nums[k]<sum){
                    j++;
                }else{
                    k--;
                }
        }
        return result;
    }
}
