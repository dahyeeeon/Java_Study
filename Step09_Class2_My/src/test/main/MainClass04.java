package test.main;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Car 객체를 담을 수 있는 방 3개의 배열 객체 생성
		Car[] ca=new Car[3];
		//2. 배열의 각각의 방에 차 이름이 "소나타","프라이드","그랜져"인 Car 객체의 참조값 저장
		ca[0]=new Car("소나타");
		ca[1]=new Car("프라이드");
		ca[2]=new Car("그랜져");
		
		//3. for 문을 이용해 배열에 저장된 Car 객체의 drive()라는 메소드를 순서대로 호출
		for(int i=0;i<ca.length;i++) {
			ca[i].drive();
		}
		
	}
}
