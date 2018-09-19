package test_main;

import test_mypac.SubWorker;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		//새로운 작업단위 시작 시키기
		
		new SubWorker().start();
		new SubWorker().start();
		new SubWorker().start();
		
		System.out.println("main 스레드 종료");
	}
}
