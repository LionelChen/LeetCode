package BFSnDFS;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_734_network_delay_time {
    int N = 100010, M = N * 2;
    //   he 数组：存储是某个节点所对应的边的集合（链表）的头结点；
    //   e  数组：由于访问某一条边指向的节点；
    //   ne 数组：由于是以链表的形式进行存边，该数组就是用于找到下一条边；
    //   w 数组：用于记录某条边的权重为多少。
    int[] he = new int[N], e = new int[M], ne = new int[M], w = new int[M];
    int idx;

    void add(int a, int b) {
        e[idx] = b;
        ne[idx] = he[a];
        he[a] = idx;
        idx++;
    }

    void add(int a, int b, int c) {
        e[idx] = b;
        ne[idx] = he[a];
        he[a] = idx;
        w[idx] = c;
        idx++;
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        int N = 100;
        Boolean[] visited = new Boolean[N];
        for(int[] edge: times){
            add(edge[0],edge[1],edge[2]);
        }
        return 0;
    }

    @Test
    public void testNetworkDelayTime(){
        int[][] input = new int[][]{{2,1,1},{2,3,1},{3,4,1}};
        Assertions.assertEquals(0, networkDelayTime(input,4,2));
    }
}
