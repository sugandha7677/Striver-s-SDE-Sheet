public class 2.PascalsTriangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {

		ArrayList<ArrayList<Long>> ans = new ArrayList<>();

		ArrayList<Long> l = new ArrayList<>();
		l.add(1L);
		ans.add(l);

		for(int i = 1; i < n; i++){
			ArrayList<Long> ll = new ArrayList<>();
			ArrayList<Long> prev = ans.get(i-1);
			for(int j = 0; j <= i; j++){
				if(j == 0) ll.add(1L);
				else if(j == i) ll.add(1L);
				else{
					ll.add(prev.get(j - 1) + prev.get(j));
				}
			}
			ans.add(ll);
		}
		return ans;
	}
}
