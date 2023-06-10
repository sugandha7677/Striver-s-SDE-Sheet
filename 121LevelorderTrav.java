public class 121LevelorderTrav {
    
    static ArrayList<Integer> list;
  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
	list = new ArrayList<>();
	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	if(root == null) return list;

	q.add(root);

	while(!q.isEmpty()){
		BinaryTreeNode node = q.poll();
		list.add(node.val);
		if(node.left != null) q.add(node.left);
		if(node.right != null) q.add(node.right);

	}

	return list;
  }
}
