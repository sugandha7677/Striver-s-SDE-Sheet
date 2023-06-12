public class 119.RoottoNodePath {
     public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;

        if(f(root, x, list) == true) return list;
        return list;
    
    }

    static boolean f(TreeNode root, int x, ArrayList<Integer> list) {  
        if(root == null ) return false;

        list.add(root.data);

        if(root.data == x) { 
            return true;
        }


        if ( f(root.left, x, list) || f(root.right, x, list) ) return true;

        list.remove(list.size() - 1);

        return false;
        
    }
}
