// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its level order traversal as:
// [
//   [3],
//   [9,20],
//   [15,7]
// ]

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList <>();
        Queue <TreeNode> queue = new List<TreeNode>();
        if (root == null)
        {
            return result;
        }
        
        queue.add(root);
        
        while (!queue.isEmpty())
        {
            List <Integer> currentLevel = new List <Integer>();
            int size =queue.size();
            
            for (int i =0;i <size; i++)
            {
                TreeNode current = queue.remove();
                currentLevel.add(current);
                if(current.left != null)
                {
                    queue.add(current.left);
                }
                if(current.right != null)
                {
                    queue.add(current.right);
                }
            }
            
            result.add(currentLevel);
        }
        
        return result;

}
