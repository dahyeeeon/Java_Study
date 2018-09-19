package test.mypac;

public class AttackUnit {
	
	//static이 붙지 않은것은 new AttackUnit()으로
	//non static 멤버필드
	public int energy=100;
	
	//non static 멤버 메소드
	public void attack() {
		System.out.println("공격하기");
	}
	
	//방어하는 메소드
	public void defence() {
		System.out.println("방어해요");
	}
	//움직이는 메소드
	public void move() {
		System.out.println("움직여요");
	}
}
