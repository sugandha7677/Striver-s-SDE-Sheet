public class 125.LCA {
    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) 
    {
        //    Write your code here.
        return lca(root, x, y).data;
        
    }
    static TreeNode<Integer> lca(TreeNode<Integer> root, int x, int y){
        if(root == null || root.data == x || root.data == y) return root;

        TreeNode<Integer> left = lca(root.left, x, y);
        TreeNode<Integer> right = lca(root.right, x, y);

        if(left == null )return right;

        else if(right == null) return left;

        else return root;
    }
}
