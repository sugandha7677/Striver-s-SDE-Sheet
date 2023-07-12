public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();

		Integer[] arr = new Integer[permutation.size()];
        arr = permutation.toArray(arr);

		int idx  = -1;
		for(int i = arr.length - 2; i >= 0; i-- ){
			if(arr[i] < arr[i + 1]){
				idx = i;
				break;
			}
		}

		if(idx == -1) {
			Collections.sort(permutation);
			return permutation;
		}

		for(int i = arr.length - 1; i >= 0; i--){
			if(arr[i] > arr[idx]){
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				break;
			}
		}
		
		int lo = idx + 1;
		int hi = arr.length - 1;
		while(lo++ < hi--){
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
		}
			
		for(Integer i : arr){
			list.add(i);
		}

		return list;
	}