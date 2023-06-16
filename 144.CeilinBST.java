public class 144.CeilinBST {
    
    public  static int findCeil(TreeNode<Integer> root, int x) {

        // Write your code here
        int ceil = -1;

        while(root != null){
            if(root.data == x){
                ceil = root.data;
                return ceil;
            }

            if(root.data > x ){
                ceil = root.data;
                root = root.left;
            }else{
                root = root.right;
            }
        }

        return ceil;

    }
}
