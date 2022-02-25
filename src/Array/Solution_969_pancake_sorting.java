package Array;

import java.util.ArrayList;
import java.util.List;

public class Solution_969_pancake_sorting {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<Integer>();

        //Find current maximum
        int boundary = arr.length-1;
        while(boundary>=0){
            int localMaxPos = 0;
            for(int i = 1; i <= boundary; i++){
                if(arr[i]>arr[localMaxPos]){
                    localMaxPos = i;
                }
            }
            // Make sure localMax at index 0
            if(localMaxPos==boundary){
                boundary--;
                continue;
            }
            if(localMaxPos!=0){
                reverse(arr, 0, localMaxPos);
                result.add(localMaxPos+1);
            }

                reverse(arr, 0 ,boundary);
                result.add(boundary+1);


            boundary--;
        }
        return result;

    }

    void reverse(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
