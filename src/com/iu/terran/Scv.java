package com.iu.terran;

import com.iu.unit.Unit;

public class Scv extends Unit{

	//기본 생성자 호출
	public Scv() {
		super(30);
	}
	//하는 일
	public void attack() {
		System.out.println("공격 히야아아압");
	}
	public void work() {
		System.out.println("일 하기");
	}
	public void move() {
		System.out.println("난 어케 움직이는 놈?");
	}
	
}
