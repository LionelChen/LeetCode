package Heap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution_offer40_min_kth_number {
    public int[] getLeastNumbers(int[] arr, int k) {

        Queue<Integer> pq = new PriorityQueue<>((v1,v2)-> v2-v1);
        for(int val: arr){
            pq.offer(val);
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }
        return result;
    }


}
