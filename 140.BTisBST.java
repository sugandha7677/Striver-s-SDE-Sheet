public class 140.BTisBST {
    
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        // Write your code here
        return f(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean f(BinaryTreeNode<Integer> node, int lo , int hi){
        
        if(node == null) return true;
        
        if(node.data > hi || node.data < lo) return false;
        
        return f(node.left, lo, node.data) && f(node.right, node.data, hi);
    }
}
