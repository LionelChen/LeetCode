package hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_2197_replace_non_coprime_numbers_in_array {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> result = new ArrayList();
        Stack<Integer> st = new Stack<Integer>();
        st.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            st.add(nums[i]);
            while(true){
                int a = st.pop();
                int b = st.pop();
                if(gcd(a, b)>1){
                    st.push(lcm(a,b));
                }else{
                    break;
                }
            }
        }

        return result;
    }

    public int gcd(int a, int b){
        int temp;
        if(b>a){
            temp = a;
            a = b;
            b = temp;
        }
        while(a%b!=0){
            temp = a%b;
            a = b;
            b = temp;
        }
        return b;
    }

    public int lcm(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int multiplier = 1;
        while((multiplier*min)%max!=0){
            multiplier++;
        }
        return multiplier*min;
    }

    @Test
    public void testCase1(){
        int[] expected = {12,7,6};
        int[] input = {6,4,3,2,7,6,2};
        List<Integer> result  = replaceNonCoprimes(input);
        int[] actual = new int[result.size()];
        for(int i = 0; i < result.size(); i++) actual[i] = result.get(i);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLCM(){
        Assertions.assertEquals(12,lcm(6,4));
        Assertions.assertEquals(12,lcm(12,3));
        Assertions.assertEquals(12,lcm(12,2));
        Assertions.assertEquals(6,lcm(6,2));
    }

    @Test
    public void testGCD(){
        Assertions.assertEquals(1,gcd(2,3));
    }
}
