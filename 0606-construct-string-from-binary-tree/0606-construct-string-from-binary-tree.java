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
	public static void addPath(TreeNode node, StringBuilder path) {
		if (node == null) return;
		path.append(node.val);
		if (node.left == null && node.right == null)  return;
		else {
			if (node.left == null) {
				path.append("()(");
				addPath(node.right, path);
				path.append(")");
			} else {
				path.append("(");
				addPath(node.left, path);
				path.append(")");
				if (!(node.right == null)) {
					path.append("(");
					addPath(node.right, path);
					path.append(")");
				}
			}
		}
	}
  public String tree2str(TreeNode root) {
		StringBuilder res = new StringBuilder();
		addPath(root, res);
		return res.toString();
  }
}