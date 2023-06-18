public class 146.KhSmallestinBST {
    public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//  Write your code here.
		TreeNode<Integer> curr = root;

		int count = 0;
		while(curr != null){
			if(curr.left == null) {
				count++;
				if(count == k) return curr.data;
				curr = curr.right;
			}

			else{
				TreeNode<Integer> prev = curr.left;
				while(prev.right != null && prev.right != curr){
					prev = prev.right;
				}

				if(prev.right == null ){
					// make thread
					prev.right = curr;
					curr = curr.left;
				}else{
					prev.right = null;
					count++;
					if(count == k) return curr.data;
					curr = curr.right;
				}
			}
		}

		return 0;

	}
}
