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
    public int maxDepth(TreeNode root) {
        // Recursive DFS
        if (root == null) return 0; // empty node has 0 depth

        // root node => depth = 1
        // check the left subtrees: call maxDepth again, and again => plus 1 plus 1 again until reach null node with depth = 0
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
