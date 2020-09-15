package com.company.project000;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login_view {
	//변수
	JFrame frame;
	JButton button, signup, back, next, btn_find_id, btn_find_pw;
	JLabel title, label, id, pw, find_id, find_pw;
	JTextField text_id, text_pw;
	JPanel panel;
	//생성자
	public Login_view() {
		frame = new JFrame("로그인");
		button = new JButton("LOGIN"); 
		signup = new JButton("회원가입");	
		back = new JButton("이전");
		//
		btn_find_id = new JButton("아이디찾기 ");
		btn_find_pw = new JButton("비밀번호 찾기");
		find_id = new JLabel("아이디 찾기 → ");	find_pw = new JLabel("비밀번호 찾기 → ");
		title = new JLabel("로그인");
		label = new JLabel("회원가입 안하셨다면 →  ");	id = new JLabel("아이디"); pw = new JLabel("비밀번호");
		text_id = new JTextField(15);	text_pw = new JTextField(15);
		panel = new JPanel();
		/////////////////////
		frame.setLayout(null);
		frame.add(title);
		title.setFont(new Font("고딕", Font.BOLD, 30));
		title.setBounds(230, 20, 300, 50);
		frame.setBackground(Color.LIGHT_GRAY);
		//
		frame.add(back);
		back.setBounds(30, 20, 100, 50);
		back.setBackground(Color.LIGHT_GRAY);
		back.setFont(new Font("고딕", Font.BOLD, 15));
		//

		//
		frame.add(id);													frame.add(text_id);
		id.setBounds(130,120,100,50);									text_id.setBounds(230,120,200,50);
		id.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));			text_id.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		//
		frame.add(pw);													frame.add(text_pw);
		pw.setBounds(130,190,100,50);									text_pw.setBounds(230,190,200,50);
		pw.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));			text_pw.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		//
		frame.add(button);
		button.setBounds(210, 270, 150, 50);
		button.setBackground(Color.LIGHT_GRAY);	button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		///
		frame.add(label);
		label.setBounds(120, 340, 350, 50);
		label.setBackground(Color.LIGHT_GRAY);
		label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		//
		frame.add(signup);
		signup.setBounds(350, 340, 160, 40);
		signup.setBackground(Color.LIGHT_GRAY);
		signup.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		/////////
		frame.add(find_id);
		find_id.setBounds(120, 400, 350, 50);
		find_id.setBackground(Color.LIGHT_GRAY);
		find_id.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		//
		frame.add(btn_find_id);
		btn_find_id.setBounds(350, 400, 160, 40);
		btn_find_id.setBackground(Color.LIGHT_GRAY);
		btn_find_id.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		////
		frame.add(find_pw);
		find_pw.setBounds(120, 460, 350, 50);
		find_pw.setBackground(Color.LIGHT_GRAY);
		find_pw.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		//
		frame.add(btn_find_pw);
		btn_find_pw.setBounds(350, 460, 160, 40);
		btn_find_pw.setBackground(Color.LIGHT_GRAY);
		btn_find_pw.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

	}
			
	//멤버함수
	public void createGui() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); frame.setSize(580,550);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

	}//end createGui
//	public static void main(String[] args) {
//		new Login_view().createGui();
//	}//end main
	
}//end class

	








