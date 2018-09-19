package test.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFrame07 extends JFrame implements ActionListener{
	JTextField txt1,txt2,txt3;
	JButton btn1,btn2,btn3,btn4;
	JLabel la;
	
	public TestFrame07() {
		//프레임의 레이아웃 설정
		setLayout(new BorderLayout());
		
		txt1=new JTextField(5);
		btn1=new JButton("+");
		btn2=new JButton("-");
		btn3=new JButton("*");
		btn4=new JButton("/");
		txt2=new JTextField(5);
		la=new JLabel("=");
		txt3=new JTextField(5);
		
		btn1.setActionCommand("+");
		btn2.setActionCommand("-");
		btn3.setActionCommand("*");
		btn4.setActionCommand("/");

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		JPanel panel=new JPanel();
		panel.add(txt1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(txt2);
		panel.add(la);
		panel.add(txt3);
		
		add(panel,BorderLayout.CENTER);
		
		setBounds(100,100,500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new TestFrame07();
	}
	
	//버튼 누르면 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {

	try {
		String st=txt1.getText();
		String st2=txt2.getText();
		String command= e.getActionCommand();
		
		Integer a=Integer.parseInt(st);
		Double b=Double.parseDouble(st2);
		double result=0;
	if(command.equals("+")) {
		//txt3.setText(Double.toString(a+b));
		result=a+b;
	}else if(command.equals("-")) {
		//txt3.setText(Double.toString(a-b));
		result=a-b;
	}else if(command.equals("*")) {
		//txt3.setText(Double.toString(a*b));
		result=a*b;
	}else if(command.equals("/")) {
		//txt3.setText(Double.toString(a/b));
		result=a/b;
	}
	txt3.setText(Double.toString(result));
	}catch(Exception exe) {
		exe.printStackTrace();
		JOptionPane.showMessageDialog(this,"숫자형식 확인하세요");
	}
	}
}
