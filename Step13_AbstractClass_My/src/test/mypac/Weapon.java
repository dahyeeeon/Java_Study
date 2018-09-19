package test.mypac;
/*[추상클래스(abstract Class)]
 * -class 예약어 앞에 abstract 를 명시해서 클래스를 정의
 * -형태만 정의, 실제 구현은 되지 않은 메소드 존재할 수 있음
 * -형태만 정의된 메소드를 만들때는 abstract 예약어를 붙어서 메소드 정의
 * -생성자는 존재하지만 단독으로 객체 생성은 불가
 * -추성 클래스  type의 id가 필요하다면 추상 클래스를 상속 받은 자식 클래스를
 * 정의해서 객체 생성한다
 * -추상클래스를 상속 받은 자식 클래스는 부모의 추상 메소드를 모두
 * 오버라이드(재정의)해야한다.
 * 
 * */
public abstract class Weapon {
	//클래스안에 메서드
	public void prepare(){
		System.out.println("무기 작동을 준비합니다.");	
	}
	//추상메소드
	public abstract void attack();

}
