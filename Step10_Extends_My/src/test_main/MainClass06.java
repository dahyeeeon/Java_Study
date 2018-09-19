package test_main;

import test_mypac.HandPhone;
import test_mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//핸드폰 객체 생성해서 핸드폰 타입 변수에 대입
		HandPhone hPhone=new HandPhone();
		//실행시 ClassCast Exception 발생
		SmartPhone p1=(SmartPhone)hPhone;
		p1.doInternet();
		
	}
}
