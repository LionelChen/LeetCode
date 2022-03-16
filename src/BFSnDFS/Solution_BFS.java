package BFSnDFS;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_BFS {
    public static class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
    }

    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[]{};
        }
        Queue<TreeNode> level = new LinkedList<TreeNode>();
        ArrayList result = new ArrayList();
        level.add(root);
        while(!level.isEmpty()){
            for(int i = 0; i < level.size(); i++){
                TreeNode temp = level.poll();
                result.add(temp.val);
                TreeNode left = temp.left;
                TreeNode right = temp.right;
                if(left!=null){
                    level.offer(left);
                }
                if(right!=null){
                    level.offer(right);
                }
            }
        }
        int[] arr = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            arr[i] = (int)(result.get(i));
        }
        return arr;
    }
}
