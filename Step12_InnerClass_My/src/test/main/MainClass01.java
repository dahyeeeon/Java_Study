package test.main;

public class MainClass01 {
//클래스 안에 필드,메소드,스태틱필드,스태틱메소드,생성자 가능
	//필드(new 해서 객체 생성)
	public int num=10;
	//static 필드(클래스와 함께 1개 만들어짐)
	public static int num2=20;
	
	//static main 메소드
	public static void main(String[] args) {
	//static 메소드 안에서는 static 자원들만 참조가능
	// int result=this.num; //this는 static안에서x 객체안에서만
		
		
		//참조가능
		int result2=MainClass01.num2;
		
		Gura a=new Gura();
		
	}
	//내부 클래스정의하기
	public static class Gura{
		
	}
	
}
