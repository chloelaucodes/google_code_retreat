public class Grid5 {
  int[][] grid;

  Grid5(int x, int y){
    grid = new int[x][y];
  }
  
  
  public void set(int i, int i1, int i2) {
    grid[i][i1] = i2;
  }
}
