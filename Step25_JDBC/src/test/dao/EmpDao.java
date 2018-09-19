package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.EmpDto;
import test.dto.MemberDto;
import test.util.DBConnect;

public class EmpDao {

	private static EmpDao edao;
//한번 받아오고 널이 아닐때 다음부터 EmpDao dao=EmpDao.getInstance();로 받아올 수 있다.
	
	// 참조값을 리턴해주는 static 멤버 메소드
	public static EmpDao getInstance(){
		if(edao==null){
			edao=new EmpDao(); 
		}

		return edao;
	}

	//사원 목록을 리턴해주는 메소드
	public List<EmpDto> getList(){
			//필요한 지역변수 만들기
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			List<EmpDto> list=new ArrayList<>();
			try {
				conn=new DBConnect().getConn();
				String sql="SELECT empno,ename,sal,dname, TO_CHAR(hiredate, 'YY\" 년 \"MM\" 월 \"DD\" 일 \"') as hire "
						+ "FROM emp,dept WHERE emp.deptno = dept.deptno order by empno asc";
				pstmt=conn.prepareStatement(sql);
				//리스트에 누적시키기
				rs=pstmt.executeQuery();
				while(rs.next()) {
					//커서가 위치한 곳의 회원정보 읽어내기
					int empno=rs.getInt("empno");
					String ename=rs.getString("ename");
					Double sal=rs.getDouble("sal");
					String dname=rs.getString("dname");
					String hiredate=rs.getString("hire");
					
					EmpDto dto=new EmpDto(empno,ename,sal,dname,hiredate);
					//또는 set으로 넣어준다.
					
					//List 에 누적 시키기
					list.add(dto);
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}finally {
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch(Exception e) {}
			}
		return list;
	}

}



