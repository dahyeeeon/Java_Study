package test.main;
/*[기존 data type의 참조 data type]
 * -때로는 기본 데이터타입을 참조 데이터타입에 포장(wrap)해서 사용
 * -그럴때 사용하는 클래스 Wrapper class
 * 
 * java기본타입:wrapper Class타입
 * byte:Byte
 * short:Short
 * int:Integer
 * long:Long
 * float:Float
 * double:Double
 * boolean:Boolean
 * char:Character
 * */
public class MainClass01 {
	public static void main(String[] args) {
		//기본 데이터 타입
		int num1=10;
		//참조 데이터 타입
		Integer num2=20;
		
		//자유롭게 산술연산 가능
		int result=num1+num2;
		int result2=num1*num2;
		Integer result3=num2/num1;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}
