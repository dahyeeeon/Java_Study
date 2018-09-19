package test_main;

import test_mypac.HandPhone;
import test_mypac.Phone;
import test_mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		//스마트폰객체를 생성해서 참조값을 스마트폰 타입 변수에 담기
		//new 할때 객체 생성
		SmartPhone sPhone=new SmartPhone();
		//이미 생성된 객체의 참조값은 부모 타입 변수에 다시 담을 수 있다.
		//sPhone자식타입 객체는 object,phone,handphne같은 부모타입에 들어감
		Object p1=sPhone;
		Phone p2=sPhone;
		HandPhone p3=sPhone;
		
	}
}
