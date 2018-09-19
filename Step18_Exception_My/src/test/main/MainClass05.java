package test.main;
/*[Exception 종류]
 * 1.Checked Exception
 * -RuntimeException 클래스를 상속받지 않은 예외처리 타입
 * -반드시 try~catch 블럭으로 처리하거나 혹은 throws 해야함
 * 
 * 2.Unchecked Exception
 * -RuntimeException 클래스를 상속 받은 예외타입
 * -try~catch블럭으로 처리하지 않아도 컴파일 오류는 발생하지
 * 않으므로 필요시 선택적으로 처리
 * 
 * */
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드시작");
		
		//thread 클래스의 static 메소드 호출
		try {
			//실행의 흐름(스레드)을 5초동안 잡아두기
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main 메소드 종료");
	}
}
