package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;
/*[Exception 처리문법]
 * try{
 * 	exception 이 발생할 가능성이 있는 코드
 * 
 * }catch(Exception type 변수명){
 * 	Exception이 발생했을때 실행할 코드
 * }catch(Exception type2 변수명){
 * }
 * 
 * */
public class MainClass03 {
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
	
		//기타 예외처리
		catch(Exception e){
			//모든 예외처리는 여기서 처리가 된다.
			//예외처리는 모든 Exception의 부모 타입
			System.out.println("기타 Exception 발생");
		}
		
		System.out.println("main 메소드 종료");
		
	}
}
