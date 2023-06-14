public class 131.BTfronInorderPostorder {
    	public static TreeNode<Integer> getTreeFromPostorderAndInorder(int[] postOrder, int[] inOrder) {
		// Write your code here.

    if(inOrder == null || postOrder == null || postOrder.length != inOrder.length) return null;

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i < inOrder.length; i++){
      map.put(inOrder[i], i);
    }

    TreeNode<Integer> root = buildTree(postOrder,0,postOrder.length - 1, inOrder, 0, inOrder.length - 1,map);
    return root;
	}

  static TreeNode<Integer> buildTree(int [] postorder, int pi, int pe, int [] inorder, int ii,
           int ie, HashMap<Integer, Integer> map){
             
    if(pi > pe || ii > ie) return null;

    TreeNode<Integer> root = new TreeNode(postorder[pe]);
    int idx = map.get(root.data);
    int numsleft = idx - ii;

    root.left = buildTree(postorder, pi, pi + numsleft - 1, inorder, ii, idx - 1, map);

    root.right = buildTree(postorder, pi+numsleft , pe - 1, inorder, idx + 1, ie, map);

    return root;

  }
}
