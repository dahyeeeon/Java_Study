package test_main;

import test_mypac.MyRunnable;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작됨");
		
		//한줄코드로 간단히
		new Thread(new MyRunnable()).start();

		System.out.println("main 스레드가 종료됩니다.");
	}
}
