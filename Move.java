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
		for (int i = 0; i < moveArea; i++)
			for (int j = 0; j < moveArea; j++){
				if((j < moveArea/2 && moveArea%2 == 0 && (y - j) > 0) 
					|| (j < moveArea/2 -1 && moveArea%2 == 1 && (y - j) > 0)){
					if((i < moveArea/2 && moveArea%2 == 0 && (x - i) > 0) 
						|| (i < moveArea/2 -1 && moveArea%2 == 1 && (x - i) > 0)){
						move[i][j] = id.canMove(x - i, y - j);
					}
					move[i][j] = id.canMove(x + i - moveArea/2 - moveArea%2, y - j);
				}
				move[i][j] = id.canMove(x + i - moveArea/2 - moveArea%2, y + j - moveArea/2 - moveArea%2);
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
		if(move != null && move[x][y]){
			thor.setX(x);
			thor.setY(y);
		}
		else{
			System.out.printf("%s Cant Move There", thor.getName());
			move(thor, id);
		}
	}
	
	public static void move(BattleObject thor, Map id){
		if(move == null)
			movePossibilitys(thor, thor.getMove(), id);
		int newX = thor.getX(), newY = thor.getY();
		//Somewhere here goes the player input
		if(newX != thor.getX() || newY != thor.getY())
			moveTo(thor, id, newX, newY);
		move = null;
	}
}
