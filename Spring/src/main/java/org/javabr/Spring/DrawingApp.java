package org.javabr.Spring;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
	
	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		ac.registerShutdownHook();
		Shape tg = (Shape) ac.getBean("circle");
		tg.draw();
		
	}

}
