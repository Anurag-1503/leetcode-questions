/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue <TreeNode> qu = new LinkedList<>();
        if(root==null)
            return res;
        qu.add(root);
        while(!qu.isEmpty()){
            int len = qu.size();
            List<Integer> temp = new LinkedList<Integer>();
            
            while(len>0){
                TreeNode curr = qu.poll();
                temp.add(curr.val);
                if(curr.left!=null)
                    qu.add(curr.left);
                if(curr.right!=null)
                    qu.add(curr.right);
                len--;
            }
            res.add(temp);
        }
        return res;
    }
}