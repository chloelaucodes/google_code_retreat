import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeRetreatTest3 {

  @Test
  public void testCreateGrid() {
    Grid3 grid = new Grid3();
  }

  @Test
  public void testGetValue() {
    Grid3 grid = new Grid3();
    assertEquals(1, grid.getValue(1, 1));
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testGetNegativeIndex() {
    Grid3 grid = new Grid3();
    assertEquals(1, grid.getValue(-4, 1));
  }

  @Test
  public void testSetAlive() {
    Grid3 grid = new Grid3();
    grid.setAlive(1, 0);
    assertEquals(1, grid.getValue(1, 0));
  }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void testSetAliveNegativeIndex() {
        Grid3 grid = new Grid3();
        grid.setAlive(-4, 0);
        assertEquals(1, grid.getValue(1, 1));
    }

  @Test
  public void testSetDead() {
    Grid3 grid = new Grid3();
    grid.setDead(1, 1);
    assertEquals(0, grid.getValue(1, 1));
  }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void testSetDeadNegativeIndex() {
        Grid3 grid = new Grid3();
        grid.setDead(-4, 0);
        assertEquals(1, grid.getValue(1, 1));
    }

  @Test
  public void testGetNeighbours() {
    Grid3 grid = new Grid3();
    assertEquals(1, grid.getNeighbours(1, 0));
  }

  @Test
  public void testGetNextState() {
    Grid3 grid = new Grid3();
    assertEquals(0, grid.getNextState(1, 0));
  }

  @Test
  public void testAssignAliveNewGrid() {
    Grid3 grid = new Grid3();
    Grid3 newGrid = new Grid3();
    grid.assignTo(newGrid, 2, 2, 1);
    assertEquals(1, newGrid.getValue(2, 2));
  }

  @Test
  public void testAssignDeadNewGrid() {
    Grid3 grid = new Grid3();
    Grid3 newGrid = new Grid3();
    grid.assignTo(newGrid, 0, 1, 0);
    assertEquals(0, newGrid.getValue(2, 2));
  }
  
  @Test
    public void testRunAllGrid(){
      Grid3 grid = new Grid3();
      Grid3 newGrid = new Grid3();
      grid.getNextGrid();
      
      assertEquals(new int[][] {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}}, newGrid);
  }
}
