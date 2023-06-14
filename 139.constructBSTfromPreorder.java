public class 139.constructBSTfromPreorder {
    static int idx;
	public static TreeNode<Integer> preOrderTree(int[] preOrder) {
 		// Write your code here
		 idx = 0;
		 return f(preOrder, Integer.MAX_VALUE);
	}

	static TreeNode<Integer> f(int [] preorder, int hi){

		if(idx >= preorder.length || preorder[idx] > hi) return null;

		TreeNode<Integer> root = new TreeNode(preorder[idx++]);
		root.left = f(preorder, root.data);
		root.right = f(preorder, hi);

		return root;
	}

}
