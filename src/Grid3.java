public class Grid3 {

  /* public int x;
  public int y;
  public Grid3 newGrid*/
  int[][] grid;

  Grid3() {
    this.grid = new int[][] {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
  }
  
  Grid3(int square) {
    this.grid = new int[square][square];
  }
  
  Grid3 nextGrid = new Grid3(3);

  public int getValue(int x, int y) {
    return this.grid[x][y];
  }

  public void setAlive(int x, int y) {
    this.grid[x][y] = 1;
  }

  public void setDead(int x, int y) {
    grid[x][y] = 0;
  }

  public int getNeighbours(int x, int y) {
    int counter = 0;
    for (int j = y - 1; j < y + 2; j++) {
      for (int i = x - 1; i < x + 2; i++) {
        if (!(i == x && j == y)) {
          counter += getValue(i, j);
        }
      }
    }
    return counter;
  }

  public int getNextState(int x, int y) {
    return getValue(x, y) == 1 ? 0 : 1;
  }

  public void assignTo(Grid3 newGrid, int x, int y, int assigned) {
    if (assigned == 1) {
      newGrid.setAlive(x, y);
    } else if (assigned == 0) {
      newGrid.setDead(x, y);
    }
  }

  public void getNextGrid() {
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        assignTo(nextGrid, i, j, getNextState(i, j));
      }
    }
  }
}
