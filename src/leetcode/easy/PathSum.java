package leetcode.easy;

import util.Tree.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return (sum-root.val == 0);
        }
        return hasPathSum(root.left,sum-root.val) ||
                hasPathSum(root.right, sum-root.val);

    }
}
