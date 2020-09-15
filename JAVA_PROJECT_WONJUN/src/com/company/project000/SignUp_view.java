package com.company.project000;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignUp_view {
	//멤버변수
	JFrame frame;
	JButton button, idCheck, back ;
	JLabel title, name, mail, id, pw;
	JTextField text_name, text_mail, text_id, text_pw;
	JPanel panel;
	//생성자
	public SignUp_view() {
		frame = new JFrame("로그인");
		button = new JButton("가입하기"); 
		title = new JLabel("회원가입");
		name = new JLabel("이름");	mail = new JLabel("이메일");	id = new JLabel("아이디");	pw = new JLabel("비밀번호");
		text_name = new JTextField(25);	text_mail = new JTextField(15);	text_id = new JTextField(15);	text_pw = new JTextField(15);
		panel = new JPanel();
		idCheck = new JButton("중복확인");	
		back = new JButton("이전");
	}
	//멤버함수
	public void createGui() {
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
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		//
		frame.add(name);												frame.add(text_name);
		name.setBounds(130,100,100,50);									text_name.setBounds(230,100,200,50);
		name.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));		text_name.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		//
		frame.add(mail);												frame.add(text_mail);
		mail.setBounds(130,185,100,50);									text_mail.setBounds(230,185,200,50);
		mail.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));		text_mail.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
														
		//
		frame.add(id);													frame.add(text_id);
		id.setBounds(130,270,100,50);									text_id.setBounds(230,270,200,50);
		id.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));			text_id.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
											
		
		frame.add(idCheck);
		idCheck.setBounds(450, 270, 130, 40);
		idCheck.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));	
		idCheck.setBackground(Color.LIGHT_GRAY);
		//
		frame.add(pw);													frame.add(text_pw);
		pw.setBounds(130,355,100,50);									text_pw.setBounds(230,355,200,50);
		pw.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));			text_pw.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		
		//
		frame.add(button);
		button.setBounds(180, 450, 230, 80);
		button.setBackground(Color.LIGHT_GRAY);	button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//frame.dispose();
				
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); frame.setSize(600,600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		
	}//end createGui
	
	public static void main(String[] args) {
		new SignUp_view().createGui();
	}
	
	
}//end class





