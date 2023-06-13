public class 124.HeightBalanced {
    public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		// Write your code here.
        if(root == null) return true;

        return height(root) != -1;
	}

    static int height(BinaryTreeNode<Integer> root){
        if(root == null) return 0;

        int l = height(root.left);
        if(l == -1) return -1;

        int r = height(root.right);
        if(r == -1) return r;

        if(Math.abs(l - r) > 1) return -1;

        return Math.max(l, r) + 1;
    }
}
