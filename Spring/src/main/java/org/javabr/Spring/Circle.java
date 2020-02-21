package org.javabr.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

	@Autowired
	@Qualifier("circleRelated")
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
	
	
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle point is " + center.getX() + ", " + center.getY());
		
	}

}
