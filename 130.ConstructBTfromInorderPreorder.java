public class 130.ConstructBTfromInorderPreorder {
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  inorder, ArrayList<Integer>  preorder) 
    {
        //    Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.size(); i++){
            map.put(inorder.get(i), i);
        }

        TreeNode<Integer> root = buildTree(preorder, 0 , preorder.size() - 1, inorder, 0, inorder.size() - 1, map);
        return root;
    }

    static TreeNode<Integer> buildTree(ArrayList<Integer> preorder, int pi , int pe, ArrayList<Integer> inorder, int ii, int ie,
        HashMap<Integer, Integer> map) {

            if(pi > pe || ii > ie) return null;

            TreeNode<Integer> root = new TreeNode(preorder.get(pi));
            int index = map.get(root.data);
            int numsLeft = index - ii;

            root.left = buildTree(preorder, pi + 1, pi + numsLeft, inorder, ii, index - 1, map);

            root.right = buildTree(preorder, pi + numsLeft + 1, pe, inorder, index + 1, ie, map);

            return root;
    }
}

// TC: O(N) or O(nlogn) map operation
// SC: O(N) -- map + O(n) --rec
