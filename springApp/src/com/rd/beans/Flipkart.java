package com.rd.beans;

import java.util.Random;

public class Flipkart {

	private Dtdc dtdc;
	
	public Flipkart() {
	System.out.println("flipkart 0-param constructor");
	}

public void setDeliver(Dtdc dtdc)
{
this.dtdc=dtdc;	
}
public String purchase(String items[]) {
	//random orderid generator
	Random rd=new Random();
	int orderid=rd.nextInt(10000);
	
	//deliver order
	String status=dtdc.deliver(orderid);
	return status+"bill amount for this "+orderid+" is 7000";
	
}
}
