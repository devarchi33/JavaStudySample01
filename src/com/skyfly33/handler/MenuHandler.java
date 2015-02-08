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
		case 1: // 원
			subChoiceNum = menu.subMenu(runSub);
			subMenuHandler(mainChoiceNum, subChoiceNum, qa);
			break;
		case 2: // 삼각형
			subChoiceNum = menu.subMenu(runSub);
			subMenuHandler(mainChoiceNum, subChoiceNum, qa);
			break;
		case 3: // 사각형
			subChoiceNum = menu.subMenu(runSub);
			subMenuHandler(mainChoiceNum, subChoiceNum, qa);
			break;
		case 4: // 종료
			System.out.println("프로그램을 종료 하겠습니다.");
			System.out.println("이용해 주셔서 감사합니다.");
			System.exit(0);
		default:
			System.out.println("@@@@@@@@@@@ 잘못 입력 하셨습니다. @@@@@@@@@@@");
			System.out.println();
			return mainMenuHandler();
		}

		return false;
	}

	public boolean subMenuHandler(int mainChoiceNum, int subChoiceNum,
			boolean qa) {
		while (qa) {
			switch (subChoiceNum) {
			case 1: // 입력하기
				if (mainChoiceNum == 1)
					qa = menu.circleAddMenu();
				else if (mainChoiceNum == 2)
					qa = menu.triAddmenu();
				else if (mainChoiceNum == 3)
					qa = menu.rectanAddmenu();
				break;
			case 2: // 조회하기
			case 3: // 넓이 구하기
			case 4: // 메인메뉴로 돌아가기
				mainMenuHandler();
				break;
			case 5: // 종료하기
				System.out.println("프로그램을 종료 하겠습니다.");
				System.out.println("이용해 주셔서 감사합니다.");
				System.exit(0);
			}
		}
		subChoiceNum = menu.subMenu(runSub);
		return subMenuHandler(mainChoiceNum, subChoiceNum, true);
	}
}
