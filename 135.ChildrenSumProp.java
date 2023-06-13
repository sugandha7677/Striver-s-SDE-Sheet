public class 135.ChildrenSumProp {
    public static void changeTree(BinaryTreeNode < Integer > root) {
        // Write your code here.
       if(root == null) return;

       int child = 0;
       if(root.left != null) child += root.left.data;

       if(root.right != null) child += root.right.data;

       if(root.data  > child) {
           if(root.left != null) root.left.data = root.data;
           if(root.right != null) root.right.data = root.data;
       }

       changeTree(root.left);
       changeTree(root.right);


        int t = 0;
        if(root.left != null) t += root.left.data;

       if(root.right != null) t += root.right.data;

       if(root.left != null || root.right != null) root.data  = t;
    }
}
