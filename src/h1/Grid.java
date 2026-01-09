package h1;

public class Grid 
{

	Cell [][] gridArray;
	
	//konstruktor
	
	Grid(Cell[] cells, int gridRows, int gridCols)
	{
		gridArray = new Cell [gridRows][gridCols];
		
		  for(int i = 0; i < gridRows; i++)
		  {
	            for(int j = 0; j < gridCols; j++)
	            {
	                gridArray[i][j] = new Cell(i,j,false);
	            }
		  }
	        if(cells!=null) 
	        {
	            for (Cell cell : cells) 
	            {
	                if (cell.getIndexRow() < gridRows && cell.getIndexCol() < gridCols && cell.getIndexRow() >= 0 && cell.getIndexCol() >= 0) 
	                {
	                    gridArray[cell.getIndexRow()][cell.getIndexCol()].setAlive(true);
	                }

	            }
	        }

	        for(int i = 0; i < gridRows; i++)
	        {
	            for(int j = 0; j < gridCols; j++)
	            {
	                gridArray[i][j].countLivingNeighbors(getGridArray());
	            }
	        }
	}
	
	//getset
	
	public Cell[][] getGridArray() 
	{
		return gridArray;
	}

	public void setGridArray(Cell[][] gridArray) 
	{
		 this.gridArray=gridArray;
	}
	
	
	//andere
	
	public void computeNextGen()
	{
		 for(int i = 0; i < gridArray.length; i++)
		 {
	            for(int j = 0; j < gridArray[0].length; j++)
	            {
	                gridArray[i][j].setAlive(gridArray[i][j].isAliveNextGen());
	            }
		 }
		 
		 
		 for(int i = 0; i < gridArray.length; i++)
		 {
			 	for(int j = 0; j < gridArray[0].length; j++)
	            {
	                gridArray[i][j].countLivingNeighbors(getGridArray());
	            }
		 }
	}
	
	
	
	
	 public void computeGeneration(int n)
	 {
		 if(n > 0)
		 {
			 for (int i = 0; i < n; i++)
			 {
				 computeNextGen();
			 }
		 }
	 }
	 
	 
	 
}
