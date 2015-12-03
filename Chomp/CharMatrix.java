// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
  private char grid [] [];
  private char newfillGrid [] [];
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    this.grid = new char[rows] [cols];
    for(int i =0; i < grid.length; i++)
    {
        for(int j = 0; j < grid[i].length; j++)
        {
            grid[i][j] = ' ';
        }
    }
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
    this.newfillGrid = new char[rows] [cols];
    for(int i =0; i < newfillGrid.length; i++)
    {
        for(int j = 0; j < newfillGrid[i].length; j++)
        {
           newfillGrid[i][j] = fill;
        }
    }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
    int rowcount = 0;
    for(int i =0; i < grid.length; i++)
    {
         rowcount ++;
    }
    return rowcount;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
    int colomncount = 0;
    for(int i =0; i < 1; i++)
    {
        for(int j = 0; j < grid[i].length; j++)
        {
            colomncount ++;
        }
    }
    return colomncount;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
    char atRowColomn = grid[row][col];
    return atRowColomn;
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
    int setchar = grid[row][col];
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
      if (grid[row][col] == ' ')
      {
          return true;
      }
      else
      {
          return false;
      }
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
      for(int i =0; i < grid.length; i++)
    {
        for(int j = 0; j < grid[i].length; j++)
        {
            
        }
    }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
    int rowspace = 0;
    for(int i =0; i < grid.length; i++)
    {
        if( grid[row][i] == ' ')
        {
            rowspace++;
        }
    }
    return rowspace;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
     int colspace = 0;
    for(int i =0; i < grid.length; i++)
    {
        if( grid[col][i] == ' ')
        {
            colspace++;
        }
    }
    return colspace;
  }
}
