package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드 시작");
		
		//util 클래스의 sing()메소드 호출
		Util.sing();
		//util 클래스의 dance()메소드 호출
		Util.dance();
		//MainClass02의 sleep 메소드 호출
		sleep();
	
	}
	
	public static void sleep() {
		System.out.println("잠 자기");
	}

}
