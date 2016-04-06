package com.senerade.game;

public class Move {
	
	public static boolean move[][] = null;
	/**
	 * Generates a boolean array for a unit
	 * @param thor
	 * @param moveArea
	 * @param id
	 */
	public static void movePossibilitys(BattleObject thor, int moveArea, Map id){
		int x = thor.getX();
		int y = thor.getY();
		move = new boolean[moveArea-1][moveArea-1];
		for (int i = 0; i < (moveArea-moveArea%2)/2; i++)
			for (int j = 0; j < (moveArea-moveArea%2)/2; j++){
				if(j < (moveArea-moveArea%2)/2 && j < y){
					if(i < (moveArea-moveArea%2)/2 && i < x)
						move[i][j] = id.canMove(x - i, y - j);
					move[i][j] = id.canMove(x + i - (moveArea-moveArea%2)/2, y - j);
				}
				move[i][j] = id.canMove(x + i - (moveArea-moveArea%2)/2, y + j - (moveArea-moveArea%2)/2);
			}
	}
	/**
	 * Sets objects x and y, if possible.
	 * @param thor
	 * @param id
	 * @param x
	 * @param y
	 */
	
	public static void moveTo(BattleObject thor, Map id, int x, int y){
		movePossibilitys(thor, thor.getMove(), id);
		if(move[x][y]){
			thor.setX(x);
			thor.setY(y);
		}
		else{
			System.out.printf("%s Cant Move There", thor.getName());
			move(thor, id);
		}
	}
	
	public static void move(BattleObject thor, Map id){
		movePossibilitys(thor, thor.getMove(), id);
		int newX = thor.getX(), newY = thor.getY();
		//Somewhere here goes the player input
		if(newX != thor.getX() || newY != thor.getY())
			moveTo(thor, id, newX, newY);
		move = null;
	}
}
