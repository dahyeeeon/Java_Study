package test.main;

import test.mypac.Weapon;

public class MainClass03 {
	public static void main(String[] args) {
		//수열씨를 공격하고 싶다면?
		//Weapon()은 익명의 local inner 클래스
		//이름이 없지만 extends Weapon{}로 추상메소드를 상속받음
		Weapon w1=new Weapon() {
			//추상메소드 오버라이드
			@Override
			public void attack() {
				System.out.println("수열씨 공격하기");
			}
			
		};
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("누군가를 공격해요");
				
			}
		});
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
