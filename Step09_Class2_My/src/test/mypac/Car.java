package test.mypac;

public class Car {
	//필드정의
	public String name;
	
	//Car 생성자 다중정의
	//생성자는 리턴타입이 없고 클래스명과 동일
	public Car() {
		System.out.println("car()생성자 호출");
	}
	//인자로 스트링타입 전달받는 생성자
	public Car(String name) {
		//생성자의 인자로 전달되는 값을 필드에 저장하기
		this.name=name;
		
		System.out.println("car(string name)생성자 호출됨");
		
	}
	
	//메소드
	public void drive() {
		System.out.println(this.name+"달려요");
	}

}
