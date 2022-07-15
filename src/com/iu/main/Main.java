package com.iu.main;

import com.iu.himart.Client;
import com.iu.himart.Computer;
import com.iu.himart.Phone;
import com.iu.himart.Tv;

public class Main {

	public static void main(String[] args) {
	
	Computer com = new Computer();
	com.info();
	
	Phone phone = new Phone();
	phone.info();
	
	Tv tv = new Tv();
	tv.info();
	
	Client client = new Client();
	client.buy(tv);
		
	}//main
}//class


//105-24=81


