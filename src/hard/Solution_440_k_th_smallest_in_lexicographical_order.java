package hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_440_k_th_smallest_in_lexicographical_order {
    public int findKthNumber(int n, int k) {
        int prefix = 1;
        while(k>1){
            int count = getCount(prefix, n);
            if(k<=count){
                prefix*=10;
                k-=1;
            }else{
                prefix+=1;
                k-=count;
            }
        }
        return prefix;

    }

    public int getKth(int init, int k){
        int result = init;
        int mul = 1;
        int count = 1;

        for(int i = 0; i <= 9; i++){

            if(count==k){
                return result;
            }
            result = init * mul * 10 + i;
            count++;
        }
        return -1;
    }

    public int getCount(int prefix, int n){
        int cur = prefix;
        int next = prefix + 1;
        int count = 0;
        while(cur<=n){
            count += Math.min(n-cur+1, next-cur);
            cur *= 10;
            next *= 10;
        }
        return count;
    }




    @Test
    public void testGetCount(){
        int expected = 5;
        Assertions.assertEquals(expected, getCount(1, 13));
    }

    @Test
    public void testkthSmallest(){
        findKthNumber(99, 20);

        int expected2 = 17;
        Assertions.assertEquals(expected2, findKthNumber(100, 10));
    }
}
