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
