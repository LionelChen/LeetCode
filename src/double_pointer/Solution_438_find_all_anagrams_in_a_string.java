package double_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_438_find_all_anagrams_in_a_string {
    public static List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        if (sLen < pLen) {
            return new ArrayList<Integer>();
        }
        List<Integer> ans = new ArrayList<Integer>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];

        //init pCount & sCount
        for(int i = 0; i<pLen; i++){
            sCount[s.charAt(i)-97]++;
            pCount[p.charAt(i)-97]++;
        }

        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }

        for(int i = 0; i<sLen-pLen;i++){
            sCount[s.charAt(i)-97]--;
            sCount[s.charAt(i+pLen)-97]++;
            if (Arrays.equals(sCount, pCount)) {
                ans.add(i+1);
            }
        }

        return ans;

    }
}
