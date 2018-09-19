package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		//1.test1()메소드 호출
		test1();
		//2.test2()메소드 호출
		MainClass01 a=new MainClass01();
		a.test2();
	//new MainClass01().test2();
	}
	//mainclass01 static 멤버 메소드
	public static void test1() {
		System.out.println("test1()호출");
	}
	//일반멤버 메소드
	public void test2() {
		System.out.println("test2()호출");
	}
}
