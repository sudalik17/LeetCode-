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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        preorder(root,l);
        return l;
    }
    private static void  preorder(TreeNode n,List<Integer>list){
        if(n !=null){
        list.add(n.val);
        preorder(n.left,list);
        preorder(n.right,list);
        }
        
    }
}