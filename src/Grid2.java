public class Grid2 {
  
  private int row;
  private int column;
  private int[][] matrix;
  
  public Grid2(int row, int column) {
    this.row = row;
    this.column = column;
    this.matrix = new int[row][column];
    initializeGrid();
  }
  
  private void initializeGrid(){
    matrix[2][2] = 1;
  }

  public int getValue(int x, int y){
    if (x < 0 || y < 0){
      return 0;
    }
    return this.matrix[x][y];
  }
  
  public void setAlive(int x, int y) {
    matrix[x][y] = 1;
  }
  
  public void setDead(int x, int y) {
    matrix[x][y] = 0;
  }
  
  public int countN(int x, int y) {
    int counter = 0;
    for (int j = y - 1; j < y + 2; j++){
      for (int i = x - 1; i < x + 2; i++){
        if (!(i == x && j == y)){
          counter += getValue(i, j);
        }
      }
    }
    return counter;
  }
  
  public int nextValue(int x, int y) {
    int value = getValue(x, y);
    int n = countN(x, y);
    if (value == 1 && (n==0 || n==1 || (n>3 && n<9))){
      return 0;
    }
    else {
      return 1;
    }
  }
}
