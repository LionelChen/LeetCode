package hard;

import java.util.HashSet;
import java.util.Set;

public class Solution_564_find_the_closest_palindrome {
    public String nearestPalindromic(String n) {
        long k = Long.parseLong(n,10);
        int mid = n.length()/2;
        Set<Long> result_set = new HashSet<>();

        //Special cases like n = "999"
        //Closest would be 9999 & 10001
        result_set.add((long) Math.pow(10, n.length() - 1) - 1);
        result_set.add((long) Math.pow(10, n.length()) + 1);

        //adjust middle
        long plus = k+(long)(Math.pow(10,mid));
        long minus = k-(long)(Math.pow(10,mid));
        long base = k-(k%(long)(Math.pow(10,mid)));

        long plus_s = constructPalindromic(plus);
        long minus_s = constructPalindromic(minus);
        long base_s = constructPalindromic(base);
        if(plus_s!=k){
            result_set.add(plus_s);
        }
        if(minus_s!=k){
            result_set.add(minus_s);
        }
        if(base_s!=k){
            result_set.add(base_s);
        }
        long ans = -1;
        for (long i : result_set) {
            if (ans == -1) {
                ans = i;
            } else if (Math.abs(i - k) < Math.abs(ans - k)) {
                ans = i;
            } else if (Math.abs(i - k) == Math.abs(ans - k) && i < ans) {
                ans = i;
            }
        }
        return String.valueOf(ans);
    }

    public long constructPalindromic(long n){
        String temp = Long.toString(n);
        char[] result = new char[temp.length()];
        int left = 0;
        int right = temp.length()-1;
        while(left<=right){
            result[left] = temp.charAt(left);
            result[right] = result[left];
            left++;
            right--;
        }
        return Long.parseLong(String.valueOf(result), 10);
    }
}
