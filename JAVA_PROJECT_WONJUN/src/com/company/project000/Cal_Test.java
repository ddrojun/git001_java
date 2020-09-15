package com.company.project000;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

class Calendar000 {
	//변수
	JFrame frame;
	JPanel panel_1, panel_2;
	JButton left_Btn; 
	JButton right_Btn; 
	JButton[] button; 	String[] btnname; JButton[] room; JButton[] dd;
	JLabel label_1, label_2;
	JTextField textField;
	//생성자
	Calendar000(){
		frame = new JFrame("예매 달력");
		panel_1 = new JPanel(new BorderLayout());
		panel_2 = new JPanel(new BorderLayout());
		//////////////////////////
		left_Btn = new JButton("◀");
		right_Btn = new JButton("▶");

		
		/////////////////////////////////////////////////////////////////////////////
		dd = new JButton[42];
		button = new JButton[31]; //버튼 31개
		//btnname = new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13",
				//"14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"  }; //버튼 이름
		//for(int i=0; i<button.length; i++)
		//{ button[i] = new JButton( btnname[i] ); }
		room = new JButton[] {new JButton("일"), new JButton("월"), new JButton("화"), new JButton("수"), 
				new JButton("목"),new JButton("금"),new JButton("토"),}; 
		//////////////////////////////////////////////////////////////////////////
		label_1 = new JLabel();
		label_2 = new JLabel();
	}
	//함수
	public void createGui() {
		frame.add(panel_1);
		frame.add(panel_2);
		frame.setLayout(new GridLayout(2,1));
		for(int i=0; i<room.length; i++)
		{ 
			panel_2.add(room[i]);
			room[i].setBorder(new EmptyBorder(1,1,1,1));	//요일 줄사라짐
			room[i].setBackground(Color.PINK);
		}
		for(int i=0; i<dd.length; i++)
		{ dd[i]=new JButton(); }
		for(int i=0; i<dd.length; i++)
		{ panel_2.add(dd[i]); }
		panel_2.setLayout(new FlowLayout());
		panel_2.setLayout(new GridLayout(7,7));
		//////////////////////////////////////////////
		panel_1.setLayout(new BorderLayout());
		panel_1.add(left_Btn, BorderLayout.WEST);
		panel_1.add(right_Btn, BorderLayout.EAST);
		///
		panel_1.add(label_1, BorderLayout.NORTH);
		label_1.setHorizontalAlignment(0);
		//label_1.setText("zzz");
		panel_1.add(label_2, BorderLayout.CENTER);
		label_2.setHorizontalAlignment(0);
		//label_2.setText("asdf");
		
		///////
		frame.setSize(550,400); frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		//////////////////////////////////////////////////////////////
		int year = 0, month = 0, date =0;
		int hap = 0;

		year = Integer.parseInt(JOptionPane.showInputDialog("연도입력"));
		month = Integer.parseInt(JOptionPane.showInputDialog("월 입력"));
		date = Integer.parseInt(JOptionPane.showInputDialog("일 입력"));
		
		for(int i=1; i<year; i++)
		{
			if(i%4==0 && i%100!=0 || i%400==0)
			{ hap+=366;  } //윤년
			else
			{ hap+=365; }
				
		}// year 
		
		int[] mon = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			mon[2] = 29; //윤년일때는 2월달 29일
		}
		for(int i=1; i<month; i++)
		{
			hap +=mon[i];
		}
		//Month
		
		hap+=date;
		System.out.println("총일수 : "+hap); 
		label_1.setText(""+hap);
		//Date

		//요일 -> 1일
		//요일
				// hap-=date
		String[] yoil = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		//System.out.println("서기 1월 1일 : 1day : "+ yoil[1] + " / " + yoil[1%7]);
		//System.out.println("서기 1월 2일 : 2day : "+ yoil[2] + " / " + yoil[2%7]);
		System.out.println(year+"년 "+ month+"월 "+ date+"일");
		System.out.println("오늘 요일 : "+  yoil[hap%7]); //요일 찾기
		System.out.println("이번달 1일 요일 : "+yoil[(hap-date+1)%7]); //1일 요일찾기
		System.out.println("==================================달력========================================");
		
		System.out.println("["+year+"년 "+month+"월]"); 
		//System.out.println("일\t월\t화\t수\t목\t금\t토");
		//int[] mon = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
		int cnt=0;
		for(int i=0; i<yoil.length; i++)
		{
			System.out.print(yoil[i]+"\t");  // 달력 일~월 
			//dd[i].setText(yoil[i]+"\t");
		}
		System.out.println();
		
		for(int i=0; i <(hap-date+1)%7; i++)
		{
			System.out.print("★"+ "\t");
			//room[i].setText("★"+ "\t");
			dd[i].setText("★ ");	  ++cnt;
			
		}
		
		for(int i=1; i<=mon[month]; i++)
		{	
			//System.out.println("zzz");
			dd[cnt].setText(""+i);
			++cnt;
			System.out.print(i+"\t");
			if((hap-date+1+i)%7==0)
			{ 
				System.out.println();
			}

		}
		
	}//end createGui	
}
public class Cal_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calendar000().createGui();
		
	}

}
