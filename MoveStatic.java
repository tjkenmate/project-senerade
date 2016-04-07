package com.senerade.game;

public class Move {
	/**
	 * Generates a boolean array for a unit
	 * @param thor
	 * @param moveArea
	 * @param id
	 */
	public static boolean[][] movePossibilitys(BattleObject thor, int moveArea, Map id){
		int x = thor.getX();
		int y = thor.getY();
		int centerX = (moveArea-1)/2;
		int centerY = (moveArea-1)/2;
		boolean[][] move = new boolean[moveArea-1][moveArea-1];
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
		return move;
	}
	/**
	 * Sets objects x and y, if possible.
	 * @param thor
	 * @param id
	 * @param x
	 * @param y
	 */
	
	public static void moveTo(BattleObject thor, Map id, int x, int y, boolean[][] map){
		boolean[][] move = (map!=null)?map:movePossibilitys(thor, thor.getMove(), id);
		if(move[x][y]){
			thor.setX(x);
			thor.setY(y);
		}
		else{
			System.out.printf("%s Cant Move There", thor.getName());
			move(thor, id);
		}
	}
	
	public static void moveTo(BattleObject thor, Map id, int x, int y){
		moveTo(thor, id, x, y, null);
	}
	
	public static void move(BattleObject thor, Map id, boolean[][] map){
		boolean[][] move = (map!=null)?map:movePossibilitys(thor, thor.getMove(), id);
		int newX = thor.getX(), newY = thor.getY();
		//Somewhere here goes the player input
		if(newX != thor.getX() || newY != thor.getY())
			moveTo(thor, id, newX, newY);
		move = null;
	}
	
	public static void move(BattleObject, Map id){
		move(thor, id, null);
	}
}