public class 114.LeftViewBT {
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> list = new ArrayList<Integer>();
        recursion(root, 0, list);
        return list;
    }

    static void recursion(TreeNode<Integer> root, int level,ArrayList<Integer> list ){
        if(root == null) return;

        if(level == list.size()) list.add(root.data);

        recursion(root.left, level + 1, list);
        recursion(root.right, level + 1, list);
    }
}
//SC: O(H)
// TC: O(n)
