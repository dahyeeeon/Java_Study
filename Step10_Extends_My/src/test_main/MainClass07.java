package test_main;

import test_mypac.HandPhone;
import test_mypac.Phone;
import test_mypac.SmartPhone;

public class MainClass07 {
	public static void main(String[] args) {
		Phone p1=new Phone();
		HandPhone p2=new HandPhone();
		SmartPhone p3=new SmartPhone();
		
		//메소드 호출하면서 변수에 담긴 참조값 전달
		MainClass07.usePhone(p1); //Phone p=p1;
		MainClass07.usePhone(p2); //자식타입은 부모타입에 대입가능
		MainClass07.usePhone(p3);
		
		//메소드 호출하면서 객체 생성, 참조값 전달
		MainClass07.usePhone(new Phone());
		MainClass07.usePhone(new HandPhone());
		MainClass07.usePhone(new SmartPhone());
		//nullpointException 발생
		MainClass07.usePhone(null);
	}
	public static void usePhone(Phone p) {
		
		p.call();
	}
}
