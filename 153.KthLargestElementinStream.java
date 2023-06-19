public class 153.KthLargestElementinStream {
    
    PriorityQueue<Integer> minHeap;
    int K;
    Kthlargest(int k, int[] arr) {
        // Write your code here.
        minHeap = new PriorityQueue<>();
        K = k;
        for(int i = 0; i < arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k) minHeap.poll();
        }
    }

    void add(int num) {
        // Write your code here.
        minHeap.add(num);
        if(minHeap.size() > K) minHeap.poll();
    }

    int getKthLargest() {
        // Write your code here.
        return minHeap.peek();
    }
}
