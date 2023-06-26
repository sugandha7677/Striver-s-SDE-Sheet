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


// BFS --> 
public class Solution{

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

        for(int i =0; i <= n; i++){
            if(visited[i] == false){
                if(bfs(graph, i, visited)) return "Yes";
            }
        }

        return "No";
    }

    static boolean bfs(ArrayList<ArrayList<Integer>> graph, int src, boolean []visited){

        Queue<pair> q = new LinkedList<>();
        q.add(new pair(src, -1));
        visited[src] = true;

        while(!q.isEmpty()){
            pair p = q.poll();

            for(int nbr : graph.get(p.node)){
                if(visited[nbr] == false ){
                    q.add(new pair(nbr, p.node));
                    visited[nbr] = true;
                }
                else if(nbr != p.parent) return true;
            }
            
        }

        return false;
       
    }
    
    
}

class pair{
    int node;
    int parent;

    pair(int n, int p){
        node = n;
        parent = p;
    }
}