package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Robot;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory f=new XmlBeanFactory(new ClassPathResource("com\\ba\\commn\\application-context.xml"));
	Robot ro=f.getBean("robot",Robot.class);
	System.out.println(ro);
	}

}
