public class 167.BellmanFordAlgo {
    
    static int bellmonFord(int n, int m, int s, int d, ArrayList<ArrayList<Integer>> edges) {
      // Write your code here.

      int [] dist = new int [n + 1];
      Arrays.fill(dist , (int)1e9);
      dist[s] = 0;

      for(int  i = 0; i < n; i++){
        for(ArrayList<Integer> nbr : edges){

          int src = nbr.get(0);
          int dest = nbr.get(1);
          int wt = nbr.get(2);

          if(dist[src] != (int) 1e9 && dist[src] + wt < dist[dest]){
            dist[dest] = dist[src] + wt;
          }
        }
      }

      return dist[d];
    }
    
}
