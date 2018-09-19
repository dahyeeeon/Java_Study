package test.main;

//public class Radio라 import 가능
import test.mypac.Radio;

public class MainClass01 {
	public static void main(String[] args) {
		//생성자 호출 가능(생성자가 public이라)
		Radio r=new Radio();
		//메소드 호출 가능(메서드도 public)
		r.channelUp();
		//필드 접근 가능(필드도 public int volumn)
		int result=r.volumn;
	}
}
