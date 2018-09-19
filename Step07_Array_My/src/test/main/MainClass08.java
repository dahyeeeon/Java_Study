package test.main;

import test.auto.Car;

public class MainClass08 {
	public static void main(String[] args) {
		//car type을 담을 수 있는 방 5개 짜리 배열 객체 생성
		Car[] run=new Car[5];
		//0번방에 car 객체의 참조값을 대입하기
		run[0]=new Car();
		//1번방에 Car 객체 참조값 대입하기
		run[1]=new Car();
		run[1].drive();
		
		//2,3번방에 c라는 변수에 참조값을 대입
		Car c=new Car();
		run[2]=c;
		run[3]=c;
		
		run[4]=run[0];
	}
}
