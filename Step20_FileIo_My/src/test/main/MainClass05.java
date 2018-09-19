package test.main;

import java.io.FileReader;
import java.io.IOException;

public class MainClass05 {
	public static void main(String[] args) {
		try {
			//file 에서 문자열 읽어들일 FileReader 객체 생성
			FileReader fr=new FileReader("c:/myFolder/gura.txt");
			//한번에 5자 담을 수 있는 char[] 객체 생성
			char[] buffer=new char[10];
			//char[]을 전달해서 읽어들이기
			fr.read(buffer);
			//배열에 있는 모든 내용 출력하기
			for(char tmp:buffer) {
				System.out.print(tmp);
			}
			//마무리 작업
			fr.close();
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}
