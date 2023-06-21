public class 4.MaxSubarraySum {
    
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		Long max = Long.MIN_VALUE;

		Long sum = 0L;
		for(int i = 0; i< arr.length; i++){
			sum += arr[i];
			if(sum < 0) sum = 0L;
			max = Math.max(sum , max);

		}
		return max;
	}
}
