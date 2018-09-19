package test.main;

import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String msg="";
		while(true) {
			System.out.println("한줄입력(종료:q):");
			//문자열을 한줄 입력받아서
			String str=scan.nextLine();
			if(str.equals("q")) { //q를 입력하면 반복문 탈출
			break;	
				}
			//연결 연산자로 이어 붙인다.
			msg=msg+str;
			}
		//입력된 내용 출력
		System.out.println("msg:"+msg);
			
		}
}



