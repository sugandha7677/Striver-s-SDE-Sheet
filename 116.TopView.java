public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            BinaryTreeNode node = p.node;
            int x = p.row;
            
            if(!map.containsKey(x)) map.put(x , node.val);
                
            if(node.left != null){
                q.add(new Pair(node.left , x - 1));
            }
            if(node.right != null)
                q.add(new Pair(node.right , x + 1));
        }
         for(Map.Entry<Integer,Integer> y : map.entrySet()){
            ans.add(y.getValue());
        }
        
        return ans;
        
	}
}

class Pair{
    BinaryTreeNode node;
    int row;
    
    Pair(BinaryTreeNode node , int row){
        this.node = node;
        this.row = row;
    }
}
