package com.iu.himart;

public class Client {
	
	private int money;
	private int point;
	
	
	public Client() {
		this.money =30000000;
		this.setPoint(10);
	}
	
	public void buy(Product product) {
		//제품을 사는 행위를 여기서 메서드만 호출하게 됐을때 해결해야한다.
		//제품의 가격,제품의 포인트
		this.money = this.money - product.getPrice();
		this.point = this.point + product.getPoint();	
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
