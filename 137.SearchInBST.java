public class 137.SearchInBST {
    public static Boolean searchInBST(BinaryTreeNode<Integer> root, int x) {
		// Write your code here.
		return f(root, x);
	}

	static Boolean f(BinaryTreeNode<Integer> root, int x){

		if(root == null) return false;

		if(root.data == x) return true;

		if(x > root.data) return f(root.right, x);
		else return f(root.left, x);
	}
}
