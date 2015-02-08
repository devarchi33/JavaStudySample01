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

	// 1번째 입력값 처리를 위한 변수들.
	String input = null;
	String[] tempArrays = null;
	String shape = null;

	// 도형 정보 저장을 위한 변수들.
	String baseInput;
	double base;
	String highInput;
	double high;
	String radiusInput;
	double radius;

	// 도형객체와 도형객체를 담을 자료구조들.
	List<Circle> circles = new ArrayList<Circle>();;
	Circle cir;
	List<Rectan> rectans = new ArrayList<Rectan>();
	Rectan rec;
	List<Triangle> triangles = new ArrayList<Triangle>();;
	Triangle tri;

	// 반복문 체크를 위한 변수.
	boolean run = true;

	public void start() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("##### Menu #####");
			System.out
					.println("1. 도형입력// 2. 조회하기// 3. 종료 [ {번호/도형} 형식으로 입력하세요. ]");
			System.out.println("Ex) 1/삼각형, 2/사각형 ");
			System.out.print("입력 : ");
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
		// case 1 : 입력하기
		case "1":
			if ("삼".equals(shape) || "3".equals(shape)) {
				inputPolygonInfo();
				tri = new Triangle(base, high);
				triangles.add(tri);
				System.out.println();
				System.out.println("삼각형이 성공적으로 추가 되었습니다.");
				break;
			} else if ("사".equals(shape) || "4".equals(shape)) {
				inputPolygonInfo();
				rec = new Rectan(base, high);
				rectans.add(rec);
				System.out.println();
				System.out.println("사각형이 성공적으로 추가 되었습니다.");
				break;
			} else if ("원".equals(shape) || "0".equals(shape)) {
				inputCircleInfo();
				cir = new Circle(radius);
				circles.add(cir);
				System.out.println();
				System.out.println("원형이 성공적으로 추가 되었습니다.");
				break;
			}
			// case 2 : 조회하기
		case "3":
			System.out.println("프로그램을 종료 하겠습니다.");
			System.exit(0);
		}

	}

	// 다각형 정보 입력 메소드.
	public void inputPolygonInfo() {
		while (run) {
			try {
				System.out.println("밑변을 입력하세요.");
				baseInput = br.readLine();
				base = Double.parseDouble(baseInput);

				System.out.println("높이를 입력하세요.");
				highInput = br.readLine();
				high = Double.parseDouble(highInput);

				System.out.println("밑변 : " + base + ", 높이 : " + high + "의 "
						+ shape + "각형이 입력 되었습니다.");

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

	// 원형 정보 입력 메소드.
	public void inputCircleInfo() {
		while (run) {
			try {
				System.out.println("반지름을 입력하세요.");
				radiusInput = br.readLine();
				radius = Double.parseDouble(radiusInput);

				System.out.println("반지름 : " + radius + "의 " + shape
						+ "형이 입력 되었습니다.");
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

	// 익셉션 처리 메소드.
	public void exceptionProcess() {
		System.out.println("잘못 입력 하셨습니다.");
		System.out.println();
		start();
	}

	public void inputContinue() {
		try {
			System.out.println("계속 입력 하시겠습니까?? <1: 계속 입력// 2.메인메뉴>");
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
