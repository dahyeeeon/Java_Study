package test.mypac;
/*Remocon 인터페이스를 implements 한 클래스 정의
 * -인터페이스에 정의된 모든 추상 메소드를 오버라이드 해야한다.
 * */
public class MyRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("볼륨업");
	}

	@Override
	public void down() {
		System.out.println("볼륨다운");
		
	}

}
