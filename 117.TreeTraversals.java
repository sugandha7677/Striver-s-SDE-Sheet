public class 117.TreeTraversals {
    static List<Integer> inorder;
	static List<Integer> preorder;
	static List<Integer> postorder;
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
		List<List<Integer>>list = new ArrayList<List<Integer>>();
		inorder = new ArrayList<>();
		preorder = new ArrayList<>();
		postorder = new ArrayList<>();

		f(root);

		list.add(inorder);
		list.add(preorder);
		list.add(postorder);

		return list;
    }

	static void f(BinaryTreeNode<Integer>root){
		if(root == null) return;

		preorder.add(root.data);
		f(root.left);
		inorder.add(root.data);
		f(root.right);
		postorder.add(root.data);
		
	}
}
