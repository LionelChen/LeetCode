package DP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Solution_264_ugly_number_ii {
    int[] nums = new int[]{2,3,5};
    public int nthUglyNumber(int n) {
        Set<Long> set = new HashSet<>();

        Queue<Long> ugly = new PriorityQueue<Long>((v1, v2)->Long.compare(v1, v2));
        set.add(1L);
        ugly.add(1L);
        for (int i = 1; i <= n; i++) {
            long x = ugly.poll();
            if (i == n) return (int)x;
            for (int num : nums) {
                long t = num * x;
                if (!set.contains(t)) {
                    set.add(t);
                    ugly.add(t);
                }
            }
        }
        return -1;
    }

    @Test
    public void testUgly1(){
        Assertions.assertEquals(nthUglyNumber(1), 1);
        Assertions.assertEquals(nthUglyNumber(2), 2);
        Assertions.assertEquals(nthUglyNumber(3), 3);
        Assertions.assertEquals(nthUglyNumber(4), 4);
        Assertions.assertEquals(nthUglyNumber(5), 5);
        Assertions.assertEquals(nthUglyNumber(6), 6);
        Assertions.assertEquals(nthUglyNumber(7), 8);
        Assertions.assertEquals(nthUglyNumber(8), 9);
        Assertions.assertEquals(nthUglyNumber(9), 10);
        Assertions.assertEquals(nthUglyNumber(10), 12);
    }

    @Test
    public void testUgly2(){
        Assertions.assertEquals(nthUglyNumber(7), 8);

    }
}
