package test_main;

import test_mypac.Player;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		Thread p1=new Player("김구라");
		p1.start();
		
		Thread p2=new Player("해골");
		p2.start();
		
		System.out.println("메인 스레드 종료");
	}
}
