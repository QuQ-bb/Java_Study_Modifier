package com.iu.ex1;

public class Iu {
	
	private String name;
	private int age;
	//FixStudy
	private String test;
	
	
	
	//기본생성자 생성
	private Iu() {
	}
	
	//private을 사용한 속에서 Ex1Main에서 Iu를 사용할 수 있게 하는 방법이 뭐가 있을까
	//iu는 지금 private에 갇혀있는데 꺼내줘야돼 꺼내주는 방법 뭐가 있을까
	//static사용해야 가능한가봐
	
	//static 가능은한데 클래스안에서 사용할수있음
	//클래스 변수 선언
	private static Iu iu=null;
	
	//클래스 메서드 -객체를 생성하지않고 사용가능하다
	public static Iu getInstance() {
		//처음이라면 새것을 주고 아니라면 있던것을 주자
		if(Iu.iu == null) {
			Iu.iu = new Iu();
		}
		return Iu.iu;
	}
	
	
	//Setter = 멤버변수에 값을 집어넣기 위함
	//public void set변수명(데이터타입 변수명){}
	//Getter = 값을 꺼내오기 위함
	//public 리턴타입 get변수명(){ return 멤버변수}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
