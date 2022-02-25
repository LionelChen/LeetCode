package Greedy;

import java.util.Arrays;

public class Solution_1405_longest_happy_string {
    public String longestDiverseString(int a, int b, int c){
        StringBuilder res = new StringBuilder();
        Pair[] arr = {new Pair(a, 'a'), new Pair(b,'b'), new Pair(c,'c')};

        while(true){
            Arrays.sort(arr,(p1, p2)->p2.freq-p1.freq);
            boolean charAvaiable = false;
            for(Pair pair: arr){
                if(pair.freq<=0){
                    return res.toString();//该字符没有可用次数
                }
                int m = res.length();
                if(m>=2&&res.charAt(m-2)==pair.ch&&res.charAt(m-1)==pair.ch){
                    continue;//two consecutive char
                }
                charAvaiable = true;
                res.append(pair.ch);
                pair.freq--;
                break;
            }
            if(!charAvaiable) {
                break;
            }
        }
        return res.toString();
    }


     class Pair{
        int freq;
        char ch;
        public Pair(int freq, char ch){
            this.freq = freq;
            this.ch = ch;
        }
    }
}
