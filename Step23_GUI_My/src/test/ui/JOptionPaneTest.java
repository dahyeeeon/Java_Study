package test.ui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionPaneTest extends JFrame implements ActionListener{
	//생성자
	public JOptionPaneTest() {
		//버튼 객체 생성
		JButton alertBtn=new JButton("알림버튼");
		JButton inputBtn=new JButton("입력버튼");
		JButton confirmBtn=new JButton("확인버튼");
		
		//버튼의 액션명 지정
		alertBtn.setActionCommand("alert");
		inputBtn.setActionCommand("input");
		confirmBtn.setActionCommand("confirm");
		
		//버튼의 리스너 등록
		alertBtn.addActionListener(this);
		inputBtn.addActionListener(this);
		confirmBtn.addActionListener(this);
		
		//패널을 만들어서
		JPanel panel=new JPanel();
		//패널에 버튼 추가
		panel.add(alertBtn);
		panel.add(inputBtn);
		panel.add(confirmBtn);
		
		//프레임에 패널 추가
		this.add(panel);
		
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JOptionPaneTest();
	}
	//버튼을 누르면 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.equals("alert")) {
			JOptionPane.showMessageDialog(this,"알림!!");
		}else if(command.equals("input")) {
			String msg=JOptionPane.showInputDialog(this,"이름 입력!!");
			System.out.println(msg);

		}else if(command.equals("confirm")) {
			int which=JOptionPane.showConfirmDialog(this,"삭제할까?");
			switch(which) {
			case JOptionPane.YES_OPTION: //0
				System.out.println("yes");
				break;
			case JOptionPane.NO_OPTION: //1
				System.out.println("no");
				break;
			case JOptionPane.CANCEL_OPTION: //2
				System.out.println("cancel");
				break;
			}
		}
	}
}
