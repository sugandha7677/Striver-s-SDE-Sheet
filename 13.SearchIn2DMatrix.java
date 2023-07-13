public class 13.SearchIn2DMatrix {
    
     static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int k) {
        // Write your code here.
        int lo = 0;
        int hi = mat.get(0).size() - 1;

        if(mat.get(lo).get(hi) == k) return true;

        while(lo < mat.size() && hi >= 0 ){
            if(mat.get(lo).get(hi) == k) return true;
            else if(mat.get(lo).get(hi) > k ) hi--;
            else lo++;
        }

        return false;
    }
        
}
