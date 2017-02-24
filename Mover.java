package testing;

import javax.swing.JLabel;

/**
 * This is an abstract template class that extends the JLabel class. 
 * It holds the mover row, column, direction and status
 * 
 * @author Mr. Fernandes (modified by Aalea Ally)
 * 
 */
public abstract class Mover extends JLabel {
	
	/**
	 * current position of Mover
	 */
	private int row;
	private int column;
	
	/**
	 * current direction (-1, 0, or 1) of Mover
	 */
	private int dRow;
	private int dColumn;
	
	/**
	 * health points of Mover
	 */
	private int healthPoints;
	
	// getters and setter for fields
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getdRow() {
		return dRow;
	}

	public void setdRow(int dRow) {
		this.dRow = dRow;
	}

	public int getdColumn() {
		return dColumn;
	}

	public void setdColumn(int dColumn) {
		this.dColumn = dColumn;
	}

	/**
	 * Change Movers current position based on their current direction
	 */
	public void move() {
		
		row += dRow;
		column += dColumn;
		
	}
	
	/**
	 * Sets the direction of the mover based on a direction parameter 
	 * 
	 * @param direction 0 - left, 1 - up, 2 - right, 3 - down
	 */
	public void setDirection(int direction) {
		
		//1. Reset the dRow and dColumn
		dRow = 0;
		dColumn = 0;
		
		//2. Set the row or column direction based on the direction parameter
		
		if (direction==0) //left
			dColumn = -1;
		else if (direction==1) //up
			dRow = -1;
		else if (direction==2) //right
			dColumn = 1;
		else if (direction==3) //down
			dRow = 1;
			
	}
	
	/**
	 * returns the Mover's direction based on their current row or column direction
	 * 
	 * @return direction
	 */
	public int getDirection() {
		
		if (dRow == 0 && dColumn == -1) //left
			return 0;
		else if (dRow == -1 && dColumn == 0) //up
			return 1;
		else if (dRow == 0 && dColumn == 1) //right
			return 2;
		else				//down
			return 3;
	}
	
	/**
	 * returns the Mover's next row
	 * 
	 * @return next column
	 */
	public int getNextColumn() {
		
		return column + dColumn;
		
	}
	
	/**
	 * returns the Mover's next row
	 * 
	 * @return next row
	 */
	public int getNextRow() {
		
		return row + dRow;
	}
	
	/**
	 * returns the previous row the protagonist was on
	 *
	 * @return previous row
	 */
	public int getPreviousRow() {
		return row - dRow;
	}
	
	/**
	 * returns the previous column the protagonist was on
	 *
	 * @return previous column
	 */
	public int getPreviousColumn() {
		return column - dColumn;
	}
	
	/**
	 * returns the health points of the mover
	 *
	 * @return health points
	 */
	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

}