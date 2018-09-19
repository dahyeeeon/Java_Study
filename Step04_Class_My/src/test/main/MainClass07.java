package test.main;

import test.mypac.Person;

/*1. test.mypac 패키지에 person이라는 이름의 클래스 만들기
 *2. static을 붙이고 필드 1개 정의하기
 *3. static을 붙이지 않고 메소드 2개 정의하기
 *4.main()메소드에서 person 클래스를 이용해서 객체 생성후 2개의 메소드를 호출하기 */

public class MainClass07 {
	public static void main(String[] args) {
		int a=Person.a;

		Person ab = new Person();
		ab.number1();
		ab.number2();
	
	}
}
