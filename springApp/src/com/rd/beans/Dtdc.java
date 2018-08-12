package com.rd.beans;

public class Dtdc {

public Dtdc()
{
System.out.println("Dtdc 0-param constructor");	
}

public String deliver(int orderid)
{
	return "this order is deliverd by Dtdc for orderid="+orderid;
}
}
