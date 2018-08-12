package com.rd.beans;

public class FirstFlight {

public FirstFlight()
{
System.out.println("FirstFlight 0-param constructor");	
}

public String deliver(int orderid)
{
	return "this order is deliverd by FirstFlight for orderid="+orderid;
}
}
