package com.skyfly33.shape;

public class Rectan extends Shape {

	public Rectan(double base, double high) {
		super(base, high);
	}
	
	public Rectan(double base, double high, int type) {
		super(base, high, type);
	}

	@Override
	public double getExtent() {
		double extent = 0.0;
		extent = base * high;
		return extent;
	}

}
