class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        
        // sorting
        int [][]a = new int [n][2];
        
        
        for(int i = 0; i < start.length; i++){
            a[i][0] = start[i];
            a[i][1] = end[i];
        }
        
      Arrays.sort(a, Comparator.comparingInt(o -> o[1]));
        
        int count = 1;
        int prevEnd = a[0][1];
        
        for(int i = 1; i < n; i++){
            if(a[i][0] > prevEnd){
               count++;
               prevEnd = a[i][1];
            } 
        }
        
        return count;
    }
}


