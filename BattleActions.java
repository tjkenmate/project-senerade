package com.senerade.game;

import java.util.Random;

public class BattleActions {
	public static final BattleMove standerd = new BattleMove(90);
	
	@Deprecated
	public static float abs(float x){
		if(x > 0)
			return x;
		return -x;
	}
	
	public static void attack(BattleActor atk, BattleActor def){
		int health=def.getHp() - (int)((15.0 + atk.getAtk()/3.0 /** + atk.getWeapon().getBaseDmg() */ )/
			(def.getDef()/1.5 - atk.getfPenetration()/** - atk.getWeapon().getfPenetration() */) *
			(1.0 + atk.getpPenetration() /** + atk.getWeapon().getpPenetration() */));
		if(hit(atk, def,standerd))
			def.setHp((health>1)?health:0); //Make sure health is never negative
	}
	
	public static boolean hit(BattleActor atk, BattleActor def, BattleMove base){
		if(base.getBaseAcc() == 100 || 1 <= ((float)base.getBaseAcc()/100 + 
			(float)atk.getAcc()/(float)def.getEva())*((float)new Random().nextInt(100)/100))
			return true;
		return false;
	}
}
