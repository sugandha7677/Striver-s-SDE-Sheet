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


// Morris Inorder Traversal 
 public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> list = new ArrayList<>();
        TreeNode curr = root;

        while(curr != null){
            if(curr.left == null){
                list.add(curr.data);
                curr = curr.right;
            }else{
                TreeNode prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }

                if(prev.right == null){
                    prev.right = curr; // make thread
                    curr = curr.left;
                }else{
                    prev.right = null; // break thread
                    list.add(curr.data);
                    curr = curr.right;

                }
            }
        }
        return list;
    }
