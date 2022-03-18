package Hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Solution_3_longest_substring_without_reapeating_characters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int left = 0;
        int right = 1;
        map.put(s.charAt(0), 0);
        int max = 1;
        int current = 1;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){//if key already exist
                if(map.get(s.charAt(right))>=left){//not yet skipped
                    left = map.get(s.charAt(right))+1;
                }
            }
            current=right-left+1;
            map.put(s.charAt(right), right);//update latest pos
            max = Math.max(max, current);
            right++;
        }
        return max;
    }

    @Test
    public void testLengthOfLongestSubstring(){
        int expected = 3;
        Assertions.assertEquals(expected, lengthOfLongestSubstring("pwwkew"));
    }
}
