public class FloydWarshallAlgo {
    static int floydWarshall(int n, int m, int s, int d, ArrayList<ArrayList<Integer>> edges) {
    // Write your code here.
    int [][] cost = new int[n+1][n+1];

    for(int [] c : cost)
      Arrays.fill(c, (int) 1e9);
    

    for(int i = 0; i < n +1; i++){
      for(int j = 0; j < n+ 1; j++){
          if(i == j){
            cost[i][j] = 0;
          }
      }
    }

    for(ArrayList<Integer> nbr : edges){
      int src = nbr.get(0);
      int dest = nbr.get(1);
      int wt = nbr.get(2);

      cost[src][dest] = wt;
    }

    for(int via = 0; via < n + 1; via++){
      for(int i = 0; i < n + 1; i++){
        for(int j = 0; j < n +1; j++){

          if(cost[i][via] ==(int) 1e9 || cost[via][j] == (int) 1e9) continue;

          cost[i][j] = Math.min(cost[i][via] +cost[via][j], cost[i][j]);
        }
      }
    }

    return cost[s][d];

  }
}