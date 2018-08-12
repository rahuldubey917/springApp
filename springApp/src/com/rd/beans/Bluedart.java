package com.rd.beans;

public class Bluedart {

public Bluedart()
{
System.out.println("bluedart 0-param constructor");	
}

public String deliver(int orderid)
{
	return "this order is deliverd by bluedart for orderid="+orderid;
}
}
