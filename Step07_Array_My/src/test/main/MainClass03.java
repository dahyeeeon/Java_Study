package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인메소드시작");
		//String type을 담을 수 있는 방 5개짜리 배열객체 생성해 참조값을 변수에 담기
		//5개 방에는 null이 들어있다.
		String[] names=new String[5];
		names[0]="김구라";
		names[1]="해골";
		names[2]="원숭이";
		
		int size=names.length; //5
	}
}
