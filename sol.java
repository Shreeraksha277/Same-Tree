class Solution {
     public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, trees match at this branch
         if (p == null && q == null) {
            return true;
        }

        // If one is null and the other isn't, trees differ
        if (p == null || q == null) {
            return false;
        }

        // If values differ, trees are not the same
        if (p.val != q.val) {
            return false;
        }

        // Recursively compare left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
