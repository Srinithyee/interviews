// Given a binary tree, determine if it is a valid binary search tree (BST).

// Assume a BST is defined as follows:

// The left subtree of a node contains only nodes with keys less than the node's key.
// The right subtree of a node contains only nodes with keys greater than the node's key.
// Both the left and right subtrees must also be binary search trees.
// Example 1:
//     2
//    / \
//   1   3
// Binary tree [2,1,3], return true.
// Example 2:
//     1
//    / \
//   2   3
// Binary tree [1,2,3], return false.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        
        if (root == null)
                return null;
        
        return helper(root, long.MIN_VAL, long.MAX_VAL);
    }
    
    public boolean helper(root, long min, long max)
    {
        if (root == null)
                return true;
        
        if(root.val <=min || root.val >= max)
            return false;
        
        return helper(root.right, root.val, max) && helper(root.left, min, root.val);
    }
}


