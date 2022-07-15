package com.iu.main;

import com.iu.terran.Marine;
import com.iu.terran.Scv;
import com.iu.unit.Unit;
import com.iu.zerg.Hydra;

public class Main {

	public static void main(String[] args) {

		Marine marine = new Marine();
		Scv  scv = new Scv();
		
		//Marine is a Unit;
		//Scv is a Unit;
		
		Unit unit = marine;// 말이안됨 원래 근데 자바놈이 가능하게 해둠
		//상속관계에서만 가능하다

		Hydra hydra = new Hydra();
		
		marine.attack();
		hydra.attack();
				
		System.out.println(unit.getHp());
		System.out.println(unit.getColor());
		System.out.println(unit.getName());
		//System.out.println(unit.); // 오류남 weapon은 나오지않는다 형태가 변하기 때문이다
		//만들어져 있긴하지만 접근은 원래 unit에 있는 자기가 알고있는것까지만 접근가능하다
		
		//marine = unit;	//오류남 why? double을 int넣으려면 그냥 넣을 수 없다. 형변환이 필요하듯이
		marine = (Marine)unit;	//unit을 Marine 타입으로 해서 넣어라
		System.out.println(marine.getWeapon());
		
		
		
	}//main
}//class
