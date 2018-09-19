package test.main;

import test.auto.Car;

public class MainClass09 {
	public static void main(String[] args) {
		Car[] cars=new Car[3];
		cars[0]=new Car();
		cars[1]=new Car();
		//0번방,1번방에 들어있는 car 객체의 메소드 호출
		cars[0].drive();
		cars[1].drive();
		//비어있는 방에 넣으면 null오류
		//cars[2].drive();
		
		//3번방은 존재하지 않으므로 배열 오류(Execption)발생
		//cars[3]=new car();
	}
}
