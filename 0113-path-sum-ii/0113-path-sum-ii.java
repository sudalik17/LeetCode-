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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
         helper(root,targetSum,p,al);
        return al;
    }
    public void helper(TreeNode root,int t,List<Integer> path,List<List<Integer>> res){
        if(root == null)
            return ;
        path.add(root.val);
        if(root.left==null && root.right==null&& t == root.val)
                res.add(new ArrayList<>(path));
        else{
        int remsum = t - root.val;
        helper(root.left,remsum,path,res);
        helper(root.right,remsum,path,res);
        }
      path.remove(path.size()-1);
    }
    
}