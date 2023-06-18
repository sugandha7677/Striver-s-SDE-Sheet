public class 148.BSTIterator {
    static class BSTIterator{

        Stack<TreeNode<Integer>>st = new Stack<>();
        BSTIterator(TreeNode<Integer> root){
            // Write your code here
            while(root != null){
                st.push(root);
                root = root.left;
            }

        }

        int next(){
            // Write your code here
            TreeNode<Integer> node = null;
            if(!st.isEmpty()) node = st.pop();
            TreeNode<Integer> n = node.right;
            while(n != null){
                st.push(n);
                n = n.left;
            }
            return node.data;
        }

        boolean hasNext(){
            // Write your code here
            return !st.isEmpty();
        }
    }
}
