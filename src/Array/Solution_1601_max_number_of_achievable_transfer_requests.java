package Array;

import java.util.Arrays;

public class Solution_1601_max_number_of_achievable_transfer_requests {
    public int maximumRequests(int n, int[][] requests) {
        int result = 0;
        int[] delta = new int[n];
        for(int mask = 0; mask < (1<<requests.length); ++mask){
            Arrays.fill(delta, 0);
            if(result>=Integer.bitCount(mask)){
                continue;
            }else{
                //check if request is valid
                for(int i = 0; i < requests.length; ++i){
                    if ((mask & (1 << i)) != 0) {
                        delta[requests[i][0]]--;
                        delta[requests[i][1]]++;
                    }

                }
                Boolean valid = true;
                for(int i = 0; i < n; i++){
                    if(delta[i]!=0){
                        valid = false;
                        break;
                    }
                }
                if(valid){
                    result = Integer.bitCount(mask);
                }
            }
        }
        return result;
    }

}
