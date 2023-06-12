public class Solution {
	public static int getMaxWidth(TreeNode root) {

		if(root == null) return 0;
		
		int max = Integer.MIN_VALUE;

		Queue<pair> q = new LinkedList<>();
		q.add(new pair(root, 0));
		int count = 0;

		while(!q.isEmpty()){
			
			int size = q.size();
			
			//int nullNodes = (int)Math.pow(2, level) - size;

			int first = 0;
			int last = 0;
			int min = q.peek().x;
			for(int i = 0; i < size; i++){
				int currmin = q.peek().x - min;
				pair p = q.poll();
				if(i == 0) first = currmin;
				if(i == size - 1) last = currmin;

				if(p.node.left != null) {
					q.add(new pair(p.node.left, ++count));
				}
				if(p.node.right != null) {
					q.add(new pair(p.node.right, ++count));
				}
			}
			
			
			max = Math.max(max, last - first + 1 );
		}
		return max;

	}
}

class pair{
	TreeNode node;
	int x;

	pair(TreeNode node, int x){
		this.node = node;
		this.x =x;
	}
}
