
public class MedianFromDataStream{

    static PriorityQueue<Integer> maxHeap;
        static PriorityQueue<Integer> minHeap;
        static int [] median;

        public static int[] findMedian(int[] arr, int n) {
            // Write your code here.
            median = new int [n];
        

            maxHeap = new PriorityQueue<>((a,b) -> b - a);
            minHeap = new PriorityQueue<>();

            for(int i = 0; i < n; i++){
                addNum(arr[i]);
                median[i] = findMedian();
            }

            return median;
            
        }

        static void addNum(int num){
            if(maxHeap.isEmpty() || maxHeap.peek() >= num){
                maxHeap.add(num);
            }

            else minHeap.add(num);

            if(maxHeap.size() > minHeap.size() + 1) minHeap.add(maxHeap.poll());

            else if(maxHeap.size() < minHeap.size()) maxHeap.add(minHeap.poll());
        }

        static int findMedian(){
            if(maxHeap.size() == minHeap.size()) 
                return (maxHeap.peek() + minHeap.peek()) / 2;

            return maxHeap.peek();
        }
}