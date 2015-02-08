package com.skyfly33.util;

import java.util.ArrayList;
import java.util.List;

import com.skyfly33.shape.*;

public class Menu {

	private Io io = Io.getInstance();

	// �ڷ����� �θ�Ÿ������ �Ͽ� �ְ� �Ǹ� �߰��ÿ� ������ ������ �˻��ÿ� ������ ��.
	private Circle circle;
	private List<Circle> cList = new ArrayList<Circle>();
	private Rectan rectan;
	private List<Rectan> rList = new ArrayList<Rectan>();
	private Triangle tri;
	private List<Triangle> tList = new ArrayList<Triangle>();

	/*
	 * //�θ� Ÿ������ vo�� ���� �ϰ� �����ÿ� �ڽ�Ÿ������ �����Ͽ� ���� ArrayList�� �㵵�� �Ѵ�. private Shape
	 * sTri; private Shape sRectan; private Shape sCircle; private List<Shape>
	 * sList = new ArrayList<Shape>();
	 */

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
				System.out.println("########## Sub Menu(��� ����) ##########");
				System.out.println("1. �Է��ϱ�");
				System.out.println("2. ��ü ��ȸ�ϱ�");
				System.out.println("3. ���� ���ϱ�");
				System.out.println("4. ��������");
				System.out.println("5. �����ϱ�");
				System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");

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
	 * System.out.println("�������� �Է� �ϼ��� : "); int radius = io.input(); sCircle =
	 * new Circle(radius); sList.add(sCircle);
	 * 
	 * System.out.println("������ : " + radius + "�� ���� ���������� �Է� �Ǿ����ϴ�.");
	 * System.out.println(); qa = continueQuetion(); return qa; } catch
	 * (NumberFormatException e) { return true; } }
	 * 
	 * public boolean rectanAddmenu() { try {
	 * System.out.println("�غ��� �Է� �ϼ��� : "); int base = io.input();
	 * System.out.println("���̸� �Է� �ϼ��� : "); int high = io.input();
	 * 
	 * sRectan = new Rectan(base, high); sList.add(sRectan);
	 * 
	 * System.out.println("�غ� : " + base + ", ���� : " + high +
	 * "�� �簢���� ���������� �Է� �Ǿ����ϴ�."); System.out.println(); qa = continueQuetion();
	 * return qa; } catch (NumberFormatException e) { return true; } }
	 * 
	 * public boolean triAddmenu() { try { System.out.println("�غ��� �Է� �ϼ��� : ");
	 * int base = io.input(); System.out.println("���̸� �Է� �ϼ��� : "); int high =
	 * io.input();
	 * 
	 * sTri = new Triangle(base, high); sList.add(sTri);
	 * 
	 * System.out.println("�غ� : " + base + ", ���� : " + high +
	 * "�� �ﰢ���� ���������� �Է� �Ǿ����ϴ�."); System.out.println(); qa = continueQuetion();
	 * return qa; } catch (NumberFormatException e) { return true; } }
	 */

	public boolean shapeAddMenu(int type) {
		try {
			int radius = 0;
			int base = 0;
			int high = 0;

			switch (type) {
			case 1: // ��
				System.out.println("�������� �Է� �ϼ��� : ");
				radius = io.input();

				circle = new Circle(radius);
				cList.add(circle);

				System.out.println("������ : " + radius + "�� ���� ���������� �Է� �Ǿ����ϴ�.");
				System.out.println();
				System.out.println();
				qa = continueQuestionMenu();
				return qa;
			case 2: // �ﰢ��
				System.out.println("�غ��� �Է� �ϼ��� : ");
				base = io.input();
				System.out.println("���̸� �Է� �ϼ��� : ");
				high = io.input();
				System.out.println(base);
				System.out.println(high);

				tri = new Triangle(base, high);
				tList.add(tri);
				System.out.println(base);
				System.out.println(high);

				System.out.println("�غ� : " + base + ", ���� : " + high
						+ "�� �ﰢ���� ���������� �Է� �Ǿ����ϴ�.");
				System.out.println();
				System.out.println();
				qa = continueQuestionMenu();
				return qa;
			case 3: // �簢��
				System.out.println("�غ��� �Է� �ϼ��� : ");
				base = io.input();
				System.out.println("���̸� �Է� �ϼ��� : ");
				high = io.input();

				rectan = new Rectan(base, high);
				rList.add(rectan);

				System.out.println("�غ� : " + base + ", ���� : " + high
						+ "�� �簢���� ���������� �Է� �Ǿ����ϴ�.");
				System.out.println();
				System.out.println();
				qa = continueQuestionMenu();
				return qa;
			default:
				System.out.println("�߸��� ���Դϴ�.");
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
					System.out.println("������ �����ϴ�.");
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
					System.out.println("������ �����ϴ�.");
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
					System.out.println("������ �����ϴ�.");
					System.out.println();
					System.out.println();
				}

				System.out.println();
				System.out.println();
				return qa = continueQuestionMenu();
			default:
				System.out.println("�߸��� ���Դϴ�.");
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
				System.out.println("�������� �Է� �ϼ��� : ");
				radius = io.input();
				System.out.println();

				//�Է��� �������� circle�� ArrayList�� ��� �ִ��� Ȯ���ϱ� ���� temp ��ü.
				cTemp = new Circle(radius);

				for (int i = 0; i < cList.size(); i++) {
					if (cTemp.getRadius() == cList.get(i).getRadius()) {
						System.out.println("���Ϸ��� �������� ������ Index[" + i
								+ "]�� ��� �ְ� ���̴� " + cTemp.getExtent() + "�Դϴ�.");
						System.out.println();
						System.out.println();
					} else {
						System.out.println("������ ��� ���� �ʽ��ϴ�.");
						System.out.println();
						System.out.println();
					}
				}
				
				qa = continueQuestionMenu();
				return qa;
			case 2:
				System.out.println("�غ��� �Է� �ϼ��� : ");
				base = io.input();
				System.out.println("���̸� �Է� �ϼ��� : ");
				high = io.input();
				System.out.println();

				tTemp = new Triangle(base,high);

				for (Triangle list : tList) {
					if (tTemp.getBase() == list.getBase() && tTemp.getHigh() == list.getHigh()) {
						System.out.println("���Ϸ��� �ﰢ���� ���̴� " + tTemp.getExtent() + "�Դϴ�.");
						System.out.println();
						System.out.println();
					} else {
						System.out.println("������ ��� ���� �ʽ��ϴ�.");
						System.out.println();
						System.out.println();
					}
				}
				
				qa = continueQuestionMenu();
				return qa;
			case 3:
				System.out.println("�غ��� �Է� �ϼ��� : ");
				base = io.input();
				System.out.println("���̸� �Է� �ϼ��� : ");
				high = io.input();
				System.out.println();

				rTemp = new Rectan(base,high);

				for (Rectan list : rList) {
					if (rTemp.getBase() == list.getBase() && rTemp.getHigh() == list.getHigh()) {
						System.out.println("���Ϸ��� �簢���� ���̴� " + rTemp.getExtent() + "�Դϴ�.");
						System.out.println();
						System.out.println();
					} else {
						System.out.println("������ ��� ���� �ʽ��ϴ�.");
						System.out.println();
						System.out.println();
					}
				}
				qa = continueQuestionMenu();
				return qa;
			default:
				System.out.println("�߸��� ���Դϴ�.");
				return false;
			}
		} catch (NumberFormatException e) {
			return true;
		}
	}

	public void bufferInputMenu() {
		bufferInput = io.input();
		System.out.println(bufferInput + "�� �޴��� ���� �ϼ̽��ϴ�.");
		System.out.println();
		System.out.println();
	}

	public boolean continueQuestionMenu() {
		try {
			System.out.println("��� �Ͻðڽ��ϱ�? <1: ��� 2: ���� �޴�>");

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
			System.out.println("�߸��� �Է��Դϴ�.");
			System.out.println();
			System.out.println();
			return continueQuestionMenu();
		}
	}
}
