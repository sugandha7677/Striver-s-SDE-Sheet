public class 162.ToposortBFS {
    
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < v; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(ArrayList<Integer> edge : edges){
            int src = edge.get(0);
            int dest = edge.get(1);

            graph.get(src).add(dest);
        }

        int [] indegree = new int[v];

        for(ArrayList<Integer> node : graph){
            for(int i = 0 ; i < node.size(); i++){
                indegree[node.get(i)]++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < v; i++){
            if(indegree[i] == 0) q.add(i);
        }

        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);

            for(int nbr : graph.get(node)){
                indegree[nbr]--;
                if(indegree[nbr] == 0) q.add(nbr);
            }
        }

        return ans;
    }
}

// DFS
public class ToposortDFS
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < v; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(ArrayList<Integer> edge : edges){
            int src = edge.get(0);
            int dest = edge.get(1);

            graph.get(src).add(dest);
        }

        boolean [] visited = new boolean[v];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < v; i++){
            if(visited[i] == false){
                toposort(graph, i, st, visited);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while(!st.isEmpty()){
            ans.add(st.pop());
        }

        return ans;
    }

    static void toposort(ArrayList<ArrayList<Integer>> graph, int i , Stack<Integer> st, boolean []visited){

        visited[i] = true;

        for(int nbr : graph.get(i)){
            if(!visited[nbr]){
                toposort(graph, nbr, st, visited);
            }
        }
        st.push(i);
    }
}

