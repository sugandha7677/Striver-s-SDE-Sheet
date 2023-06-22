class 41.removeDuplicates{

    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int idx = 0;
		for(int i = 1; i < arr.size(); i++){
			if(!arr.get(i).equals(arr.get(i-1))) idx++;
		}

		return idx + 1;
	}
}