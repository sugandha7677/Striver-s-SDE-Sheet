public class 158.DFSTraversal {
    static ArrayList<ArrayList<Integer>> ans;
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i =0; i < v; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(ArrayList<Integer> node : edges){
            int src = node.get(0);
            int dest = node.get(1);

            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }

        ans = new ArrayList<>();

        boolean [] visited = new boolean[v];
        for(int i = 0; i < v; i++){
            if(visited[i] == false){
                ArrayList<Integer> list = new ArrayList<>();
                dfs(graph, i, visited, list);
                ans.add(list);
            }
        }

        return ans;
        
    }

    static void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean [] visited, 
            ArrayList<Integer> list){

                visited[node] = true;
                list.add(node);

                for(int i = 0; i < graph.get(node).size(); i++){
                    int nbr = graph.get(node).get(i);
                    if(visited[nbr] == false){
                        dfs(graph, nbr, visited, list);
                    }
                }
    }
}
