public class 127.ZigZagTraversal {
    public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		// Write your code here!
		List<Integer> ans = new ArrayList<>();

		if(root == null) return ans;

		int level = 0;

		Queue<BinaryTreeNode<Integer>>q = new LinkedList<>();

		q.add(root);
		ArrayList<Integer> l;

		while(!q.isEmpty()){
			int size = q.size();
			l = new ArrayList<>();
			while(size-- > 0){
				BinaryTreeNode<Integer> n = q.poll();
				l.add(n.data);
				if(n.left != null) q.add(n.left);

				if(n.right != null) q.add(n.right);
			}

			if(level % 2 == 0){
				for(int i = 0; i < l.size(); i++){
					ans.add(l.get(i));
				}
			}else{
				for(int i = l.size() - 1; i >= 0 ; i--){
					ans.add(l.get(i));
				}
			}
			level++;
		}

		return ans;

	}
}
