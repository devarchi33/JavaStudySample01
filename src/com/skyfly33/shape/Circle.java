package com.skyfly33.shape;

public class Circle extends Shape {

	double pi = Math.PI;

	public Circle(double radius) {
		super(radius);
	}

	@Override
	public double getExtent() {
		double extent = 0.0;
		extent = Math.pow(radius, 2) * pi;
		return extent;
	}

}
