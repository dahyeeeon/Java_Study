package test_mypac;

public class Gun {
	//필드
	public Bullet bullet;
	
	//총 발사 메소드
	public void fire() {
		if(this.bullet==null) {
			System.out.println("bullet 객체가 없어요");
			return;
		}
		System.out.println("빵~!!");
	}
	//생성자
	public Gun(Bullet bullet) {
		this.bullet=bullet;
	}
}
