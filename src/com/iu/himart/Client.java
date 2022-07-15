package com.iu.himart;

public class Client {
	
	private int money;
	private int point;
	
	
	public Client() {
		this.money =30000000;
		this.setPoint(10);
	}
	
	public void buy(Tv tv ) {
		//제품을 사는 행위를 여기서 메서드만 호출하게 됐을때 해결해야한다.
		//제품의 가격,제품의 포인트
		this.money = this.money - tv.getPrice();
		this.point = this.point + tv.getPoint();	
		System.out.println("잔액 : "+this.money);
		System.out.println("Point : "+ this.point);
	}
	public void buy(Computer com) {
		//제품을 사는 행위를 여기서 메서드만 호출하게 됐을때 해결해야한다.
		//제품의 가격,제품의 포인트
		this.money = this.money - com.getPrice();
		this.point = this.point + com.getPoint();	
		System.out.println("잔액 : "+this.money);
		System.out.println("Point : "+ this.point);
	}
	public void buy(Phone phone ) {
		//제품을 사는 행위를 여기서 메서드만 호출하게 됐을때 해결해야한다.
		//제품의 가격,제품의 포인트
		this.money = this.money - phone.getPrice();
		this.point = this.point + phone.getPoint();	
		System.out.println("잔액 : "+this.money);
		System.out.println("Point : "+ this.point);
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

}
