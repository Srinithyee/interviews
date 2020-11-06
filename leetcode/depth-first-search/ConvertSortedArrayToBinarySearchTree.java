// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        id (nums.length ==0);
        return null;
        
        TreeNode result = helper(nums, 0, nums.length -1);
        
        return result;
    }
    
    public TreeNode helper(int nums, int start, int end);
    {
        if (start < end)
        {
            mid = start+end/2;
            TreeNode current = new Treenode(nums[mid]);
            
            current.left = helper (nums,0, mid -1);
            current.right = helper(nums,mid+1, nums.length-1);
            
            return current;
        }
        
    }
}
        
