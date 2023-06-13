public class 134.InvertBT {
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        // Write your code here.
		if(root == null) return root;

		TreeNode<Integer> left = flattenBinaryTree(root.left);
		TreeNode<Integer> right = flattenBinaryTree(root.right);
		root.left = null;

		if(left != null) {
			root.right = left;
			while(left.right != null) {
				left = left.right;
			}
			if(right != null) left.right = right;
		}else{
			root.right = right;
		}

		return root;
    }
}

// TC :O(n) SC: O(n)

// sc: o(1) -- morris traversal
public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        // Write your code here.
		if(root == null) return root;

		TreeNode<Integer> curr = root;

		while(curr != null){
			if(curr.left != null) {
				TreeNode<Integer> prev = curr.left;
				while(prev.right != null){
					prev = prev.right;
				}

				prev.right = curr.right;
				curr.right = curr.left;
				curr.left = null;
			}
			curr = curr.right;
			
		}


		return root;
    }
