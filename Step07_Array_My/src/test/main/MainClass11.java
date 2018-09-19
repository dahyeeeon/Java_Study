package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		//1.string 타입을 담을 수 있는 방5개 배열객체 생성
		String[] str=new String[5];
		//2. 배열 5개 방에 각각 다른 문자열 저장
		str[0]="안녕";
		str[1]="지금은";
		str[2]="11시 화요일";
		str[3]="오전입니다";
		str[4]="내일 쉰다!!";
		//3.반복문 for을 이용해 5개 방에 문자열 순서대로 콘솔창에 출력
		for(int i=0;i<str.length;i++) {
			String memo=str[i];
			System.out.println(memo);
		}
	}
}
