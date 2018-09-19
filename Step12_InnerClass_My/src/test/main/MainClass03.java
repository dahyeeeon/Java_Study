package test.main;

public class MainClass03 {
 //inner Class
	class Gura{
		
	}
	public static void main(String[] args) {
	
		//메소드 안에 클래스를 정의할 수 있음
		class Car{
			//메소드 안에 정의한건 local inner Class
			public void drive() {
				System.out.println("달려요");
			}
		}
		//객체 생성후
		Car car=new Car();
		//메소드 호출 가능
		car.drive();
	}
}
