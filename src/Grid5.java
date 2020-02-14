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

  public Grid5 nextBoard() {

    Grid5 newGrid = new Grid5(grid.length, grid[0].length);
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (getNeighbors(i, j) < 2 || getNeighbors(i, j) >= 4) {
          newGrid.set(i, j, 0);
        } else if (getNeighbors(i, j) == 3) {
          newGrid.set(i, j, 1);
        } else if (get(i, j) == 1 && getNeighbors(i, j) == 2) {
          newGrid.set(i, j, 1);
        }
      }
    }
    return newGrid;
  }
}
