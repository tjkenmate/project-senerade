/**
 *  Just a test for a grid generation system.
 */
package com.senerade.game;
/**
 * @author Thor Johansson
 *
 */
public class Map {
	private String mapName = "";
	private int[][] map = null;
	
	//Constructor
	public Map(int width, int height, String mapName){
		map = new int [width][height];
		for (int i = 0; i < width; i++)
			for (int j = 0; j < height; j++)
				map[i][j] = 0;
		this.setMapName(mapName);
	}
	
	public String getMapName() {
		return mapName;
	}
	
	public void setMapName(String mapName) {
		this.mapName = mapName;
	}
	
	//Returns the memory position of the array
	public int[][] getMap(){
		return map;
	}
	
	public void setMapSpace(int x, int y, int value){
		map[x][y] = value;
	}
	
	public int getMapSpace(int x, int y){
		int value = map[x][y];
		return value;
	}
	
	/**
	 * 0 = empty
	 * 1 = cover
	 * 2 = half cover
	 * 3 = occupied
	 * 4 = cover occupied
	 * 5 = half cover occupied
	 */
	public boolean canMove(int x, int y){
		if (2 < getMapSpace(x,y))
			return false;
		return true;
	}
	
	public boolean cover(int x, int y){
		if (1 == getMapSpace(x,y)%3)
			return true;
		return false;
	}
	
	public boolean halfCover(int x, int y){
		if (2 == getMapSpace(x,y)%3)
			return true;
		return false;
	}
	
	//TestFile
	
	public static void main(String[] args){
		Map a = new Map(10, 20, "phi");
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 20; j++){
				a.setMapSpace(i, j, (i+j)%6);
				System.out.print(a.getMapSpace(i, j) + " ");
			}
			System.out.println();
		}
		System.out.println(a.getMap());
		System.out.println(a.getMapName());
		BattleActor d = new BattleActor("Mother", "Hi7");
		System.out.println(d.getX() + " " + d.getId() + " " + d.getAtk());
		BattleActor e = new BattleActor("x", "Hi7");
		BattleMove f = new BattleMove(35);
		Move.move(e, a);
		//while(BattleActions.hit(d, e, f))
			System.out.println("truex");
	}
}
