package test_mypac;
/*[Thread 만들기]
 * 방법2
 * -runnable 인터페이스를 구현한 클래스를 정의
 * -run() 메소드를 오버라이딩한다
 * -만든 클래스를 이용해서 객체 생성
 * -thread 클래스로 객체를 생성하면서 생성자의 인자로 참조값을 전달
 * -생성한 Thread 객체의 start() 메소드를 호출해서 새로운 스레드를 시작
 * 
 * */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("새로운 스레드 시작");
		int count=0;
		while(true) {
			count++;
			System.out.println("count:"+count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
