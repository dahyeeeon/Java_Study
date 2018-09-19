package test.main;

public class MainClass01 {
	
	//main 메소드
	public static void main(String[] args) {
		System.out.println("main 메소드 시작");
		/*
		 * static 예약어가 붙은 메소드를 호출하는 방법
		 * 클래스명.메소드명();
		 * ex)
		 * MainClass01.a();
		*/
		MainClass01.a();
		b(); //같은 클래스안에 존재하면 클래스명 생략가능
		
		System.out.println("main 메소드 종료(return)");
	}
	//a 메소드
	public static void a() {
		System.out.println("a start");
		System.out.println("a return");
		
	}
	//b 메소드
		public static void b() {
			System.out.println("b start");
			System.out.println("b return");
			
		}
}
