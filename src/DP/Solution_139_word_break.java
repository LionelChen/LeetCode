package DP;

import java.util.Arrays;
import java.util.List;

public class Solution_139_word_break {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        Arrays.fill(dp, false);
        dp[0] = true;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length()+1; j++){
                if(dp[i]==true){
                    String sub = s.substring(i, j);
                    if(wordDict.contains(sub)){
                        dp[j]=true;
                    }
                }
            }
        }
        return dp[s.length()];
    }
}
