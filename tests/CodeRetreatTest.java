import org.junit.Test;

import static org.junit.Assert.*;

public class CodeRetreatTest {
  @Test
  public void testCreateGrid() {
    Grid grid = new Grid();
    
  }
  
  @Test
  public void testAlive(){
    Grid grid = new Grid();
    grid.setAlive(2, 2);
    assertTrue(grid.checkAlive(2, 2));
  }
  @Test (expected = IndexOutOfBoundsException.class)
  public void testSetAliveOutOfBounds(){
    Grid grid = new Grid();
    grid.setAlive(-2, 2);
  }
  @Test
  public void testCheckAliveOutOfBounds(){
    Grid grid = new Grid();
    assertEquals(0, grid.checkAlive(-2, 2));
  }
  
  @Test
  public void testCheckNeighbor(){
    Grid grid = new Grid();
    assertEquals(0, grid.countAliveNeighbors(2, 2));
  }
}
