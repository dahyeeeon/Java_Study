package test_main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/*[inputStreamReader]
 * -2byte 처리 스트림(256x256=65536가지 데이터 표현가능)
 * -한글처리가능
 * 
 * */
public class MainClass02 {
	public static void main(String[] args) {
		InputStream is=System.in;
		//키보드와 연결된 inputstream 객체의 참조값을 생성자의 인자로
		//전달하면서 inputstreamreader 객체 생성해서 참조값 변수에 담기.
		InputStreamReader isr=new InputStreamReader(is);
		System.out.println("한글자 입력:");
		try {
			int code=isr.read();
			
			System.out.println("code:"+code);
			char ch=(char)code;
			System.out.println("입력한 글자:"+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
