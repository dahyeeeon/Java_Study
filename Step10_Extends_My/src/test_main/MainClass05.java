package test_main;

import test_mypac.HandPhone;
import test_mypac.Phone;
import test_mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//SmartPhone type 객체를 생성해서 Object type 변수에 담기
		Object p1=new SmartPhone();
		//Phone타입으로 캐스팅해서 대입
		Phone p2=(Phone)p1; //강제로 p1의 object 타입을 phone타입으로 캐스팅
		HandPhone p3=(HandPhone)p1;
		SmartPhone p4=(SmartPhone)p1;
		
	}
}
