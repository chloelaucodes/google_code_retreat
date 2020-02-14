import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeRetreatTest2 {
  @Test
  public void testCreateGrid() {
    Grid2 grid = new Grid2(5, 5);
  }

  @Test
  public void testInitialisetGrid() {
    Grid2 grid = new Grid2(5, 5);
    assertEquals(grid.getValue(2, 2), 1);
  }
  
  @Test
  public void testSetAlive() {
    Grid2 grid = new Grid2(5, 5);
    grid.setAlive(1, 1);
    assertEquals(grid.getValue(1,1), 1);
  }
  
  @Test
  public void testSetDead() {
    Grid2 grid = new Grid2(5, 5);
    grid.setDead(2, 2);
    assertEquals(grid.getValue(2, 2), 0);
  }
  
  @Test
  public void testCountN() {
    Grid2 grid = new Grid2(5, 5);
    assertEquals(grid.countN(2, 2), 0);
  }
  
  @Test
  public void testCountN2() {
    Grid2 grid = new Grid2(5, 5);
    grid.setAlive(2, 1);
    assertEquals(grid.countN(2, 1), 1);
  }
  
  @Test
  public void testNextSimulationBirth() {
    Grid2 grid = new Grid2(5, 5);
    grid.setAlive(1,1);
    grid.setAlive(3, 1);
    assertEquals(grid.nextValue(2, 1), 1);
  }
  
  @Test
  public void testNextSimulationOvercrowding() {
    Grid2 grid = new Grid2(5, 5);
    grid.setAlive(2, 1);
    grid.setAlive(1, 1);
    grid.setAlive(3, 1);
    grid.setAlive(3, 2);
    assertEquals(grid.nextValue(2, 1), 0);
  }
  
  @Test
  public void testNextSimulationLoneliness() {
    Grid2 grid = new Grid2(5, 5);
    grid.setAlive(2, 1);
    assertEquals(grid.nextValue(2, 1), 0);
  }
  
  @Test
  public void testNextSimulationSurvive() {
    Grid2 grid = new Grid2(5, 5);
    grid.setAlive(2, 1);
    grid.setAlive(3, 1);
    grid.setAlive(3, 2);
    assertEquals(grid.nextValue(2, 1), 1);
  }
  
 /* @Test
  public void testGenerateGrid(){
    Grid2 grid = new Grid2(5, 5);
    Grid2 grid2 = new Grid2(5, 5);
    grid2.setDead(2, 2);
    assertEquals(grid.generateGrid(), grid2);
  }*/
}
