package com.skyfly33.util;

import java.util.ArrayList;
import java.util.List;

import com.skyfly33.shape.*;

public class Menu {

	private Io io = Io.getInstance();

	// 자료형을 부모타입으로 하여 넣게 되면 추가시엔 문제가 없지만 검색시에 문제가 됨.
	private Circle circle;
	private List<Circle> cList = new ArrayList<Circle>();
	private Rectan rectan;
	private List<Rectan> rList = new ArrayList<Rectan>();
	private Triangle tri;
	private List<Triangle> tList = new ArrayList<Triangle>();

	/*
	 * //부모 타입으로 vo를 선언 하고 생성시에 자식타입으로 생성하여 같은 ArrayList에 담도록 한다. private Shape
	 * sTri; private Shape sRectan; private Shape sCircle; private List<Shape>
	 * sList = new ArrayList<Shape>();
	 */

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

				bufferInputMenu();
				runMain = false;
			}
			return bufferInput;
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public int subMenu(boolean runSub) {
		try {
			while (runSub) {
				System.out.println("########## Sub Menu(기능 고르기) ##########");
				System.out.println("1. 입력하기");
				System.out.println("2. 전체 조회하기");
				System.out.println("3. 넓이 구하기");
				System.out.println("4. 메인으로");
				System.out.println("5. 종료하기");
				System.out.println("메뉴 번호를 입력하세요 : ");

				bufferInputMenu();
				runSub = false;
			}
			return bufferInput;
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	/*
	 * public boolean circleAddMenu() { try {
	 * System.out.println("반지름을 입력 하세요 : "); int radius = io.input(); sCircle =
	 * new Circle(radius); sList.add(sCircle);
	 * 
	 * System.out.println("반지름 : " + radius + "의 원이 성공적으로 입력 되었습니다.");
	 * System.out.println(); qa = continueQuetion(); return qa; } catch
	 * (NumberFormatException e) { return true; } }
	 * 
	 * public boolean rectanAddmenu() { try {
	 * System.out.println("밑변을 입력 하세요 : "); int base = io.input();
	 * System.out.println("높이를 입력 하세요 : "); int high = io.input();
	 * 
	 * sRectan = new Rectan(base, high); sList.add(sRectan);
	 * 
	 * System.out.println("밑변 : " + base + ", 높이 : " + high +
	 * "의 사각형이 성공적으로 입력 되었습니다."); System.out.println(); qa = continueQuetion();
	 * return qa; } catch (NumberFormatException e) { return true; } }
	 * 
	 * public boolean triAddmenu() { try { System.out.println("밑변을 입력 하세요 : ");
	 * int base = io.input(); System.out.println("높이를 입력 하세요 : "); int high =
	 * io.input();
	 * 
	 * sTri = new Triangle(base, high); sList.add(sTri);
	 * 
	 * System.out.println("밑변 : " + base + ", 높이 : " + high +
	 * "의 삼각형이 성공적으로 입력 되었습니다."); System.out.println(); qa = continueQuetion();
	 * return qa; } catch (NumberFormatException e) { return true; } }
	 */

	public boolean shapeAddMenu(int type) {
		try {
			int radius = 0;
			int base = 0;
			int high = 0;

			switch (type) {
			case 1: // 원
				System.out.println("반지름을 입력 하세요 : ");
				radius = io.input();

				circle = new Circle(radius);
				cList.add(circle);

				System.out.println("반지름 : " + radius + "의 원이 성공적으로 입력 되었습니다.");
				System.out.println();
				System.out.println();
				qa = continueQuestionMenu();
				return qa;
			case 2: // 삼각형
				System.out.println("밑변을 입력 하세요 : ");
				base = io.input();
				System.out.println("높이를 입력 하세요 : ");
				high = io.input();
				System.out.println(base);
				System.out.println(high);

				tri = new Triangle(base, high);
				tList.add(tri);
				System.out.println(base);
				System.out.println(high);

				System.out.println("밑변 : " + base + ", 높이 : " + high
						+ "의 삼각형이 성공적으로 입력 되었습니다.");
				System.out.println();
				System.out.println();
				qa = continueQuestionMenu();
				return qa;
			case 3: // 사각형
				System.out.println("밑변을 입력 하세요 : ");
				base = io.input();
				System.out.println("높이를 입력 하세요 : ");
				high = io.input();

				rectan = new Rectan(base, high);
				rList.add(rectan);

				System.out.println("밑변 : " + base + ", 높이 : " + high
						+ "의 사각형이 성공적으로 입력 되었습니다.");
				System.out.println();
				System.out.println();
				qa = continueQuestionMenu();
				return qa;
			default:
				System.out.println("잘못된 값입니다.");
				return false;
			}
		} catch (NumberFormatException e) {
			return true;
		}
	}

	public boolean shapeSearchAllMenu(int shape) {
		try {
			switch (shape) {
			case 1:
				if (cList.size() != 0) {
					for (int i = 0; i < cList.size(); i++) {
						System.out.println("Index[" + i + "] : "
								+ cList.get(i).getShapeInfo(shape));
					}
				} else {
					System.out.println("도형이 없습니다.");
					System.out.println();
					System.out.println();
				}

				System.out.println();
				System.out.println();
				return qa = continueQuestionMenu();
			case 2:
				if (tList.size() != 0) {
					for (int i = 0; i < tList.size(); i++) {
						System.out.println("Index[" + i + "] : "
								+ tList.get(i).getShapeInfo(shape));
					}
				} else {
					System.out.println("도형이 없습니다.");
					System.out.println();
					System.out.println();
				}

				System.out.println();
				System.out.println();
				return qa = continueQuestionMenu();
			case 3:
				if (rList.size() != 0) {
					for (int i = 0; i < rList.size(); i++) {
						System.out.println("Index[" + i + "] : "
								+ rList.get(i).getShapeInfo(shape));
					}
				} else {
					System.out.println("도형이 없습니다.");
					System.out.println();
					System.out.println();
				}

				System.out.println();
				System.out.println();
				return qa = continueQuestionMenu();
			default:
				System.out.println("잘못된 값입니다.");
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public boolean shapeGetExtentMenu(int shape) {
		try {
			int radius = 0;
			int base = 0;
			int high = 0;
			Circle cTemp = null;
			Triangle tTemp = null;
			Rectan rTemp = null;

			switch (shape) {
			case 1:
				System.out.println("반지름을 입력 하세요 : ");
				radius = io.input();
				System.out.println();

				//입력한 반지름의 circle이 ArrayList에 들어 있는지 확인하기 위한 temp 객체.
				cTemp = new Circle(radius);

				for (int i = 0; i < cList.size(); i++) {
					if (cTemp.getRadius() == cList.get(i).getRadius()) {
						System.out.println("구하려는 반지름의 도형은 Index[" + i
								+ "]에 들어 있고 넓이는 " + cTemp.getExtent() + "입니다.");
						System.out.println();
						System.out.println();
					} else {
						System.out.println("도형이 들어 있지 않습니다.");
						System.out.println();
						System.out.println();
					}
				}
				
				qa = continueQuestionMenu();
				return qa;
			case 2:
				System.out.println("밑변을 입력 하세요 : ");
				base = io.input();
				System.out.println("높이를 입력 하세요 : ");
				high = io.input();
				System.out.println();

				tTemp = new Triangle(base,high);

				for (Triangle list : tList) {
					if (tTemp.getBase() == list.getBase() && tTemp.getHigh() == list.getHigh()) {
						System.out.println("구하려는 삼각형의 넓이는 " + tTemp.getExtent() + "입니다.");
						System.out.println();
						System.out.println();
					} else {
						System.out.println("도형이 들어 있지 않습니다.");
						System.out.println();
						System.out.println();
					}
				}
				
				qa = continueQuestionMenu();
				return qa;
			case 3:
				System.out.println("밑변을 입력 하세요 : ");
				base = io.input();
				System.out.println("높이를 입력 하세요 : ");
				high = io.input();
				System.out.println();

				rTemp = new Rectan(base,high);

				for (Rectan list : rList) {
					if (rTemp.getBase() == list.getBase() && rTemp.getHigh() == list.getHigh()) {
						System.out.println("구하려는 사각형의 넓이는 " + rTemp.getExtent() + "입니다.");
						System.out.println();
						System.out.println();
					} else {
						System.out.println("도형이 들어 있지 않습니다.");
						System.out.println();
						System.out.println();
					}
				}
				qa = continueQuestionMenu();
				return qa;
			default:
				System.out.println("잘못된 값입니다.");
				return false;
			}
		} catch (NumberFormatException e) {
			return true;
		}
	}

	public void bufferInputMenu() {
		bufferInput = io.input();
		System.out.println(bufferInput + "번 메뉴를 선택 하셨습니다.");
		System.out.println();
		System.out.println();
	}

	public boolean continueQuestionMenu() {
		try {
			System.out.println("계속 하시겠습니까? <1: 계속 2: 상위 메뉴>");

			String input = Integer.toString(io.input());

			if (input.equals("1"))
				qa = true;
			else if(input.equals("2"))
				qa = false;
			else
				throw new NumberFormatException();

			System.out.println();
			System.out.println();
			return qa;
		} catch (NumberFormatException e) {
			System.out.println("잘못된 입력입니다.");
			System.out.println();
			System.out.println();
			return continueQuestionMenu();
		}
	}
}
