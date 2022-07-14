package com.iu.animal;

public class Zoo {
	
	//멤버변수
	//접근지정자 [그외지정자] 데이터타입 변수명;
	//클래스변수
	public static String title="사파리";	//static 사용하면 변수명이 살짝 기울게 나옴
	//인스턴스변수 선언
	public final int price=50000;	//final 사용시 변경할 수 없다는 뜻
	
	
	//멤버메서드 선언
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언]) {} 
	//클래스메서드
	public static  void info() {  //객체를 생성하지 않고 사용 가능
		System.out.println("Static Method");
		System.out.println(Zoo.title);
		//System.out.println(price);	//오류가 발생함 실행되는 시간의 순서를 생각해봐야함
		//getPrice를 사용하려면 객체를 생성해야 사용가능
		//
		
	}
	//인스턴스 메서드
	public void getPrice() {
		System.out.println(price);
		System.out.println(Zoo.title);
		
		Zoo.info(); //     인스턴스변수는 인스턴스 메소드
		//클래스 변수 사용법
		//클래스명.변수명
	}

}

