package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		//랜덤 객체 생성해서 참조값 변수에 담기
		Random ran=new Random();
		//랜덤객체의 nextInt()메소드를 이용해서
		//int 범위내에서 무작위 정수를 얻어낸다.
		int result=ran.nextInt();
		System.out.println("결과:"+result);
	}
}
