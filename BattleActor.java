/**
 * 
 */
package com.senerade.game;

/**
 * @author Thor Johansson
 *
 */
public class BattleActor extends BattleObject {
	
	private int hp = 100, atk = 60, def = 15, spd = 40, acc = 425, eva = 95, lvl = 1, fPenetration = 0;
	private double pPenetration = 0;
	@SuppressWarnings("unused")
	private Object equipment = new Object();
	
	/**
	 * @param x
	 * @param y
	 * @param id
	 * @param name
	 */
	public BattleActor(int x, int y, String id, String name) {
		super(x, y, id, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 */
	public BattleActor(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param x
	 * @param y
	 * @param id
	 * @param name
	 */
	public BattleActor(int x, int y, String id, String name, int atk) {
		super(x, y, id, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 */
	public BattleActor(String id, String name, int atk) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the spd
	 */
	public int getSpd() {
		return spd;
	}

	/**
	 * @param spd the spd to set
	 */
	public void setSpd(int spd) {
		this.spd = spd;
	}

	/**
	 * @return the atk
	 */
	public int getAtk() {
		return atk;
	}

	/**
	 * @param atk the atk to set
	 */
	public void setAtk(int atk) {
		this.atk = atk;
	}

	/**
	 * @return the acc
	 */
	public int getAcc() {
		return acc;
	}

	/**
	 * @param acc the acc to set
	 */
	public void setAcc(int acc) {
		this.acc = acc;
	}

	/**
	 * @return the def
	 */
	public int getDef() {
		return def;
	}

	/**
	 * @param def the def to set
	 */
	public void setDef(int def) {
		this.def = def;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * @return the lvl
	 */
	public int getLvl() {
		return lvl;
	}

	/**
	 * @param lvl the lvl to set
	 */
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	/**
	 * @return the eva
	 */
	public int getEva() {
		return eva;
	}

	/**
	 * @param eva the eva to set
	 */
	public void setEva(int eva) {
		this.eva = eva;
	}

	/**
	 * @return the fPenetration
	 */
	public int getfPenetration() {
		return fPenetration;
	}

	/**
	 * @param fPenetration the fPenetration to set
	 */
	public void setfPenetration(int fPenetration) {
		this.fPenetration = fPenetration;
	}

	/**
	 * @return the pPenetration
	 */
	public double getpPenetration() {
		return pPenetration;
	}

	/**
	 * @param pPenetration the pPenetration to set
	 */
	public void setpPenetration(double pPenetration) {
		this.pPenetration = pPenetration;
	}

}
