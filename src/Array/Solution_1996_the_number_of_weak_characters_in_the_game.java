package Array;

import java.util.Arrays;

public class Solution_1996_the_number_of_weak_characters_in_the_game {
    public static int numberOfWeakCharacters(int[][] properties){
        Arrays.sort(properties, (o1, o2)-> {
            return o1[0] == o2[0] ? (o1[1] - o2[1]) : (o2[0] - o1[0]);
        });
        int ans = 0;
        int maxDef = 0;
        for(int[] p : properties){
            if(p[1]<maxDef){
                ans++;
            }else{
                maxDef=p[1];
            }
        }
        return  ans;
    }
}
