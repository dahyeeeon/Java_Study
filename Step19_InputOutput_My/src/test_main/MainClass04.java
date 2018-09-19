package test_main;

import java.io.IOException;
import java.io.OutputStream;

public class MainClass04 {
	public static void main(String[] args) {
		//PrintStream 객체의 참조값을 부모타입인
		//outputStream 타입으로 받아서 테스트하기
		OutputStream os=System.out;
		try {
			//출력할 준비
			os.write(97);
			os.write(98);
			os.write(99);
			os.write(100);
			os.write(101); //호출1
			//출력할 준비가 된 문자열 출력하기
			os.flush();
			System.out.println();
			
			//방 5개짜리 byte[]객체를 생성해보세요
			byte[] nums=new byte[5];
			//각각의 방에 정수 담기
			nums[0]=102;
			nums[1]=103;
			nums[2]=104;
			nums[3]=105;
			nums[4]=106;
			
			//.write() 메소드 호출하면서 byte[] 객체 전달
			os.write(nums); //호출2 auto flush 기능이 있다.
			System.out.println();
			
			//.write(byte[],시작인덱스,갯수)
			os.write(nums, 0, 1);//호출3
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
