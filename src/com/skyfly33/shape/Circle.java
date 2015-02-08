package com.skyfly33.shape;

public class Circle extends Shape {

	private double pi = Math.PI;

	public Circle(double radius) {
		super(radius);
	}
	
	public Circle(double radius, int type) {
		super(radius, type);
	}

	@Override
	public double getExtent() {
		double extent = 0.0;
		extent = Math.pow(radius, 2) * pi;
		return extent;
	}

}
