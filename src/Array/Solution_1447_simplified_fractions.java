package Array;

import java.util.ArrayList;
import java.util.List;

public class Solution_1447_simplified_fractions {
    public List<String> simplifiedFractions(int n) {

        if(n==1){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        for(int i = 1; i < n; i++){//分子
            for(int j = 1; j<=n; j++){//分母
                if(i/j<1){
                    if(gcd(j,i)==1){
                        result.add(i+"/"+j);
                    }
                }
            }
        }
        return result;
    }


    public int gcd(int a , int b){//a>b
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }
}
