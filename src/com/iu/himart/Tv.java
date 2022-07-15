package com.iu.himart;

public class Tv extends Product{

	private int size;
	
	//생성자 생성
	public Tv() {
		this.setBrand("LG");
		this.setPrice(8000000);
		this.setPoint(200);
		
		this.size =300;
		
	}
	
	public void info() {
		super.info();
		System.out.println("size=" +size);
	}
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
