public class 156.FloodFillAlgo {
    
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
        if(image.length == 0 ) return image;

        dfs(image, x, y , image[x][y], newColor);

        return image;
    }

    static void dfs(int [][] image, int src, int dest, int inicol, int color){
        if(src < 0 || src >= image.length || dest < 0 || dest >= image[0].length || 
        image[src][dest] != inicol || image[src][dest] == color ) return;

        image[src][dest] = color;

        dfs(image, src + 1, dest, inicol, color);
        dfs(image, src , dest + 1, inicol, color);
        dfs(image, src - 1, dest, inicol, color);
        dfs(image, src , dest - 1, inicol, color);
    }
}
