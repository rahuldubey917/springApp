package com.rd.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.rd.beans.Flipkart;

public class MainTestClass {

	public static void main(String[] args) {
//Locate Spring Bean Configration file
		FileSystemResource res=new FileSystemResource("src/com/rd/cfgs/applicationContext.xml");
	
		//Activate Bean Factoy container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		//get Bean class object
		Flipkart fpk=factory.getBean("fpk",Flipkart.class);
		
		//call bussiness method
		String result=fpk.purchase(new String[] {"shoes","cloths","goggals"});
		
		System.out.println(result);
	}

}
