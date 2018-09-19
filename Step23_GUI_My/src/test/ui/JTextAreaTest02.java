package test.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaTest02 extends JFrame implements ActionListener{
	private JTextArea ta;
	//생성자
	public JTextAreaTest02() {
		//여러줄 문자열을 입력할 수 있는 JTextArea 객체
		ta=new JTextArea("Welcom!");
		//위치,크기 정하기
		//ta.setBounds(10,10,300,300);
		//배경색 지정
		ta.setBackground(Color.yellow);
		//프레임에 JTextArea 추가
		//add(ta);
		
		//JScrollPane으로 JTextArea 감싸기
		JScrollPane scPane=new JScrollPane(ta);
		//위치, 크기 정하기
		scPane.setBounds(10,10,300,300);
		//프레임에 추가
		add(scPane);
		
		
		JButton sendBtn=new JButton("전송");
		sendBtn.setBounds(10, 310, 300, 50);
		//버튼에 액션 리스터 등록
		sendBtn.addActionListener(this);
		add(sendBtn);
		
		//레이아웃 매니저 없이 배치하기 위해
		setLayout(null);
		
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		 new JTextAreaTest02();
	}
	//버튼을 눌렀을때 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//JTextArea에 입력한 문자열 읽어와서
		String msg=ta.getText(); //settext는 넣어주는것,gettext는 가져오는것
		//콘솔에 출력하기
		System.out.println(msg);
		
	}
}
