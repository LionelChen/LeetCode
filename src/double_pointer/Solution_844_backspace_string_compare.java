package double_pointer;

import java.util.Stack;

public class Solution_844_backspace_string_compare {
    public static boolean backspaceCompare(String s, String t) {
        //Solution that has space o(m+n)
        /*Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        for(int i = 0; i<s.length();i++){
            char s1_char = s.charAt(i);
            if(String.valueOf(s1_char).equals("#")){
                if(!s1.empty()){
                    s1.pop();
                }
            }else{
                s1.push(s1_char);
            }
        }
        for(int i = 0; i<t.length();i++){
            char s2_char = t.charAt(i);
            if(String.valueOf(s2_char).equals("#")){
                if(!s2.empty()){
                    s2.pop();
                }
            }else{
                s2.push(s2_char);
            }
        }
        while(!s1.empty()&&!s2.empty()){
            if(s1.pop()!=s2.pop()){
                return false;
            }
        }
        return s1.empty()&&s2.empty()?true:false;*/

        int i = s.length()-1;
        int j = t.length()-1;
        int skip_i = 0;
        int skip_j = 0;
        while(i>=0||j>=0){
            while(i>=0){
                if(s.charAt(i)=='#'){
                    skip_i++;
                    i--;
                }else if(skip_i!=0){
                    skip_i--;
                    i--;
                }else{
                    break;
                }
            }
            while(j>=0){
                if(s.charAt(j)=='#'){
                    skip_j++;
                    j--;
                }else if(skip_j!=0){
                    skip_j--;
                    j--;
                }else{
                    break;
                }
            }
            if(i>=0&&j>=0){
                if(s.charAt(i)!=t.charAt(j)){
                    return false;
                }
            }else{
                if(i>=0 || j>=0){
                    return false;
                }
            }
            i--;
            j--;

        }
        return true;
    }
}
