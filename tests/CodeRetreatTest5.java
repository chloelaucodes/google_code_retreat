import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class CodeRetreatTest5 {
  
  @Test
  public void testCreateGrid(){
  Grid5 grid = new Grid5(5, 5);
  
  }
  
  @Test
  public void testSet(){
    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
  }
  
  @Test
  public void testGetAlive(){
  
    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
    assertEquals(grid.get(1, 2), 1);
  }
  
  @Test
  public void testGetNeighbors(){
    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
    assertEquals(grid.getNeighbors(1, 2), 0);
  }
  
  @Test
  public void testGetNeighbors2(){
    Grid5 grid = new Grid5(5, 5);
    grid.set(1, 2, 1);
    assertEquals(grid.getNeighbors(1, 1), 1);
  }
/*  @Test
  public void testGetAlive(){}*/
}
