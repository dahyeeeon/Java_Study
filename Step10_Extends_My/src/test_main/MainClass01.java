package test_main;

import test_mypac.HandPhone;
import test_mypac.Phone;

public class MainClass01 {
	public static void main(String[] args) {
		//폰클래스를 상속받은 핸드폰클래스의 생성자를 호출해서
		//객체를 생성한후 참조값을 핸드폰 타입 변수에 담는다.
		HandPhone p=new HandPhone();
		//폰클래스에 정의된 기능
		p.call();
		//핸드폰 클래스에 정의된 기능
		p.mobileCall();
		p.takePicture();
	}
}
