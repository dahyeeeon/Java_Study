package test_main;

import test_mypac.MyNavi;
import test_mypac.Navi;

public class MainClass08 {
	public static void main(String[] args) {
		//1.Navi 클래스를 상속받은 클래스를 정의
		//2.그 클래스로 생성한 객체의 참조값을 얻어내서
		//3.아래의 usenavi 메소드를 호출하기
		MyNavi na=new MyNavi();
		MainClass08.useNavi(na);
	
		
	}
	public static void useNavi(Navi navi) {
		navi.findWay();
	}
}
