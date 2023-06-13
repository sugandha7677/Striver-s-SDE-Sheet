public class 132.SymmetricBT {
    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        
        if(root == null) return true;

        return check(root.left, root.right);
    }

    static boolean check(BinaryTreeNode<Integer> p1, BinaryTreeNode<Integer> p2){

        if(p1 == null || p2 == null) return p1 == p2;

        return p1.data.equals(p2.data)  && check(p1.left, p2.right) && check(p1.right, p2.left);
    }
}
