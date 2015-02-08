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
				System.out.println("########### Main Menu(도형 고르기) #########");
				System.out.println("1. 원");
				System.out.println("2. 삼각형");
				System.out.println("3. 사각형");
				System.out.println("4. 종료하기");
				System.out.println("메뉴 번호를 입력하세요 : ");

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
			System.out.println("########## Sub Menu(기능 고르기) ##########");
			System.out.println("1. 입력하기");
			System.out.println("2. 조회하기");
			System.out.println("3. 넓이 구하기");
			System.out.println("4. 메인으로");
			System.out.println("5. 종료하기");
			System.out.println("메뉴 번호를 입력하세요 : ");

			bufferInput();
			runSub = false;
		}
		return bufferInput;
	}

	public boolean circleAddMenu() {
		try {
			System.out.println("반지름을 입력 하세요 : ");
			int radius = io.input();
			// System.out.println(radius);
			circle = new Circle(radius);
			cList.add(circle);

			System.out.println("반지름 : " + radius + "의 원이 성공적으로 입력 되었습니다.");
			System.out.println();
			qa = continueQuetion();
			return qa;
		} catch (NumberFormatException e) {
			return true;
		}
	}

	public boolean rectanAddmenu() {
		try {
			System.out.println("밑변을 입력 하세요 : ");
			int base = io.input();
			System.out.println("높이를 입력 하세요 : ");
			int high = io.input();

			rectan = new Rectan(base, high);
			rList.add(rectan);

			System.out.println("밑변 : " + base + ", 높이 : " + high
					+ "의 사각형이 성공적으로 입력 되었습니다.");
			System.out.println();
			qa = continueQuetion();
			return qa;
		} catch (NumberFormatException e) {
			return true;
		}
	}

	public boolean triAddmenu() {
		try {
			System.out.println("밑변을 입력 하세요 : ");
			int base = io.input();
			System.out.println("높이를 입력 하세요 : ");
			int high = io.input();

			tri = new Triangle(base, high);
			tList.add(tri);

			System.out.println("밑변 : " + base + ", 높이 : " + high
					+ "의 삼각형이 성공적으로 입력 되었습니다.");
			System.out.println();
			qa = continueQuetion();
			return qa;
		} catch (NumberFormatException e) {
			return true;
		}
	}

	public void bufferInput() {
		bufferInput = io.input();
		System.out.println(bufferInput + "번 메뉴를 선택 하셨습니다.");
		System.out.println();
	}

	public boolean continueQuetion() {
		try {
			System.out.println("계속 입력하시겠습니까? <1: 계속입력(default) 2: 상위 메뉴>");

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
