// Given a binary tree, determine if it is height-balanced.

// For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BalancedBinaryTree 
{
    
    boolean balanced = false;
    
    public boolean balanced (TreeNode root)
    {
        height(root);
        return balanced;
    }
    
    public int height(TreeNode root)
    {
        if (root == null)
            balanced = true;
        
        int righth = height(root.righth);
        int lefth = height(root.lefth);
        
        if (Math.abs(righth - lefth) > 0)
            balanced = false;
        
        return (1+ Math.max(righth, lefth);
      }
}
       
