public class Grid5 {
  int[][] grid;

  Grid5(int x, int y){
    grid = new int[x][y];
  }
  
  
  public void set(int x, int y, int set) {
    grid[x][y] = set;
  }
  
  public int get(int x, int y) {
    return grid[x][y];
  }
  
  
  public int getNeighbors(int x, int y) {
    return 0;
  }
}
