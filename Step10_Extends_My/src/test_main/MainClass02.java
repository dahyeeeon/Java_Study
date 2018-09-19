package test_main;

import test_mypac.SmartPhone;

public class MainClass02 {
	public static void main(String[] args) {
		//스마트폰 객체를 생성해서 참조값을 스마트폰타입 변수에 담기
		SmartPhone p1=new SmartPhone();
		p1.call();
		p1.mobileCall();
		p1.takePicture();
		p1.doInternet();
	}
}
