import org.junit.Test;
import org.junit.Assert.*;

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
  
  /*@Test
  public void testGetAlive(){
  
  }*/
}
