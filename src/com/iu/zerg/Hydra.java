package com.iu.zerg;

import com.iu.unit.Attacker;
import com.iu.unit.Unit;

public class Hydra extends Unit implements Attacker{

	//움직이고,공격

	//기본생성자 생성
	public Hydra() {
		super(30);
	}
	
	//오버라이딩
	@Override
	public void move() {
		System.out.println("나는 기어다니는 놈~");
	}
	@Override
	public void attack() {
		
	}
}
