class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return max;
    }

    public int maxPath(TreeNode root){
        if(root == null) return 0;

        int leftSum = maxPath(root.left);
        int rightSum = maxPath(root.right);

        leftSum = leftSum > 0 ? leftSum : 0;
        rightSum = rightSum > 0 ? rightSum:0;
        
        max = Math.max(max , leftSum + rightSum + root.val);

        return root.val + Math.max(leftSum , rightSum);
    }
}
