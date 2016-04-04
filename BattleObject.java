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
		this.x=x;
		this.y=y;
		this.id=id;
		this.name=null;
	}
	
	public BattleObject(int x, int y, String id, String name){
		this(x, y, id);
		this.name=name;
	}
	
	public BattleObject(String id, String name){
		this(-1, -1, id, name);
	}
	
	public BattleObject(String id){
		this(-1, -1, id);
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
