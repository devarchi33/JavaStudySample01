package com.skyfly33.shape;

public abstract class Shape {

	double base = 0;
	double high = 0;
	double radius = 0;
	int type; //1: 원 2: 삼각형 3: 사각형

	String info;

	public Shape() {
	}
	
	public Shape(double base, double high) {
		this.base = base;
		this.radius = high;
	}

	public Shape(double base, double high, int type) {
		this.base = base;
		this.radius = high;
		this.type = type;
	}
	
	public Shape(double radius, int type) {
		this.radius = radius;
		this.type = type;
	}

	public Shape(double radius) {
		this.radius = radius;
	}

	public String getShapeInfo(String shape) {
		if (base != 0 && high != 0 && radius == 0)
			info = "밑변 : " + base + ", 높이 : " + high + "의 " + shape + "각형 입니다.";
		else if (base == 0 && high == 0 && radius != 0)
			info = "반지름 : " + radius + "의 " + shape + "형 입니다.";
		return info;

	}
	
	public abstract double getExtent();

}
