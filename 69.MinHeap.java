public class 69.MinHeap {
    
    static int[] minHeap(int n, int[][] q) {
        // Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        ArrayList<Integer> ans = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < q.length; i++){
            int option = q[i][0];
            if(option == 0) {
                pq.add(q[i][1]);
            }
            else{
                ans.add(pq.poll());
                
            }
        }
        int [] arr = new int [ans.size()]; 

        for(int i = 0; i < ans.size(); i++) arr[i] = ans.get(i);

        return arr;
    }
}
