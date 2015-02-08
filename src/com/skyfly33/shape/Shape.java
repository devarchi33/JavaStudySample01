package com.skyfly33.shape;

public abstract class Shape {

	double base = 0;
	double high = 0;
	double radius = 0;

	String info;

	public Shape() {
	}

	public Shape(double base, double high) {
		this.base = base;
		this.high = high;
	}

	public Shape(double radius) {
		this.radius = radius;
	}

	public String getShapeInfo(int shape) {
		switch (shape) {
		case 1:
			info = "반지름 : " + radius + "의 원형 입니다.";
			break;
		case 2:	
			info = "밑변 : " + base + ", 높이 : " + high + "의 삼각형 입니다.";
			break;
		case 3:		
			info = "밑변 : " + base + ", 높이 : " + high + "의 사각형 입니다.";
			break;
		default:
			info = "지원 하지 않는 도형 입니다.";
			break;
		}
		return info;

	}

	public abstract double getExtent();

}
