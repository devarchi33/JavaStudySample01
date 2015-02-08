package com.skyfly33.util;

import java.util.ArrayList;
import java.util.List;

import com.skyfly33.shape.Circle;
import com.skyfly33.shape.Rectan;
import com.skyfly33.shape.Triangle;

public class Menu {

	private Io io = Io.getInstance();

	private Circle circle;
	private List<Circle> cList = new ArrayList<Circle>();
	private Rectan rectan;
	private List<Rectan> rList = new ArrayList<Rectan>();
	private Triangle tri;
	private List<Triangle> tList = new ArrayList<Triangle>();

	private int bufferInput = 0;

	private boolean qa = true;

	public int mainMenu(boolean runMain) {
		try {
			while (runMain) {
				System.out.println("########### Main Menu(���� ����) #########");
				System.out.println("1. ��");
				System.out.println("2. �ﰢ��");
				System.out.println("3. �簢��");
				System.out.println("4. �����ϱ�");
				System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");

				bufferInput();
				runMain = false;
			}
			return bufferInput;
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public int subMenu(boolean runSub) {
		while (runSub) {
			System.out.println("########## Sub Menu(��� ����) ##########");
			System.out.println("1. �Է��ϱ�");
			System.out.println("2. ��ȸ�ϱ�");
			System.out.println("3. ���� ���ϱ�");
			System.out.println("4. ��������");
			System.out.println("5. �����ϱ�");
			System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");

			bufferInput();
			runSub = false;
		}
		return bufferInput;
	}

	public boolean circleAddMenu() {
		try {
			System.out.println("�������� �Է� �ϼ��� : ");
			int radius = io.input();
			// System.out.println(radius);
			circle = new Circle(radius);
			cList.add(circle);

			System.out.println("������ : " + radius + "�� ���� ���������� �Է� �Ǿ����ϴ�.");
			System.out.println();
			qa = continueQuetion();
			return qa;
		} catch (NumberFormatException e) {
			return true;
		}
	}

	public boolean rectanAddmenu() {
		try {
			System.out.println("�غ��� �Է� �ϼ��� : ");
			int base = io.input();
			System.out.println("���̸� �Է� �ϼ��� : ");
			int high = io.input();

			rectan = new Rectan(base, high);
			rList.add(rectan);

			System.out.println("�غ� : " + base + ", ���� : " + high
					+ "�� �簢���� ���������� �Է� �Ǿ����ϴ�.");
			System.out.println();
			qa = continueQuetion();
			return qa;
		} catch (NumberFormatException e) {
			return true;
		}
	}

	public boolean triAddmenu() {
		try {
			System.out.println("�غ��� �Է� �ϼ��� : ");
			int base = io.input();
			System.out.println("���̸� �Է� �ϼ��� : ");
			int high = io.input();

			tri = new Triangle(base, high);
			tList.add(tri);

			System.out.println("�غ� : " + base + ", ���� : " + high
					+ "�� �ﰢ���� ���������� �Է� �Ǿ����ϴ�.");
			System.out.println();
			qa = continueQuetion();
			return qa;
		} catch (NumberFormatException e) {
			return true;
		}
	}

	public void bufferInput() {
		bufferInput = io.input();
		System.out.println(bufferInput + "�� �޴��� ���� �ϼ̽��ϴ�.");
		System.out.println();
	}

	public boolean continueQuetion() {
		try {
			System.out.println("��� �Է��Ͻðڽ��ϱ�? <1: ����Է�(default) 2: ���� �޴�>");

			String input = Integer.toString(io.input());

			if (input.equals("1"))
				qa = true;
			else
				qa = false;

			System.out.println();
			System.out.println();
			return qa;
		} catch (NumberFormatException e) {
			System.out.println();
			System.out.println();
			return true;
		}
	}
}
