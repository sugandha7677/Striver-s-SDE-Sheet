public class 154.countDistinctEleminKsizeWindow {
    
    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap();

		for(int i = 0; i < arr.size(); i++){
			int val = arr.get(i);
			map.put(val, map.getOrDefault(val, 0) + 1);

			if(i >= k - 1){
				int count  = 0;
				for(Map.Entry<Integer, Integer> entry : map.entrySet()){
					if(entry.getValue() > 0) count++;
				}
				list.add(count);
				int v = arr.get(i - k + 1);
				map.put(v, map.getOrDefault(v, 0) - 1);
			}
		}

		return list;
	}
}
