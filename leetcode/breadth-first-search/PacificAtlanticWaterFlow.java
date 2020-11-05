// Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent, the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and bottom edges.

// Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.

// Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.

// Note:
    // The order of returned grid coordinates does not matter.
    // Both m and n are less than 150.

// Example:

// Given the following 5x5 matrix:

//   Pacific ~   ~   ~   ~   ~ 
//        ~  1   2   2   3  (5) *
//        ~  3   2   3  (4) (4) *
//        ~  2   4  (5)  3   1  *
//        ~ (6) (7)  1   4   5  *
//        ~ (5)  1   1   2   4  *
//           *   *   *   *   * Atlantic

// Return:

// [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).

public class PacificAtlanticWaterFlow {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List <int []> result = new LinkedList<>();
         
        if (matrix.length ==0 || matrix = 0 || matrix[0].length ==0)
        {
            return result;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean pacific [][] = new boolean [m][n];
        boolean atlantic [][] = new boolean [m][n];
        
        for (i=0;i<m;i++)
        {
            dfs(matrix, pacific, INT.MIN_VALUE,0,i);
            dfs(matrix, atlantic, INT.MIN_VALUE,i,n-1);
        }
        
        for (i=0;i<n;i++)
        {
            dfs(matrix, pacific, INT.MIN_VALUE,i,0);
            dfs(matrix, atlantic, INT.MIN_VALUE, m-1,i);
        }
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(pacific[i][j] && atlantic[i][j])
                {
                    result.add(new int[] {i,j});
                }
            }
        }
        
        return result;
    }
    
    public int dfs( int matrix[][], boolean ocean[][], int height, int x,int y)
    {
        int m = matrix.length;
        int n = matrix[0].length;
        while ( x<0 || x>m || y<0 || y>n || matrix[x][y] < height || ocean [x][y])
        {
            return;
        }
        
        ocean[x][y] = true;
        
        dfs(matrix, ocean,matrix[x][y], x-1,y);
        dfs(matrix, ocean,matrix[x][y], x+1,y);
        dfs(matrix, ocean,matrix[x][y], x,y-1);
        dfs(matrix, ocean,matrix[x][y], x,y+1);
    }
}
             
                  
    
