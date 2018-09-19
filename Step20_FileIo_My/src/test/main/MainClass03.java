package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*텍스트 파일에 문자열 출력하는 예제
 * */
public class MainClass03 {
	public static void main(String[] args) {
		File file1=new File("c:/myFolder/gura.txt");
	
			//파일객체를 생성자의 인자로 전달해서 filewriter 객체 생성하기
	
		try {
			FileWriter fw = new FileWriter(file1);
			fw.write("안녕\r\n");
			fw.write("나야나\r\n");
			fw.write("놀자\r\n");
			fw.write("놀자\r\n");
			fw.flush();
			fw.close(); //모두 기록했으면 닫아줘야한다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("파일에 문자열을 저장했습니다.");
		
	}
}
