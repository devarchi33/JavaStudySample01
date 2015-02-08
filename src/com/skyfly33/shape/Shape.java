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
			info = "������ : " + radius + "�� ���� �Դϴ�.";
			break;
		case 2:	
			info = "�غ� : " + base + ", ���� : " + high + "�� �ﰢ�� �Դϴ�.";
			break;
		case 3:		
			info = "�غ� : " + base + ", ���� : " + high + "�� �簢�� �Դϴ�.";
			break;
		default:
			info = "���� ���� �ʴ� ���� �Դϴ�.";
			break;
		}
		return info;

	}	

	public double getBase() {
		return base;
	}

	public double getHigh() {
		return high;
	}

	public double getRadius() {
		return radius;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public abstract double getExtent();

}
