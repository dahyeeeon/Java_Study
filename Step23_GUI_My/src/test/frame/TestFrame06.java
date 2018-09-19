package test.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFrame06 extends JFrame implements ActionListener{
	//필드
	JTextField tf;
	
	public TestFrame06() {
		//프레임의 레이아웃 설정
		setLayout(new BorderLayout());
		
		
		tf=new JTextField(10);
		JButton sendBtn=new JButton("전송");
		
		//버튼에 리스너 등록
		sendBtn.addActionListener(this);
		
		
		//패널
		JPanel panel=new JPanel();
		panel.add(tf);
		panel.add(sendBtn);
		//패널을 프레임에 배치
		add(panel,BorderLayout.NORTH);
		
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new TestFrame06();
	}
	
	//버튼 누르면 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//입력한 문자열 읽어오기
		String str=tf.getText();
		//알림창에 띄우기
		JOptionPane.showMessageDialog(this,str);
		
	}
}
