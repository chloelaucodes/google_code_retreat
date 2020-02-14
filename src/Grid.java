public class Grid {
  private int[][] grid;

  public Grid() {
    this.grid = new int[5][5];
  }
  
  public void setAlive(int x, int y){
    this.grid[x][y] = 1;
  }
  
  public boolean checkAlive(int x, int y){
    //if (outOfGrid(x, y)) {
        //return false;
    //}
    return this.grid[x][y] == 1;
  }
  
  //private boolean outOfGrid(i)
  
  public int countAliveNeighbors(int x, int y){
    return 0;
  }
  
  
}
