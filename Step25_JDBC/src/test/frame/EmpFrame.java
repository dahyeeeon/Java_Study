package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.dao.EmpDao;
import test.dao.MemberDao;
import test.dto.EmpDto;
import test.dto.MemberDto;
/*
 *  emp 테이블과 dept 테이블을 이용한 프레임 만들기
 *  
 *  JTable 에 출력할 내용은
 *  
 *  사원번호 | 이름 | 급여 | 부서명 | 입사일 
 *  
 */
public class EmpFrame extends JFrame implements ActionListener{
	//필드
	DefaultTableModel model;
	
	//생성자
	public EmpFrame() {
		
		//레이아웃 법칙을 BorderLayout 으로 설정 
		setLayout(new BorderLayout());
		
		//테이블의 칼럼명
		String[] colNames= {"사원번호","이름", "급여","부서명","입사일"};
		//테이블에 연결할 모델 객체 
		model=new DefaultTableModel(colNames, 0);
		//테이블 객체를 생성하고 
		JTable table=new JTable();
		//모델을 연결하기 
		table.setModel(model);
		
		//테이블을 스크롤 페널에 붙이고 
		JScrollPane scPane=new JScrollPane(table);
		
		//스크롤 페널을 프레임의 가운데에 배치 
		add(scPane, BorderLayout.CENTER);
		
		//페널을 만들고 
		JPanel northPanel=new JPanel();
		//버튼을 만들어서 
		JButton testBtn=new JButton("테스트");
		//페널에 붙이고 
		northPanel.add(testBtn);
		//버튼이 붙은 페널을 프레임의 북쪽에 배치 
		add(northPanel, BorderLayout.NORTH);
		//버튼의 리스너 등록
		testBtn.addActionListener(this);
		
		setBounds(100, 100, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new EmpFrame();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		
		EmpDao dao=EmpDao.getInstance(); //리턴해온 값 전달
		List<EmpDto> list=dao.getList();
		//반복문 돌면서 defaultTableModel 객체에 추가한다
		//테이블 모델 추가하면 JTable에 반영된다.
		for(EmpDto tmp:list) {
			//칼럼 5개의 정보를 담을 수 잇는 object[]객체 생성
			//object type 을 담을 수 있는 배열이기에
			//int,Strimg 등 어떤 type이던지 다 담을 수 잇음
			Object[] data=new Object[5];
			//0~4번방에 각각 사원 정보 넣기
			data[0]=tmp.getEmpno();
			data[1]=tmp.getEname();
			data[2]=tmp.getSal();
			data[3]=tmp.getDname();
			data[4]=tmp.getHiredate();
			//모델에 추가하기
			model.addRow(data);
		}
	}
}





