package test.main;

public class MainClass03 {

	public static final int SWORD=0;
	public static final int GUN=1;
	public static final int ARROW=2;
	public static final int FIST=3;
	
	public static void main(String[] args) {
		//무기의 현재 상태값
		int weaponState=GUN;
		
		switch(weaponState) {
		case SWORD:
			System.out.println("칼로공격");
			break;
		case GUN:
			System.out.println("총으로 공격");
			break;
		case ARROW:
			System.out.println("활로 공격");
			break;
		case FIST:
			System.out.println("주먹공격");
			break;
		default:
			System.out.println("무기 없어서 공격 못함");
			break;
	}
	}
}

