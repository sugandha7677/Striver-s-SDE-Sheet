public class 160.CycleDetectionUndirected {
    
    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.


        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i <=n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            int src = edges[i][0];
            int dest = edges[i][1];

            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }
        boolean [] visited = new boolean [n + 1];

        for(int i = 1; i <= n; i++){
            if(visited[i] == false){
                if(dfs(graph, i, visited, -1)){
                    return new String("Yes");
                }
            }
        }

        return "No";
    }
    
    static boolean dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean [] visited, int parent){

        visited[node] = true;

        for(int i = 0; i < graph.get(node).size(); i++){
            int nbr = graph.get(node).get(i);
            if(visited[nbr] == false){
                if(dfs(graph, nbr, visited, node) == true) return true;
            }
            else if(visited[nbr] == true && parent != nbr) {
                return true;
            
            }

        }

        return false;

        
    }
}
