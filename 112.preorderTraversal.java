public class 112.preorderTraversal {
    
    static List<Integer> list;
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		list = new ArrayList<>();
		preorder(root);
		return list;
    }

	static void preorder(TreeNode root){
		if(root == null) return;

		list.add(root.data);
		preorder(root.left);
		preorder(root.right);
	}
}

// Morris preorder traversal

public static List < Integer > getPreOrderTraversal(TreeNode root) {
	List<Integer> list = new ArrayList<>();
	TreeNode cur = root;

	while(cur != null){
		if(cur.left == null){
			list.add(cur.data);
			cur = cur.right;
		}
		else{
			TreeNode prev = cur.left;
			while(prev.right != null && prev.right != cur){
				prev = prev.right;
			}

			if(prev.right == null){
				list.add(cur.data);
				prev.right = cur;
				cur = cur.left;
			}else{
				prev.right = null;
				cur = cur.right;
			}
		}
	}
	return list;
    }
}
