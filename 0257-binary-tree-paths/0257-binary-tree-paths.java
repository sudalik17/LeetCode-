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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        ans = helper(root,"",ans);
        return ans;
        
    }
    public List<String> helper(TreeNode root,String curr,List<String> s){
        if(root==null)
            return s;
        if(root.left==null && root.right==null){
            s.add(curr+root.val);
            return s;
        }
        curr = curr+root.val;
        curr = curr+"->";
        helper(root.left,curr,s);
        helper(root.right,curr,s);
        
        return s;
    }
}