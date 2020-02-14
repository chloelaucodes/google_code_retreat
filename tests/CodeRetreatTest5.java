import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CodeRetreatTest5 {

  @Test
  public void testCreateGrid() {
    Grid5 grid = new Grid5(5, 5);
  }

  @Test
  public void testSet() {
    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
  }

  @Test
  public void testGetAlive() {

    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
    assertEquals(grid.get(1, 2), 1);
  }

  @Test
  public void testGetNeighbors() {
    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
    assertEquals(grid.getNeighbors(1, 2), 0);
  }

  @Test
  public void testGetNeighbors2() {
    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
    assertEquals(grid.getNeighbors(1, 1), 1);
  }

  @Test
  public void testEdgeCases() {
    Grid5 grid = new Grid5(5, 5);
    assertEquals(grid.getNeighbors(0, 1), 0);
  }
  
  @Test
  public void testNextBoard(){
    Grid5 grid = new Grid5(5, 5);
    assertNotEquals(grid, grid.nextBoard());
  }
  
  @Test
  public void testDie(){
    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
    Grid5 newGrid =grid.nextBoard();
    assertEquals(0, newGrid.get(1, 2));
  }
  
  @Test
  public void testDie2(){
    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
    grid.set(1, 1, 1);
    grid.set(2, 2, 1);
    grid.set(3, 1, 1);
    Grid5 newGrid = grid.nextBoard();
    assertEquals(0, newGrid.get(2, 1));
  }
  
  @Test
  public void testBorn(){
    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
    grid.set(1, 1, 1);
    grid.set(3, 1, 1);
    Grid5 newGrid = grid.nextBoard();
    assertEquals(1, newGrid.get(2, 1));
  }
  
  @Test
  public void testSurvive(){
    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
    grid.set(1, 1, 1);
    grid.set(1, 3, 1);
    Grid5 newGrid = grid.nextBoard();
    assertEquals(1, newGrid.get(1, 2));
  }
}
