package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		//싱글톤-한개만 있다는것 (디자인 패턴 중 하나다), mvc2패턴
		
		//객체 생성
		Iu iu = Iu.getInstance();
		iu.setName("iu");
		iu.setAge(30);
		
		String name = iu.getName();
		int age = iu.getAge();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(iu);
		System.out.println("================================");
		Iu iu2 = Iu.getInstance();
		System.out.println(iu2.getName());
		System.out.println(iu2.getAge());
		System.out.println(iu2);
		//값과 주소전부 동일하게 나옴 == 객체가 하나라는것이다.
		
		
		//2번째 객체 생성
		//Iu iu2 = new Iu();
		//생성자가 호출되는 순간 객체가 만들어진다
		//생성자의 접근지정자를 private으로 둔다	- > 생성자를 만들지 못해 객체 생성불가
		
		
		
	}

}
