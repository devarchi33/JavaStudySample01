package com.skyfly33.shape;

public class Triangle extends Shape {

	public Triangle(double base, double high) {
		super(base, high);
	}

	@Override
	public double getExtent() {
		double extent = 0.0;
		extent = base * high * 0.5;
		return extent;
	}

}
