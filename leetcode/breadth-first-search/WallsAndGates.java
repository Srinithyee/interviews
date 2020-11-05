// You are given a m x n 2D grid initialized with these three possible values.

// -1 - A wall or an obstacle.
// 0 - A gate.
// INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.
// Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.

// For example, given the 2D grid:
// INF  -1  0  INF
// INF INF INF  -1
// INF  -1 INF  -1
//   0  -1 INF INF
// After running your function, the 2D grid should be:
//   3  -1   0   1
//   2   2   1  -1
//   1  -1   2  -1
//   0  -1   3   4

public class Solution {
    public void wallsAndGates(int[][] rooms) {
        
        for (i=0;i<rooms.length;i++)
        {
            for(j=0;j<rooms[0].length;j++)
            {
                if (rooms[i][j] ==0)
                dfs(rooms, 0,i,j);
            }
        }
        
    }
    
    public boolean dfs(int rooms[][], int distance, i, j)
    {
        while (i< 0 || i>rooms.length || j<0 || j> rooms[0].length || rooms[i][j] < distance )
        {
            return;
        }
        
        rooms[i][j]=distance;
        dfs(rooms,distance +1, i+1,j);
        dfs(rooms,distance +1, i-1,j);
        dfs(rooms,distance +1, i,j-1);
        dfs(rooms,distance +1, i,j+1);
    }
}
        
       
