public class 8.MergeIntervals {
    
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        // sort 

        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i, Interval j){
                return i.start - j.start;
            }
        });

        //merge
        int idx = 0;

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i].start <= intervals[idx].finish){
                intervals[idx].finish = Math.max(intervals[idx].finish, intervals[i].finish);
            }

            else {
                idx++;
                intervals[idx] = intervals[i];
            }
        }

        List<Interval> list = new ArrayList<>();
        for(int i = 0; i <= idx; i++){
            list.add(intervals[i]);
        }
        return list;
    }
}
