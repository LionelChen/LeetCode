package BFSnDFS;

public class Solution_2049_count_nodes_with_the_highest_score {
    int N = 100010, M = N * 2;
//    he 数组：存储是某个节点所对应的边的集合（链表）的头结点；
//    e  数组：由于访问某一条边指向的节点；
//    ne 数组：由于是以链表的形式进行存边，该数组就是用于找到下一条边；
//    w 数组：用于记录某条边的权重为多少。
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

    public int countHighestScoreNodes(int[] parents) {
        return 0;
    }
}
