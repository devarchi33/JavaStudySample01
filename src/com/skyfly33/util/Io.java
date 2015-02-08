package com.skyfly33.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Io {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static Io io = new Io();
	
	private Io(){}
	
	public static Io getInstance(){
		return io;
	}

	public int input() {
		try {
			int input = 0;
			input = Integer.parseInt(br.readLine());
			return input;
		} catch (IOException e) {
			return Integer.parseInt(exceptionProcess());
		} catch (ArrayIndexOutOfBoundsException e) {
			return Integer.parseInt(exceptionProcess());
		}
	}

	// menu switch���� �Ⱥ��� '0'�� ���Է�.
	public String exceptionProcess() {
		System.out.println("�߸� �Է� �Ͽ����ϴ�!!");
		System.out.println();
		String exception = "0";
		return exception;
	}
}
