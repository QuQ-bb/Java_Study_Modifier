package com.iu.main;

import com.iu.terran.Marine;
import com.iu.zerg.Hydra;

public class Main {

	public static void main(String[] args) {
		//객체 생성	
		Marine marine = new Marine();
		marine.setHp(30);
		marine.setColor("");
		
		//메서드 호출
		marine.info();
		
		Hydra hydra = new Hydra();
		hydra.setHp(50);
		hydra.setColor("");
		hydra.setName("");
		
		//메서드 호출
		hydra.move();

	
		
	}//main
}//class
