package org.javabr.Spring;



public class Triangle implements Shape {
	private Point pointA ;
	private Point pointB ;
	private Point pointC ;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw() {
		System.out.println("PointA = " + pointA.getX() + ", " + pointA.getY());
		System.out.println("PointB = " + pointB.getX() + ", " + pointB.getY());
		System.out.println("PointC = " + pointC.getX() + ", " + pointC.getY());
	}
	
	public void myInit() {
		System.out.println("myInit method called for the triange");

	}
	
	public void cleanUp() {
		System.out.println("cleanUp method called for the triange");	
	}
}
