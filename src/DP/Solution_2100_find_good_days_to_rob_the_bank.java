package DP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution_2100_find_good_days_to_rob_the_bank {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        ArrayList result = new ArrayList();
        int[] dp_asec = new int[security.length];
        int[] dp_desc = new int[security.length];
        dp_asec[security.length-1] = 0;
        dp_desc[0] = 0;
        for(int i = security.length-2; i >= time; i--){
            if(security[i]<=security[i+1]){
                dp_asec[i] = dp_asec[i+1] + 1;
            }else{
                dp_asec[i] = 0;
            }
        }

        for(int i = 1; i <= security.length-time-1; i++){
            if(security[i-1]>=security[i]){
                dp_desc[i] = dp_desc[i-1] + 1;
            }else{
                dp_desc[i] = 0;
            }

        }

        for(int i = time; i <= security.length-1-time; i++){
            if(dp_asec[i]>=time&&dp_desc[i]>=time){
                result.add(i);
            }
        }

        return result;
    }

    @Test
    public void testRobDay(){
        int[] security = new int[]{5,3,3,3,5,6,2};
        List<Integer> actual = new ArrayList();
        actual.add(2);
        actual.add(3);
        Assertions.assertEquals(goodDaysToRobBank(security,2), actual);
    }

    @Test
    public void testRobDay2(){
        int[] security = new int[]{3,1,20,17,26,0,2,29,24};
        List<Integer> actual = new ArrayList();
        Assertions.assertEquals(goodDaysToRobBank(security,3), actual);
    }

    @Test
    public void testRobDay3(){
        int[] security = new int[]{1,1,1,1,1};
        List<Integer> expected = new ArrayList();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        Assertions.assertEquals(expected, goodDaysToRobBank(security,0));
    }
}
