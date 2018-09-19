package test_mypac;

public class MyGun extends Gun{
	
	//자식생성자에서 부모생성자에 필요한 값을 전달받아서
	//부모 생성자에 넘겨줘야한다.
	public MyGun(Bullet bullet) {
		super(bullet);//super()은 부모생성자를 의미
	}
	//부모의 메소드 재정의(오버라이드)
	@Override
	public void fire() {
	
	}

}
