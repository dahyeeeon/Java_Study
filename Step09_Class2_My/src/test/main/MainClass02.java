package test.main;

import test.mypac.Acorn;

//필드는 참조, 메소드는 호출
public class MainClass02 {
	public static void main(String[] args) {
		//에이콘 클래스를 이용해서 객체를 생성한후 참조값을 변수에 담기
		Acorn a=new Acorn();
		
		//branch필드에 값대입
		a.branch="종로지점";
		a.makeDeveloper();
		
		Acorn b=new Acorn();
		b.branch="강남지점";
		b.makeDeveloper();
		
		
	}

}
