public class 111.InorderTraversal {
    static List<Integer>ans;
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here
        ans = new ArrayList<>();
        inorder(root);
        return ans;
    }

    static void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        ans.add(root.data);
        inorder(root.right);
    }
}
