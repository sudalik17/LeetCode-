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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        postorder(root,l);
        return l;
    }
    public static void postorder(TreeNode n,List<Integer> list)
    {
        if(n != null)
        {
            
            postorder(n.left,list);
            postorder(n.right,list);
            list.add(n.val);

        }
    }
}