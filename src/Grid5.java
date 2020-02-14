public class Grid5 {
  int[][] grid;

  Grid5(int x, int y) {
    grid = new int[x][y];
  }

  public void set(int x, int y, int set) {
    grid[x][y] = set;
  }

  public int get(int x, int y) {
    return grid[x][y];
  }

  public int getNeighbors(int x, int y) {
    int counter = 0;
    for (int i = x - 1; i < x + 2; i++) {
      for (int j = y - 1; j < y + 2; j++) {
        if (i == x && j == y || i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
          continue;
        }
        counter += get(i, j);
      }
    }
    return counter;
  }
  
  
}
