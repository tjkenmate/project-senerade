/**
 * 
 */
package com.senerade.game;

/**
 * @author Thor Johansson
 *
 */
public class BattleObject {
	private int x, y;
	private String name, id;
	
	public BattleObject(int x, int y, String id){
		this.setX(x);
		this.setY(y);
		this.setId(id);
		this.setName(null);
	}
	
	public BattleObject(int x, int y, String id, String name){
		this.setX(x);
		this.setY(y);
		this.setId(id);
		this.setName(name);
	}
	
	public BattleObject(String id, String name){
		this.setX(-1);
		this.setY(-1);
		this.setId(id);
		this.setName(name);
	}
	
	public BattleObject(String id){
		this.setX(-1);
		this.setY(-1);
		this.setId(id);
		this.setName(null);
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
