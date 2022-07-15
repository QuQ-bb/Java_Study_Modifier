package com.iu.himart;

public abstract class Product {
	
	private String brand;	//브랜드
	private int price;		//가격
	private int point;		//물건 사고 주는 포인트
	
	//생성자 생성
	public Product() {
	}
	
	//public abstract void info();
	public void info() {
		System.out.println("Brand : "+this.getBrand());
		System.out.println("Price : "+this.getPrice());
		System.out.println("Point : "+this.getPoint());
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

}
