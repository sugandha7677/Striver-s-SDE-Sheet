public class 70.KthSmallestLargest {
    
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b- a);

		for(int i = 0; i < arr.size(); i++){
			minHeap.add(arr.get(i));
			maxHeap.add(arr.get(i));

			if(maxHeap.size() > k) maxHeap.poll();
			if(minHeap.size() > k) minHeap.poll();
		}

		ArrayList<Integer> ans= new ArrayList<>();
		ans.add(maxHeap.peek());
		ans.add(minHeap.peek());

		return ans;
	}
}
