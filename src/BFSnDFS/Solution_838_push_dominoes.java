package BFSnDFS;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_838_push_dominoes {
    public String pushDominoes(String dominoes) {
        Deque<int[]> d = new ArrayDeque<>();
        //init queue
        for(int i = 0; i<dominoes.length();i++){
            if(dominoes.charAt(i)!='.'){
                if(dominoes.charAt(i)=='L'){
                    d.add(new int[]{});
                }
            }
        }
        return "";
    }

}
