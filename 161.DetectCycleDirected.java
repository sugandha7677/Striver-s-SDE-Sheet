public class 161.DetectCycleDirected {
    
    public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    // Write your code here.

    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    for(int i = 0; i <= n; i++ ){
      graph.add(new ArrayList<Integer>());
    }

    for(int i = 0; i < edges.size(); i++){
      int src = edges.get(i).get(0);
      int dest = edges.get(i).get(1);

      graph.get(src).add(dest);
    }

    boolean [] visited = new boolean[n+1];
    boolean [] pathVis = new boolean[n+1];

    for(int i = 1; i <= n; i++){
      if(visited[i] == false){
        if(dfs(graph, i, visited, pathVis)) return true;
      }
    }

    return false;
  }

  static boolean dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean [] visited, boolean [] pathVis){

    visited[node] = true;
    pathVis[node] = true;

    for(int i = 0; i < graph.get(node).size(); i++){
      int nbr = graph.get(node).get(i);

      if(pathVis[nbr]) return true;

      else if(visited[nbr] == false){
        if(dfs(graph, nbr, visited,  pathVis)) return true;
      }
    }

    pathVis[node] = false;

    return false;
  }
}
