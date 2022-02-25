package Array;

public class Solution_717_1_bit_and_2_bit_characters {

    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length==1){
            return true;
        }
        if(bits.length==2){
            return bits[0]==0;
        }
        int count = 0;
        for(int i = bits.length-2; i>=0&&bits[i]==1;i--){
            count++;
        }
        return count%2==0;
    }

}
