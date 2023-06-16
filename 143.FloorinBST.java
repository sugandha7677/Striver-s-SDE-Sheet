public class 143.FloorinBST {
    
    public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
       int floor = -1;

       while(root != null){
           if(root.data == X){
               floor = root.data;
               return floor;
           }

           if(X > root.data){
               floor = root.data;
               root = root.right;
           }else{
               root = root.left;
           }
       }

        return floor;
    }

}
