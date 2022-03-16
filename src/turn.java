import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class turn {
    public String[] findWords(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] first = "qwertyuiopQWERTYUIOP".toCharArray();
        char[] second = "asdfghjklASDFGHJKL".toCharArray();
        char[] thrid = "zxcvbnmZXCVBNM".toCharArray();
        List<String> ans = new ArrayList();
        for(char i: first){
            map.put(i, 0);
        }
        for(char i: second){
            map.put(i, 1);
        }
        for(char i: thrid){
            map.put(i, 2);
        }
        for(String word: words){
            if(word.length()<=1){
                ans.add(word);
            }else{
                char temp = word.charAt(0);
                int row = map.get(temp);
                boolean flag = true;
                for(int i = 1; i < word.length(); i++){
                    if(map.get(word.charAt(i))!=row){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    ans.add(word);
                }
            }

        }
        String[] result = new String[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }

    @Test
    public void testTurn(){
        String[] s = new String[]{"Hello","Alaska","Dad","Peace"};
        Assertions.assertArrayEquals(new String[]{"Alaska","Dad"}, findWords(s));
    }
}