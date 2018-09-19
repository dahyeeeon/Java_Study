package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		//입력받는 스캐너 객체 생성
		Scanner scan=new Scanner(System.in);
		System.out.println("점수입력");
		//스캐너 객체 이용해서 정수 입력 받기(점수)
		int jumsu=scan.nextInt();
		
		if(jumsu>=90) {
			System.out.println("A");
		}else if(jumsu>=80) {
			System.out.println("B");
		}else if(jumsu>=70) {
			System.out.println("C");
		}else if(jumsu>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}
}
