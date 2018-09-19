package test.mypac;
/*
 * [interface]-상속불가, implements로 구현해야함
 * -생성자없다(단독 객체 생성 불가)
 * -구현된 멤버 메소드는 정의할 수 없음(추상 메소드만 가짐)
 * -멤버필드는 static final 멤버 필드만 가짐
 * -data type역할 할 수 있음
 * -인터페이스 타입의 참조값이 필요하면 인터페이스의 구현 클래스를 만들어서
 *  객체를 생성해야한다.
 * */
public interface Remocon {
	//필드
	public static final int VERSION=1;
	public String COMPANY="LG";
	
	//메소드
	public abstract void up();
	public void down();
	
}
