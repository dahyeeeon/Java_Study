package test_main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is);
		
		//InputStreamReader 객체를 생성자의 인자로 전달
		//BufferedReader의 참조값 얻어내기
		BufferedReader br=new BufferedReader(isr);
		System.out.println("문자열 한줄입력:");
		try {
			int code=br.read();
			System.out.println("입력한 문자열:"+code);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
