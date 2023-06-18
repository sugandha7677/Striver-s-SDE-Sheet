public class 147.PairSuminBST {
    
    public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.

		HashSet<Integer> set = new HashSet<>();
		return f(root, k, set);	
		
	}

	static boolean f(BinaryTreeNode root,int k , HashSet<Integer> set ){
		if(root == null) return false;

		if(set.contains(k-root.data)) return true;

		set.add(root.data);
		return f(root.left, k, set) || f(root.right, k, set);
	}
}

// TC: O(n) 
// SC: O(N)
