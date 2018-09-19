package test.mypac;

public class AppleBox {
	//애플 객체를 저장할 멤버필드
 private Apple item;
 //애플 객체를 필드에 저장하는 메소드
 public void push(Apple item) {
	 this.item=item;
 }
 //필드에 저장된 애플객체를 리턴해주는 메소드
 public Apple pull() {
	 return item;
 }
}
