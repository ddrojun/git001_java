package com.company.project000;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Seat_view {
	JFrame frame;
	JPanel panel_1, panel_2;
	JButton back; 
	//JButton right_Btn; 
	JButton[] button; 	String[] btnname; JButton[] room; JButton[][] dd;
	JLabel label_1, label_2;
	JTextField textField;
	///
	//Area_view area = new Area_view();	
	//생성자
	Seat_view(){
		//////
		frame = new JFrame("좌석 선택");
		panel_1 = new JPanel(new BorderLayout());
		panel_2 = new JPanel(new BorderLayout());
		back = new JButton("메인화면");
		//right_Btn = new JButton("다음");
		/////////////////////////////////////////////////////////////////////////////
		dd = new JButton[6][7];
		button = new JButton[31]; //버튼 31개
		//////////////////////////////////////////////////////////////////////////
		label_1 = new JLabel();
		label_2 = new JLabel("<html>VIP석 : 170,000원<br/>R석 : 140,000 원<br/>S석 : 110,000원 <br/></html>"
				//+ "A석 : 90,000 원"+ " <br/>B석 : 60,000 원" 
				);
		///////////////////////////////
		frame.add(panel_1);
		frame.add(panel_2);
		frame.setLayout(new GridLayout(2,1));
//		for(int i=0; i<room.length; i++)
//		{ 
//			panel_2.add(room[i]);
//			room[i].setBorder(new EmptyBorder(1,1,1,1));	// 줄사라짐
//			room[i].setBackground(Color.PINK);
//		}
		seat_in();
		//
		for(int i=0; i<6; i++)
		{
			for(int j=0;j<7;j++) {
			panel_2.add(dd[i][j]); }
		}
		panel_2.setLayout(new FlowLayout());
		panel_2.setLayout(new GridLayout(6,7));
		//////////////////////////////////////////////
		panel_1.setLayout(new BorderLayout());
		panel_1.add(label_1, BorderLayout.NORTH);
		label_1.setHorizontalAlignment(0);
		label_1.setFont(new Font("고딕", Font.BOLD, 25));
		panel_1.add(back, BorderLayout.WEST);
		panel_1.add(label_2, BorderLayout.CENTER);
		label_2.setHorizontalAlignment(0);
		label_2.setFont(new Font("고딕", Font.BOLD, 20));
	}
	public void seat_in() {
		for(int i=0; i<6; i++)
		{
			for(int j=0;j<7;j++) 
			{
				if(i==0) 
				{
					dd[i][j]=new JButton("V"+(j+1)); 
					dd[i][j].setBackground(Color.pink);
				}
				else if(i==1) 
				{
					dd[i][j]=new JButton("V"+(j+8)); 
					dd[i][j].setBackground(Color.pink);
				}
				else if(i==2) 
				{
					dd[i][j]=new JButton("R"+(j+15));
					dd[i][j].setBackground(Color.yellow);
				}
				else if(i==3) 
				{
					dd[i][j]=new JButton("R"+(j+22)); 
					dd[i][j].setBackground(Color.yellow);
				}
				else if(i==4) 
				{
					dd[i][j]=new JButton("S"+(j+29));
					dd[i][j].setBackground(Color.LIGHT_GRAY);
				}
				else if(i==5)
				{
					dd[i][j]=new JButton("S"+(j+36)); 
					dd[i][j].setBackground(Color.LIGHT_GRAY);
				}
			}
		}

	}//end seat_in //색상초기화
	//함수
	public void createGui() {
		///////
		frame.setSize(700,400); frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
	}//end createGui
	public static void main(String[] args) {
		new Seat_view().createGui();
	}
	
}//end class






