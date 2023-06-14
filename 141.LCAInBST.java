public class 141.LCAInBST {
    
    public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) 
    {		
        // Write your code here
        return f(root, p, q);

	}

    static TreeNode<Integer> f(TreeNode<Integer>root,  TreeNode<Integer> p, TreeNode<Integer> q){
        if(root == null) return root;

        if(p == root && q == root) return root;

        if(p.data < root.data && q.data < root.data) {
            return f(root.left, p , q);
        }
        if(p.data > root.data && q.data > root.data) {
            return f(root.right, p, q);
        }

        return root;
    }
}
