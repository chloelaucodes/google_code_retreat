import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


/** Implements game of life. Given a state of the game, it returns the next state.*/
public class Grid4 {
  
  /**
   * Given the current state of the game represented by 2D array. where 1 means live cell and
   * zero means dead one.
   * <p>Compute and return the next state of the game with the same representation.
   */
  int[][] getNextState(int[][] grid){
    int[][] newGrid = new int[grid.length][grid[0].length];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        newGrid[i][j] = shouldBeAliveCell(grid, i, j);
      }
    }
    return newGrid;
  }
  /**
   * Computes whether the cell located at x & y should be alive in the next generation.
   */
  int shouldBeAliveCell(int[][] grid, int x, int y){
    if (grid[x][y] == 0 && countLiveNeighbors(grid, x, y) == 3
            || grid[x][y] == 1 && (countLiveNeighbors(grid, x, y) == 2
            || countLiveNeighbors(grid, x, y) == 3)){
      return 1;
    }
    return 0;
  }
  
  /**
   * Counts the number of the live neighbors for a cell located at x & y.
   */
  int countLiveNeighbors(int[][] grid, int x, int y){
    int counter = 0;
    for (Point validNeighbor : getValidNeighbors(grid, x, y)){
      counter += grid[validNeighbor.x][validNeighbor.y];
    }
    return counter;
  }
  
  /**
   * Returns the valid neighbours for a cell.
   */
  List<Point> getValidNeighbors(int[][] grid, int x, int y){
    List<Point> validNeighbors = new ArrayList();
    for (int i = x - 1; i < x + 2; i ++){
      for (int j = y - 1; j < y + 2; j ++){
        if (i == x && j == y){
          continue;
        }
        if (isValidNeighbour(grid, i, j)){
          validNeighbors.add(new Point(i, j));
        }
      }
    }
    return validNeighbors;
  }
  /**
   * Whether the neighbor is a valid one.
   */
  boolean isValidNeighbour(int[][] grid, int neighbourX, int neighbourY){
    return neighbourX >= 0 && neighbourX < grid.length && neighbourY >= 0 && neighbourY < grid[neighbourX].length;
  }
}
