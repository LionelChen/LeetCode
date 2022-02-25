package Greedy;

import java.util.ArrayList;
import java.util.List;

public class Solution_1414_find_the_min_number_of_fibonacci_numbers_whose_sum_is_k {
    public int findMinFibonacciNumbers(int k){

        List<Integer> f = new ArrayList<Integer>();
        int ans = 0;
        for(int i = f.size()-1; i>0; i--){

        }
        return 0;
    }

    public ArrayList getFibonacciList(int k){
        ArrayList result = new ArrayList();
        int cur = 1;
        if(k>cur){
            result.add(1);
            result.add(1);
        }
        while(k>cur){
            int size = result.size();
            cur += (Integer)result.get(size-2);
            cur += (Integer)result.get(size-1);
            result.add(cur);
        }
        return result;
    }
}
