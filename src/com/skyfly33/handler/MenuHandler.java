package com.skyfly33.handler;

import com.skyfly33.util.Menu;

public class MenuHandler {

	private Menu menu = new Menu();
	private int mainChoiceNum;
	private int subChoiceNum;
	private boolean qa = true;
	private boolean runMain = true, runSub = true;

	public boolean mainMenuHandler() {
		mainChoiceNum = menu.mainMenu(runMain);

		switch (mainChoiceNum) {
		case 1: // ��
			subChoiceNum = menu.subMenu(runSub);
			subMenuHandler(mainChoiceNum, subChoiceNum, qa);
			break;
		case 2: // �ﰢ��
			subChoiceNum = menu.subMenu(runSub);
			subMenuHandler(mainChoiceNum, subChoiceNum, qa);
			break;
		case 3: // �簢��
			subChoiceNum = menu.subMenu(runSub);
			subMenuHandler(mainChoiceNum, subChoiceNum, qa);
			break;
		case 4: // ����
			System.out.println("���α׷��� ���� �ϰڽ��ϴ�.");
			System.out.println("�̿��� �ּż� �����մϴ�.");
			System.exit(0);
		default:
			System.out.println("@@@@@@@@@@@ �߸� �Է� �ϼ̽��ϴ�. @@@@@@@@@@@");
			System.out.println();
			return mainMenuHandler();
		}

		return false;
	}

	public boolean subMenuHandler(int mainChoiceNum, int subChoiceNum,
			boolean qa) {
		while (qa) {
			switch (subChoiceNum) {
			case 1: // �Է��ϱ�
				if (mainChoiceNum == 1)
					qa = menu.circleAddMenu();
				else if (mainChoiceNum == 2)
					qa = menu.triAddmenu();
				else if (mainChoiceNum == 3)
					qa = menu.rectanAddmenu();
				break;
			case 2: // ��ȸ�ϱ�
			case 3: // ���� ���ϱ�
			case 4: // ���θ޴��� ���ư���
				mainMenuHandler();
				break;
			case 5: // �����ϱ�
				System.out.println("���α׷��� ���� �ϰڽ��ϴ�.");
				System.out.println("�̿��� �ּż� �����մϴ�.");
				System.exit(0);
			}
		}
		subChoiceNum = menu.subMenu(runSub);
		return subMenuHandler(mainChoiceNum, subChoiceNum, true);
	}
}
