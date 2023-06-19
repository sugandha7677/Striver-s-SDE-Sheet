public class 155.KthLargestInUnsortedArray {
    
    static int kthLargest(ArrayList<Integer> arr, int size, int K) {
		// Write your code here.
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i = 0; i < arr.size(); i++){
			pq.add(arr.get(i));
			if(pq.size() > K) pq.poll();
		}

		return pq.peek();
	}
}
