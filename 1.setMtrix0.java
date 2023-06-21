public class 1.setMtrix0 {
    
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int [] row = new int[matrix.length];
        int [] col = new int[matrix[0].length];
        Arrays.fill(row, 1);
        Arrays.fill(col, 1);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(row[i] == 0 || col[j] == 0){
                  matrix[i][j] = 0;
                }
            }
        }
    }
}
