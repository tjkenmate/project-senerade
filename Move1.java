package com.senerade.game;

public class Move {
	
	public Move(BattleObject thor){
		this.thor=thor;
	}
	
	public final BattleObject thor;
	public boolean move[][] = null;
	/**
	 * Generates a boolean array for a unit
	 * @param thor
	 * @param moveArea
	 * @param id
	 */
	public void movePossibilitys(int moveArea, Map id){
		int x = thor.getX();
		int y = thor.getY();
		int centerX = (moveArea-1)/2;
		int centerY = (moveArea-1)/2;
		move = new boolean[moveArea-1][moveArea-1];
		for(int i = centerX; i > 0; --i){
			for(int j = centerY; j > 0; --j){
				if(x - i < 0)
					move[i][j] = false;
				else if(y - j < 0)
					move[i][j] = false;
				else
					move[i][j] = id.canMove(x - i, y - j);
			}
			for(int j = centerY; j < moveArea-1; ++j){
				if(x - i < 0)
					move[i][j] = false;
				else
					move[i][j] = id.canMove(x - i, y + j);
			}
		}
		for(int i = centerX; i < moveArea-1; ++i){
			for(int j = centerY; j > 0; --j){
				if(y - j < 0)
					move[i][j] = false;
				else
					move[i][j] = id.canMove(x + i, y - j);
			}
			for(int j = centerY; j < moveArea-1; ++j){
				move[i][j] = id.canMove(x + i, y + j);
			}
		}
	}
	/**
	 * Sets objects x and y, if possible.
	 * @param thor
	 * @param id
	 * @param x
	 * @param y
	 */
	
	public void moveTo(Map id, int x, int y){
		if(move != null && move[x][y]){
			thor.setX(x);
			thor.setY(y);
		}
		else if(move == null){
			System.out.printf("Error, Dont null on me");
			move(thor, id);
		}
		else{
			System.out.printf("%s Cant Move There", thor.getName());
			move(thor, id);
		}
	}
	
	public void move(Map id){
		if(move == null)
			movePossibilitys(thor, thor.getMove(), id);
		int newX = thor.getX(), newY = thor.getY();
		//Somewhere here goes the player input
		if(newX != thor.getX() || newY != thor.getY())
			moveTo(thor, id, newX, newY);
		move = null;
	}
}