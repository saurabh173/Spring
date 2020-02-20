package org.javabr.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle tg = (Triangle) bf.getBean("triangle");
		tg.draw();
		
	}

}
