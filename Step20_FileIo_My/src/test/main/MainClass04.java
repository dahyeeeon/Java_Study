package test.main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {

		try {
			FileWriter fw=new FileWriter("c:/myFolder/monkey.txt",true);
			fw.write("원숭아\r\n");
			fw.write("당구 한게임 콜?\r\n");
			fw.flush();
			fw.close();
		}catch(IOException ie){
			ie.printStackTrace();
		}
		System.out.println("monkey.txt에 문자열을 기록했습니다");
	}
}
