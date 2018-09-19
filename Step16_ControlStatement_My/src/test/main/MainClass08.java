package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		boolean isRun=true;
		int count=0;
		
		//반복문 while
		while(isRun) {
			System.out.println("수행됨!");
			count++;
			if(count==10) { //count가 10이면 isrun을 false로 바꿔서 반복문 탈출
				isRun=false;
			}
			
		}
		System.out.println("메인메소드 종료");
		
	}
}
