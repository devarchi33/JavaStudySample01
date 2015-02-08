package com.skyfly33.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.skyfly33.shape.Circle;
import com.skyfly33.shape.Rectan;
import com.skyfly33.shape.Triangle;

public class MenuTemp {

	BufferedReader br;

	// 1��° �Է°� ó���� ���� ������.
	String input = null;
	String[] tempArrays = null;
	String shape = null;

	// ���� ���� ������ ���� ������.
	String baseInput;
	double base;
	String highInput;
	double high;
	String radiusInput;
	double radius;

	// ������ü�� ������ü�� ���� �ڷᱸ����.
	List<Circle> circles = new ArrayList<Circle>();;
	Circle cir;
	List<Rectan> rectans = new ArrayList<Rectan>();
	Rectan rec;
	List<Triangle> triangles = new ArrayList<Triangle>();;
	Triangle tri;

	// �ݺ��� üũ�� ���� ����.
	boolean run = true;

	public void start() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("##### Menu #####");
			System.out
					.println("1. �����Է�// 2. ��ȸ�ϱ�// 3. ���� [ {��ȣ/����} �������� �Է��ϼ���. ]");
			System.out.println("Ex) 1/�ﰢ��, 2/�簢�� ");
			System.out.print("�Է� : ");
			input = br.readLine();

			tempArrays = input.split("/");
			shape = tempArrays[1].substring(0, 1);

			menu();
		} catch (IOException e) {
			exceptionProcess();
		} catch (ArrayIndexOutOfBoundsException e) {
			exceptionProcess();
		}
	}

	public void menu() {
		switch (tempArrays[0]) {
		// case 1 : �Է��ϱ�
		case "1":
			if ("��".equals(shape) || "3".equals(shape)) {
				inputPolygonInfo();
				tri = new Triangle(base, high);
				triangles.add(tri);
				System.out.println();
				System.out.println("�ﰢ���� ���������� �߰� �Ǿ����ϴ�.");
				break;
			} else if ("��".equals(shape) || "4".equals(shape)) {
				inputPolygonInfo();
				rec = new Rectan(base, high);
				rectans.add(rec);
				System.out.println();
				System.out.println("�簢���� ���������� �߰� �Ǿ����ϴ�.");
				break;
			} else if ("��".equals(shape) || "0".equals(shape)) {
				inputCircleInfo();
				cir = new Circle(radius);
				circles.add(cir);
				System.out.println();
				System.out.println("������ ���������� �߰� �Ǿ����ϴ�.");
				break;
			}
			// case 2 : ��ȸ�ϱ�
		case "3":
			System.out.println("���α׷��� ���� �ϰڽ��ϴ�.");
			System.exit(0);
		}

	}

	// �ٰ��� ���� �Է� �޼ҵ�.
	public void inputPolygonInfo() {
		while (run) {
			try {
				System.out.println("�غ��� �Է��ϼ���.");
				baseInput = br.readLine();
				base = Double.parseDouble(baseInput);

				System.out.println("���̸� �Է��ϼ���.");
				highInput = br.readLine();
				high = Double.parseDouble(highInput);

				System.out.println("�غ� : " + base + ", ���� : " + high + "�� "
						+ shape + "������ �Է� �Ǿ����ϴ�.");

				inputContinue();
			} catch (IOException e) {
				exceptionProcess();
			} catch (ArrayIndexOutOfBoundsException e) {
				exceptionProcess();
			} catch (NumberFormatException e) {
				exceptionProcess();
			}
		}
	}

	// ���� ���� �Է� �޼ҵ�.
	public void inputCircleInfo() {
		while (run) {
			try {
				System.out.println("�������� �Է��ϼ���.");
				radiusInput = br.readLine();
				radius = Double.parseDouble(radiusInput);

				System.out.println("������ : " + radius + "�� " + shape
						+ "���� �Է� �Ǿ����ϴ�.");
				inputContinue();
			} catch (IOException e) {
				exceptionProcess();
			} catch (ArrayIndexOutOfBoundsException e) {
				exceptionProcess();
			} catch (NumberFormatException e) {
				exceptionProcess();
			}
		}

	}

	// �ͼ��� ó�� �޼ҵ�.
	public void exceptionProcess() {
		System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		System.out.println();
		start();
	}

	public void inputContinue() {
		try {
			System.out.println("��� �Է� �Ͻðڽ��ϱ�?? <1: ��� �Է�// 2.���θ޴�>");
			input = br.readLine();

			if ("1".equals(input))
				run = false;
			else if ("2".equals(input)) {
				run = false;
				start();
			} else {
				throw(new NumberFormatException());
			}
		} catch (IOException e) {
			exceptionProcess();
		} catch (ArrayIndexOutOfBoundsException e) {
			exceptionProcess();
		} catch (NumberFormatException e) {
			exceptionProcess();
		}
	}

}
