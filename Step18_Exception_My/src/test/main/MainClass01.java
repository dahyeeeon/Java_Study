package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;
/*[Exception 처리문법]
 * try{
 * 	exception 이 발생할 가능성이 있는 코드
 * 
 * }catch(Exception type 변수명){
 * 	Exception이 발생했을때 실행할 코드
 * }
 * 
 * */
public class MainClass01 {
	public static void main(String[] args) {
		//키보드로부터 입력 받을 스캐너 객체
		Scanner scan=new Scanner(System.in);
		try{
			System.out.println("나눌 수 입력:");
			int num1=scan.nextInt();
			System.out.println("나누어 지는 수 입력:");
			int num2=scan.nextInt();
			
			//num2를 num1로 나눈 몫
			int mog=num2/num1;
			//num2를 num1로 나눈 나머지
			int nmg=num2%num1;
			
			System.out.println(num2+"를"+num1+"으로 나눈 결과");
			System.out.println("몫:"+mog+" 나머지:"+nmg);
			
		}
		//나눌 수 없을때
		catch(ArithmeticException ae){
			System.out.println("어떤수를 0으로 나눌 수 없어요.");
			ae.printStackTrace();
		
		//문자로 입력했을때
		}catch(InputMismatchException im) {
			System.out.println("숫자형식으로 입력해주세요");
			im.printStackTrace();
		}
		
		System.out.println("main 메소드 종료");
		
	}
}
