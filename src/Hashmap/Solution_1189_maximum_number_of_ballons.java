package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Solution_1189_maximum_number_of_ballons {

    public int maxNumberOfBalloons(String text) {
        //HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        count.put('b', 0);
        count.put('a', 0);
        count.put('l', 0);
        count.put('o', 0);
        count.put('n', 0);
        for(int i = 0; i < text.length(); i++){
            char cur = text.charAt(i);
            if(count.containsKey(cur)){
                count.put(cur, count.get(cur)+1);
            }
        }
        int b = count.getOrDefault('b',0);
        int a = count.getOrDefault('a',0);
        int l = count.getOrDefault('l',0);
        int o = count.getOrDefault('o',0);
        int n = count.getOrDefault('n',0);
        int count1 = Math.min(Math.min(b,a),n);
        int count2 = Math.min(l/2,o/2);
        return Math.min(count1, count2);
    }
}
