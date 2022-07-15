package com.iu.himart;

public class Phone extends Product{
	
	private String company;
	
	//생성자 출력
	public Phone() {
		this.setBrand("iPhone");
		this.setPrice(1500000);
		this.setPoint(80);
		
		this.company= "Apple";
		
	}
	//info 메서드 선언
	public void info() {
		super.info();
		System.out.println("Company : "+company);
	}
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

}
