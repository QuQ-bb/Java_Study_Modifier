package com.iu.unit;

public abstract class Unit {	//abstract를 사용하면 객체를 생성하지 못한다. 데이터 타입 선언은 가능
								// 그럼 어케써요? 무조건 상속해서 사용해라
								//unit은 다른 객체를 도와주는 거지 이거 자체를 객체 생성하지말아라. 강제성을 띄우고 싶을때 사용
	
	//클래스간의 공통 요소
	private int hp;
	private String color;
	private String name;
	
	public Unit() {
		
	}
	
	//생성자 생성
	public Unit(int hp) {
		System.out.println("unit생성자="+"Super 생성자");
		this.hp = hp;
	}
	
	//공통 메서드
	public abstract void move();	//abstract를 사용함으로써 완성되지않은 메서드에요 라고 표현함
	
	public abstract void attack();	//공격을 안하는 종족은?
	
	
	//일반 메서드
	public void info() {
		System.out.println("Super Info");
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
