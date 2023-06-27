public class 164.BipartiteGraphBFS {
    
    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {

        // Write your code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < edges.size(); i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < edges.size(); i++){
            for(int j = 0; j < edges.get(i).size(); j++){
                if(edges.get(i).get(j) == 1){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        int [] color = new int[edges.size()];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        color[0] = 1;

        while(!q.isEmpty()){
            int node = q.poll();

            for(int nbr : graph.get(node)){
                if(color[nbr] == color[node]) return false;

               else if(color[nbr] == -1){
                    if (color[node] == 1) color[nbr] = 0;
                    else color[nbr] = 1;
                    q.add(nbr);
               }   
            }
        }
        return true;
    }
}

//DFS
public class 164.BipartiteGraphDFS{

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {

        // Write your code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < edges.size(); i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < edges.size(); i++){
            for(int j = 0; j < edges.get(i).size(); j++){
                if(edges.get(i).get(j) == 1){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        int [] color = new int[edges.size()];
        Arrays.fill(color, -1);

        for(int i = 0; i < edges.size(); i++){
            if(color[i] == -1){
                color[i] = 1;
                if(!dfs(graph, i, color)) return false;
            }
        }

        return true;
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> graph, int node, int []color){
        
        for(int nbr : graph.get(node)){
            if(color[nbr] == color[node]) return false;

            else if(color[nbr] == -1){
                if(color[node] == 0) color[nbr] = 1;
                else color[nbr] = 0;
                if(!dfs(graph, nbr, color)) return false;
            }
        }
        return true;
    }
}
