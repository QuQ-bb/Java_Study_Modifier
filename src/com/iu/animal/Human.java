package com.iu.animal;

public class Human {
	
	private int age;
	
	public int getAge() {	//get으로 시작하는 메서드는 뭔가를 꺼내오려고 하는 메서드 구나라고 생각하기
		
		return this.age;
	}
	
	public void setAge(int age) {	//set으로 시작하는 메서드는 뭔가를 집어넣으려하는 메서드구나 라고 생각하기 
		//메서드안 제어문 반복문 사용 가능
		
		this.age =0;
		if(age<150 && age<=0) {
			this.age =age;
		}
		
//		if(age<150 && age>=0) {
//			this.age = age;
//		}else {
//			this.age = 0;
//		}
	}
	

	public void info() {
		System.out.println(this.age);
	}
	
	public void myPet() {
		Cat cat = new Cat();
		cat.age=10;
		cat.sound();
	}
}
