package test.main;

import java.util.Scanner;

public class MainClass09 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//문자열을 누적시킬 수 있는 객체 생성
		StringBuilder builder=new StringBuilder();

		while(true) {
			System.out.println("한줄입력(종료:q):");
			//문자열을 한줄 입력받아서
			String str=scan.nextLine();
			if(str.equals("q")) { //q를 입력하면 반복문 탈출
			break;	
				}
			
			//StringBuilder 객체에 누적시키기
			builder.append(str);
			
			//누적된 문자열 한번에 얻어내기
			String result=builder.toString();
			}
		//입력된 내용 출력
		System.out.println("msg:"+builder);
			
		}
}



