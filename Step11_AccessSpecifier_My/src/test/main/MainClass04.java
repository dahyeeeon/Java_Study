package test.main;

import test.mypac.MemberDao;

public class MainClass04 {
	public static void main(String[] args) {
		//memberdao객체의 참조값을 리턴해주는 메소드 호출
		//참조값을 얻어냄
		MemberDao dao=MemberDao.getInstance();
		
		dao.insert();
		dao.delete();
	}
}
