/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        //resulant list
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        
        /*hashmap to map child nodes with their parents
        queue for traversal
        hashset for visited node*/
        HashMap<TreeNode , TreeNode> parentmap = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        
        findparent(parentmap,root);
        q.add(target);
        
        while(!q.isEmpty())
        {    
            int size = q.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode curr = q.poll();
                visited.add(curr);
                //k becomes 0 for all nodes with 2units of distance from target node.
                if(k==0) 
                    res.add(curr.val);
                
                if(parentmap.containsKey(curr) && !visited.contains(parentmap.get(curr)))
                    q.add(parentmap.get(curr));
                if(curr.left!=null && !visited.contains(curr.left))
                    q.add(curr.left);
                if(curr.right!=null && !visited.contains(curr.right))
                    q.add(curr.right);
                       
            }
            k--;
            if(k<0) break;          
        }
      return res;  
    }
 
    
    
    private static void findparent(HashMap<TreeNode,TreeNode> hm , TreeNode root)
    {
        if(root==null)
            return;
        if(root.left!=null)
            hm.put(root.left , root);
        if(root.right!=null)
            hm.put(root.right , root);
        
        findparent(hm,root.left);
        findparent(hm,root.right);
    }
}