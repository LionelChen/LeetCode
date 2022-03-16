package DP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Solution_392_is_subsequence {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int[][] dp = new int[n+1][26];
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = 0; k<26; k++){
                    if(t.charAt(j)==k+'a'){
                        dp[i][k] = j;
                    }
                }
            }
        }
        int add = 0;
        for (int i = 0; i < n; i++) {
            if (dp[add][s.charAt(i) - 'a'] == n) {
                return false;
            }
            add = dp[add][s.charAt(i) - 'a'] + 1;
        }
        return true;

    }


    @Test
    public void testSubsequence(){
        String s = "abc";
        String t = "ahbgdc";
        Assertions.assertEquals(false,isSubsequence(s,t));
    }
}
