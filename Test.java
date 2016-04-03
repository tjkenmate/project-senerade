package com.senerade.game;

public abstract class Test {
	
	private boolean move[][] = null;
	
	public void movePossibilitys(BattleObject thor, int moveArea, Map id){
		int x = thor.getX();
		int y = thor.getY();
		this.move = new boolean[moveArea-1][moveArea-1];
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
	
	public static void move(BattleObject thor, Map id){
		movePossibilitys(thor, 5, id);
	}
}
