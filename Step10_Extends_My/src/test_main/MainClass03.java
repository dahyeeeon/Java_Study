package test_main;

import test_mypac.HandPhone;
import test_mypac.Phone;
import test_mypac.SmartPhone;

/*[다형성(polymorphism)]
 * -java에서 객체의 참조값은 다형성을 가질 수 있다
 * -다형성이란 여러가지 타입이 될 수 있다는 의미
 * */
public class MainClass03 {
	public static void main(String[] args) {
		//스마트폰 객체의 참조값을 부모타입 변수에 대입하기
		//p1.은 object 정의된 기능만 사용가능
		Object p1=new SmartPhone();
		//p2.은 object,phone 기능사용가능
		Phone p2=new SmartPhone();
		//p3.은 object,phone,handphone 기능사용가능
		HandPhone p3=new SmartPhone();
		//스마트폰 객체의 참조값을 스마트폰 타입 변수에 대입하기
		//p4.은 object,phone,handphone,smartphone 모든 기능 사용가능
		SmartPhone p4=new SmartPhone();

	}
}
