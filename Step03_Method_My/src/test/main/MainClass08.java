package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("main 메소드 시작");
		int a=10393048;
		int b=20320832;
		int c=30;
		int d=40;
		
		showSum(a,b);
		showSum(c,d);
	}
	public static void showSum(int num1,int num2) {
		//메소드 안에 콜했을때 만들어지는 지역변수는 다 쓰면 사라진다
		int sum=num1+num2;
		System.out.println("두수의 합:"+sum);
	}
}
