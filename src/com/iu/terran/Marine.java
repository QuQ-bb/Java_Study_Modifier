package com.iu.terran;

import com.iu.unit.Unit;

public class Marine extends Unit{	//public class 자식클래스 extends 부모클래스
	
	//클래스안에 abstract가 하나라도 있으면 추상클래스로 만들어주던가 body를 완성시켜줘라
	
	
	private String weapon;
	
	//기본 생성자 생성
	public Marine() {
		super(30);	//unit의 기본생성자가 아니라 매개변수가 있는 생성자를 가져오기때문에
					//Marine의 기본 생성자에서 가져오지 못해서 super에 값을 담아 가져온다.
		System.out.println("Marine 생성자");
	}
	
	//상속시 자식객체를 만들면 부모객체부터 만들어
	//생성자를 호출해 그러니 unit이라는 생성자를 호출하고 자기자신의 생성자를 호출
	
	//애가 하는일은 메서도로 만들어줌
	public void shoot() {
		System.out.println("우다다다다다닫");
	}

	//오버라이딩
	public void move() {
		System.out.println("나는 뛰어다니는 놈");
	}
	//일반메서드와 같은 변수명의 메서드를 선언하면 중복인가? 아니 오버라이딩이다
	public void info() {
		//super.info();//부모의 info
		System.out.println("Marine Info");
	}
	

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
}
