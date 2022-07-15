package com.iu.himart;

public class Computer extends Product{
	
	private String cpu;	//cpu크기
	
	//생성자 생성
	public Computer() {
		this.setBrand("MacMini");
		this.setPrice(2000000);
		this.setPoint(100);
		
		this.cpu = "M2";
	}
	
	public void info() {
		//모든 멤버변수 출력
		super.info();
		System.out.println("cpu= "+cpu);
	}

	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	


}
