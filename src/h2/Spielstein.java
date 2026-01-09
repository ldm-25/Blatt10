package h2;

public class Spielstein 
{

	int currentRow;
	int currentCol;
	Spielbrett brett;
	
	
	Spielstein(Spielbrett brett, int indexRow, int indexCol)
	{
		this.brett = brett;
		currentRow=indexRow;
		currentCol=indexCol;
	}
	
	
	public int getCurrentRow() {
		return currentRow;
	}
	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}
	public int getCurrentCol() {
		return currentCol;
	}
	public void setCurrentCol(int currentCol) {
		this.currentCol = currentCol;
	}
	public Spielbrett getBrett() {
		return brett;
	}
	public void setBrett(Spielbrett brett) {
		this.brett = brett;
	}
	
	
	public boolean movesOut()
	{
		
		char dir =brett.getBrett()[currentRow][currentCol].getDirection();
		int dim = brett.getDim();
		
		if(dir=='U' && currentRow == 0)
		{
			return true;
		}
		
		if(dir=='D' && currentRow >= dim-1)
		{
			return true;
		}
		
		if(dir=='L' && currentCol == 0)
		{
			return true;
		}
		
		if(dir=='R' && currentCol >= dim-1)
		{
			return true;
		}
		 
		return false;
	}
	
	
	
	
	public void go (int n)
	{
		
		
		 for (int i = 0 ; i < n;i++)
		 {
			 
			 Feld f;
			 f=brett.getBrett()[currentRow][currentCol];
				
	            if(f.isBoese())
	            {
	                continue;
	            }

	            if(f.getDirection() == 'U'){
	                if(currentRow > 0)
	                {
	                    currentRow--;
	                    continue;
	                }
	            }

	            if(f.getDirection() == 'D')
	            {
	                if(currentRow < brett.getDim() -1)
	                {
	                    currentRow++;
	                    continue;
	                }
	            }

	            if(f.getDirection() == 'L')
	            {
	                if(currentCol > 0)
	                {
	                    currentCol--;
	                    continue;
	                }
	            }

	            if(f.getDirection() == 'R'){
	                if(currentCol < brett.getDim() -1 )
	                {
	                    currentCol++;

	                }
	            }

	     	}
	}
	
}
