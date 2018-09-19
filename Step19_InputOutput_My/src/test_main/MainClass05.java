package test_main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainClass05 {
	public static void main(String[] args) {
		OutputStream os=System.out;
		//생성자의 인자로 outputStream 객체를 전달해서
		//outputStreamWriter 객체 생성하기
		OutputStreamWriter osw=new OutputStreamWriter(os);
		
		try {
			osw.write("abcd 123 한글 출력된다");
			osw.flush();
			//방 5개짜리 char[] 객체 생성
			char[] b=new char[5];
			//각 방에 char type 대입
			b[0]='A';
			b[1]='B';
			b[2]='C';
			b[3]='D';
			b[4]='E';
			System.out.println();
			//char[] 객체를 전달
			osw.write(b);
			//출력하기
			osw.flush();
			System.out.println();
			osw.write(b,0,3); //0번인덱스부터 3번째까지
			osw.flush();
			
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}
