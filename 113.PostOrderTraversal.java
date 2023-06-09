public class 113.PostOrderTraversal {
    
    static List<Integer> list;
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        list = new ArrayList<>();
        postorder(root);
        return list;
    }

    static void postorder(TreeNode root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        list.add(root.data);
    }
}
