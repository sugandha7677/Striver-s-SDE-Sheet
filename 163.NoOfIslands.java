public class 163.NoOfIslands {
    
    static int [] di = {+1, -1, 0, +1, 0, -1, +1, -1};
    static int [] dj = {-1, 0, +1, 0, -1, +1, +1, -1};
    public static int getTotalIslands(int[][] mat) 
	{
        //Your code goes here
        int n = mat.length;
        int m = mat[0].length;

        boolean [][]visited = new boolean[n][m];

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(visited[i][j] == false && mat[i][j] == 1){
                    count++;
                    dfs(mat, i, j, visited);
                }
            }
        }

        return count;
    }

    static void dfs(int [][]mat, int i, int j, boolean [][] visited){

        int n = mat.length;
        int m = mat[0].length;

        if(i < 0 || i >= n || j < 0 || j >= m ) return;

        visited[i][j] = true;

        for(int l = 0; l < 8; l++){
            int ni = di[l] + i;
            int nj = dj[l] + j;

            if(ni >= 0 && ni < n && nj >= 0 && nj < m && visited[ni][nj] == false && mat[ni][nj] == 1){
                dfs(mat, ni, nj, visited);
            }
        }
    }
}
