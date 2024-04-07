import java.util.*;

public class Graph{
    class Cell{
        int row;
        int col;
        int time;

        public Cell(int row, int col, int time){
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static int rottenTomatoes(int[][] tomatoes){
        int rows = tomatoes.length;
        int cols = tomatoes[0].length;
        int vis[][] = new int[rows][cols];
        // using bfs
        Queue<Cell> que = new LinkedList<>();
        // boolean vis[][] = new boolean[rows][cols];
        int max_time = 0;
        int fresh =0;
        for(int i=0; i<rows; i++){
           for(int j=0; j<cols; j++){
            if(tomatoes[i][j] == 2){
                que.add(new Cell(i, j, 0));
                vis[i][j] = 2;
            }
            if(tomatoes[i][j] ==1){
                fresh++;
            }
           }
        }
        // int[][] direction = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        int count =0;
        int delRow[] = {-1,0,1,0};
        int delCol[] = {0,1,0,-1};
        while(!que.isEmpty()){
            Cell curr = que.poll();
            int row = curr.row;
            int col = curr.col;
            int time = curr.time;
            
            max_time = Math.max(max_time, time);
            for(int i=0; i<4; i++){
               int new_row = row + delRow[i];
               int new_col = col + delCol[i];
               if(new_row >=0 && new_row < rows 
               && new_col >=0 && new_col < cols 
               && tomatoes[new_row][new_col] == 1 
               && vis[new_row][new_col] != 2){
                que.add(new Cell(new_row, new_col, time+1));
                vis[new_row][new_col] = 2;
                count ++;
               }
            }
        }if(fresh != count) return -1;
           return max_time; 
        }
        
    
    public static void main(String[] args){
        int[][] tomatoes = {
            {2,1,1},
            {1,0,2},
            {1,1,0}
        };
        int time = rottenTomatoes(tomatoes);
        System.out.println(time);
    }
}