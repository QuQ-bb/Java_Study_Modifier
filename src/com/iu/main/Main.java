package com.iu.main;

import com.iu.animal.Cat;
import com.iu.animal.Human;
import com.iu.animal.Zoo;

public class Main {

	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.sound();
		//cat.age=5;	//오류남 왜? 같은패키지안에 있지 않기때문에 접근지정자문제로 
		
		Human human = new Human();
		//human.age =26;
		human.setAge(200);
		human.info();
		
		//--------------------------------------------------------------------
		
		//객체가 만들어지는 영역은 heap 걔를 알려면 주소를 알아야됨 new하고 객체의 주소를 return
		//static을 사용하면 return하지않아도 됨 new를 사용하지않아도 된다
		System.out.println(Zoo.title);
		//System - 클래스명임 out -변수임
		Zoo.info();
		
		Zoo zoo  = new Zoo();
		//zoo.price =3000;	//final로 지정했기때문에 값을 변경을 할 수없음
		
	}

}
