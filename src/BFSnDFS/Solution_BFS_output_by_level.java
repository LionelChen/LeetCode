package BFSnDFS;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_BFS_output_by_level {

     public static class TreeNode {
         int val;
     public TreeNode left;
     public TreeNode right;
     public TreeNode(int x) { val = x; }
     }


    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList();
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        ArrayList result = new ArrayList();
        q.add(root);
        while(!q.isEmpty()){
            List temp_level = new ArrayList();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = q.poll();
                temp_level.add(temp.val);
                TreeNode left = temp.left;
                TreeNode right = temp.right;
                if(left!=null){
                    q.offer(left);
                }
                if(right!=null){
                    q.offer(right);
                }
            }
            result.add(temp_level);
        }
        return result;
    }
}
