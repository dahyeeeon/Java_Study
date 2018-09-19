package test.main;
//test.mypac패키지에 있는 myutil 클래스 improt하기
//다른 패키ㅣ지게 있는 calss import 해야 사용가능
import test.mypac.MyUtil;

/*
 *[클래스의 용도]
 *1.static 멤버를 메모리에 올리는 기능
 *2.객체의 설계도 역할
 *3.data type 역할 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드 시작");
		//MyUtil 클래스의 version이라는 필드에 있는 값을
		//참조해서 a라는 이름의 지역변수에 담기
		int a=MyUtil.version;
		System.out.println(a);
		//myUtil 클래스의 clean()메소드 호출하기
		MyUtil.clean();
		
	}

}
