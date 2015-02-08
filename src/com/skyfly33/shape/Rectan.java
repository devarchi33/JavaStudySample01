package com.skyfly33.shape;

public class Rectan extends Shape {

	public Rectan(double base, double high) {
		super(base, high);
	}

	@Override
	public double getExtent() {
		double extent = 0.0;
		extent = base * high;
		return extent;
	}

}
