package Array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class Solution_523_continuous_subarray_sum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length+1];
        prefix[0] = 0;
        prefix[1] = nums[0];
        for(int i = 2; i < nums.length+1; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i <= nums.length-1; i++){
            int temp = prefix[i] % k;
            if(set.contains(temp)){
                return true;
            }else{
                set.add(temp);
            }
        }

        return false;
    }

    @Test
    public void testCheackSubarraySum(){
        boolean expected = true;
        int[] input = new int[]{2,4,3};
        Assertions.assertEquals(expected, checkSubarraySum(input, 6));
    }
}
