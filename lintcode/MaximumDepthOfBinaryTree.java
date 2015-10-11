/*
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example
Given a binary tree as follow:

  1
 / \ 
2   3
   / \
  4   5
The maximum depth is 3.
 */
public class MaximumDepthOfBinaryTree {

    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : 
            1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
