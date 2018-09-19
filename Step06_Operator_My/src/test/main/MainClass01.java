package test.main;
/*[연산자]
 * 1.산술연산자
 * -종류:+,-,*,/,%*/

public class MainClass01 {
	public static void main(String[] args) {
		int num1=5;
		int num2=2;
		
		//+연산자를 이용해서 두수 합 구하기
		int sum=10+1;
		int sum2=num1+num2;
		int sum3=10+num2;
		
		//정수/정수=>정수이므로 결과적으로 5를 3으로 나눈 몫
		int result=5/3; //정수를 정수로 나누면 정수형으로 나옴(소수점떼고)
		int result2=num1/num2;
		
		//정확한 실수값을 얻어내고 싶으면 연산에 참여하는
		//데이터가 어느 하나만이라도 double타입이면 된다.
		double result3=5/3.0;
		double result4=num1/(double)num2;
		
		
		//num1을 num2로 나눈 나머지값
		int result5=num1%num2;
	}
}
