package com.company.project000;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;

import javax.swing.JOptionPane;

class Chelsea_Using implements ActionListener{
	//main part
	public static void main(String[] args) {
		Chelsea_Using using = new Chelsea_Using();
		using.start();
 	}//end main
	Calendar today = Calendar.getInstance();
	int year = 0, month = 0, date =0;
	int hap = 0;
	//
	static String temp="";
	//멤버변수
	///////////////////////// MODEL
	///////////////////////// VIEW
	Main_view main;
	Area_view area;
	SignUp_view sign;
	Chelsea_Calendar cal;
	Seat_view seat;
	Login_view login;
	Ticket_view ticket;
	///////////////////////// CONTROL
	Chelsea_Control join_crud_control;
	//생성자
	Chelsea_Using(){
		///view
		main = new Main_view();
		area = new Area_view();
		sign = new SignUp_view();
		main.createGui();
		seat = new Seat_view();
		login = new Login_view();
		//seat.createGui();
		//new Select_view().createGui();
		cal = new Chelsea_Calendar();
		ticket = new Ticket_view();
		///control
		join_crud_control = new Chelsea_Control();
		//view.createGui();	
	}
	public void start() {
		for(int i=0; i<main.button.length; i++) { main.button[i].addActionListener(this); } //예매하기, 예매확인버튼 , 회원가입버튼
		sign.button.addActionListener(this); //회원가입버튼
		sign.back.addActionListener(this);	//회원가입화면, 뒤로가기
		sign.idCheck.addActionListener(this);	//회원가입화면, 중복체크
		area.back.addActionListener(this);	//구역 이전가기
		//for(int i=0; i<area.button.length; i++) { area.button[i].addActionListener(this); }	//구역선택버튼 A,B,C,D
		area.button.addActionListener(this);	//홈구장버튼
		//cal.right_Btn.addActionListener(this);	//달력 다음가기
		//cal.left_Btn.addActionListener(this);	//달력 이전가기
		seat.back.addActionListener(this);	//자리선택 이전가기
//		for(int i=0; i<seat.dd.length; i++) { seat.dd[i].addActionListener(this); } //자리 선택하기
		login.back.addActionListener(this);	//뒤로가기 
		login.button.addActionListener(this);	//로그인버튼
		login.signup.addActionListener(this);	//회원가입으로 가기
		for(int i=0;i<6;i++) 
		{
			for(int j=0 ;j<7;j++) 
			{ seat.dd[i][j].addActionListener(this);  }
		}
		
		login.btn_find_id.addActionListener(this);	//로그인화면 아이디찾기
		login.btn_find_pw.addActionListener(this);	//로그인화면 비번찾기
		ticket.button.addActionListener(this); //티켓출력에서 초기화면으로 가기
	}//end start
	///
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(main.button[0]))	//예약하기
		{ main.frame.dispose(); login.createGui(); }
		else if(e.getSource().equals(main.button[3])) //예약취소
		{
			if(join_crud_control.userChk(join_crud_control.list) != -1)
			{
				
				int res =JOptionPane.showConfirmDialog(null, join_crud_control.list.get(join_crud_control.login_find).getName() +" 님\n "
						+join_crud_control.list.get(join_crud_control.login_find).getDate()+"\n"
						+join_crud_control.list.get(join_crud_control.login_find).getSeat()+" 좌석 티켓을 취소하시겠습니까?" ,"예약취소창",
			    	      JOptionPane.YES_NO_CANCEL_OPTION,
			    	      JOptionPane.PLAIN_MESSAGE 	);
				if(res==0) 
				{
//					HashMap<Chelsea_Info, String> map = new HashMap<Chelsea_Info, String>();
//					//Iterator<Chelsea_Info> iter = join_crud_control.list.iterator();
//					Iterator iter = map.entrySet().iterator();
//					while (iter.hasNext()) {
//						Entry<Chelsea_Info, String> temp1 = (Entry<Chelsea_Info, String>) iter.next();
//						map.remove(temp1.getKey().getSeat());
//						System.out.println("1" + temp1.getKey().getSeat());
//						//Chelsea_Info str = iter.next();
//						//join_crud_control.list.remove(str.getSeat());
//						//System.out.println("1 : "+join_crud_control.list.remove(""+str.getSeat()));
//						//System.out.println("2 : "+join_crud_control.list);
//					}
					
					//Chelsea_Info temp1 = join_crud_control.list.get(join_crud_control.login_find) ;
					join_crud_control.list.remove(join_crud_control.login_find).getSeat();     //이걸로
//					join_crud_control.list.remove(join_crud_control.login_find).getSeat();
					//join_crud_control.list.remove(join_crud_control.info.getSeat());
					//join_crud_control.list.remove(join_crud_control.info.getDate());
					//System.out.println("1: "+(join_crud_control.info.getSeat()));
					//System.out.println("2: "+(join_crud_control.info.getDate()));
					//join_crud_control.reservation_cancel(join_crud_control.list);
					System.out.println("3: "+join_crud_control.list);
					//인덱스번호, new
//					join_crud_control.list.set(4, new Chelsea_Info(name, 
//							email, 
//							id, 
//							pass, 
//							seat, 
//							price, 
//							box, 
//							join_crud_control.list.get(join_crud_control.login_find).setDate(null))
//							
//
//							 );
							
							
							//email, id, pass, seat, price, box))
					//JOptionPane.showMessageDialog(null, "ㅇㄹ");
					//join_crud_control.list.remove(""+temp1.getSeat());
					//System.out.println("1 : " +join_crud_control.list.remove(""+temp1.getSeat()));
					//join_crud_control.list.remove(temp1.getDate());
					//System.out.println("확인1 : " +join_crud_control.list.remove(join_crud_control.login_find).getSeat());
					//join_crud_control.list.remove(""+area.frame.getTitle() );
					//System.out.println("확인1 : "  +area.frame.getTitle());
					//System.out.println("확인2 : "+join_crud_control.list.remove(0).toString());
					//System.out.println("확인2 : "+ join_crud_control.list.remove(join_crud_control.login_find).getDate());
				}
			}
		}
		///
		else if(e.getSource().equals(sign.button))	//회원가입버튼
		{
			if(sign.text_name.getText().trim().length()!=0 && sign.text_mail.getText().trim().length()!=0 && sign.text_id.getText().trim().length()!=0 && sign.text_pw.getText().trim().length()!=0)
			{
				int res = JOptionPane.showConfirmDialog(null, sign.text_name.getText().toString()+" 님 가입하시겠습니까?", "확인창",
			    	      JOptionPane.YES_NO_CANCEL_OPTION,
			    	      JOptionPane.PLAIN_MESSAGE);
			      if(res==0)
			      {
					 Chelsea_Info dto = new Chelsea_Info(sign.text_name.getText(), sign.text_mail.getText(), sign.text_id.getText(), sign.text_pw.getText(),"-",0,"-");
					 join_crud_control.input(sign);
//					 cal.createGui(month);
					 login.text_id.setText(null); login.text_pw.setText(null);
					 sign.frame.dispose(); 
					 login.createGui();
			      }
			      else if(res==1) 
			      { JOptionPane.showMessageDialog(null, "회원정보를 다시입력해주세요"); }
			      else 
			      { JOptionPane.showMessageDialog(null, "취소"); }
			}
			else
			{ JOptionPane.showMessageDialog(null, "회원정보 입력해주세요"); }
		}
		else if(e.getSource().equals(login.button))	//로그인
		{
			if(join_crud_control.userChk_login(login) == -1)
			{
				int res = JOptionPane.showConfirmDialog(null, "회원정보없습니다. \n회원가입하시겠습니까?", "알림창", 
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE	);
				if(res==0)
				{
					login.text_id.setText(null); login.text_pw.setText(null);
					sign.createGui(); login.frame.dispose(); 
				}
			}
			else if(join_crud_control.userChk_login(login) != -1)
			{
				JOptionPane.showMessageDialog(null, "로그인성공");
				login.frame.dispose(); 
				cal.createGui(month);
				for(int i=0; i<cal.dd.length; i++)
				{
					int find =i;
			         cal.dd[find].addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {    
		                int res = JOptionPane.showConfirmDialog(null, find+" 일 예약할거야?"  , "알림창",
		                         JOptionPane.YES_NO_CANCEL_OPTION,
		                         JOptionPane.PLAIN_MESSAGE);
		                   if(res==0)
		                   { 
		                	   cal.frame.dispose();
		                	   area.createGui();
		                	   //
		                	   join_crud_control.list.get(join_crud_control.login_find)
		                	   .setDate(cal.getYear()+"년"+cal.getMonth()+"월"+cal.dd[find].getText()+"일"); //날짜셋팅
		                	   ///////////
		                	   area.frame.setTitle(cal.getYear()+"년"+cal.getMonth()+"월"+cal.dd[find].getText()+"일");
		                	   ///
			               		for(int a=0; a<6; a++)
			            		{
			            			for(int b=0; b<7; b++)
			            			{
			            				if(join_crud_control.reservation(join_crud_control.list) != -1)   // -1 이면 예약가능
			            				{
//			            					seat.dd[a][b].getBackground();
			            					seat.dd[a][b].setBackground(Color.LIGHT_GRAY); seat.dd[0][0].setBackground(Color.lightGray);
			            				}
//			            				seat.dd[a][b].setBackground(null);
			            				
			            			}
			            		}
		                   }
		                   else if(res==1) { JOptionPane.showMessageDialog(null, "아니오"); }
		                   else { JOptionPane.showMessageDialog(null, "취소"); }   //userChk
		            }
		         });
				}
			}
			
		}//end 로그인
		else if(e.getSource().equals(sign.back))	//회원가입 이전가기
		{ main.createGui(); }
		else if(e.getSource().equals(sign.idCheck))	//회원가입 중복체크
		{
			join_crud_control.userChk_1(sign); }	
//		else if(e.getSource().equals(cal.right_Btn))	//달력 다음달
//		{ 
//			cal.createGui_next(month);
//			for(int i=0; i<cal.dd.length; i++)
//			{
//				int find =i;
//		         cal.dd[i].addActionListener(new ActionListener() {
//	            @Override
//	            public void actionPerformed(ActionEvent e) {    
//	                int res = JOptionPane.showConfirmDialog(null, find+" 일 예약할거야?"  , "알림창",
//	                         JOptionPane.YES_NO_CANCEL_OPTION,
//	                         JOptionPane.PLAIN_MESSAGE);
//	                   if(res==0)
//	                   { 
//	                	   JOptionPane.showMessageDialog(null, "네");  
//	                	   area.createGui();
//	                	   cal.frame.dispose();
//	                   }
//	                   else if(res==1) 
//	                   { JOptionPane.showMessageDialog(null, "아니오"); }
//	                   else 
//	                   { JOptionPane.showMessageDialog(null, "취소"); }
//	            }
//	         });
//			}
//		}
//		else if(e.getSource().equals(cal.left_Btn))	//달력 이전버튼
//		{ 
//			cal.createGui_prev(month); 
//			for(int i=0; i<cal.dd.length; i++)
//			{
//				int find =i;
//		         cal.dd[i].addActionListener(new ActionListener() {
//	            @Override
//	            public void actionPerformed(ActionEvent e) {    
//	                int res = JOptionPane.showConfirmDialog(null, find+" 일 예약할거야?"  , "알림창",
//	                         JOptionPane.YES_NO_CANCEL_OPTION,
//	                         JOptionPane.PLAIN_MESSAGE);
//	                   if(res==0)
//	                   { 
//	                	   JOptionPane.showMessageDialog(null, "네");  
//	                	   area.createGui();
//	                	   cal.frame.dispose();
//	                   }
//	                   else if(res==1) 
//	                   { JOptionPane.showMessageDialog(null, "아니오"); }
//	                   else 
//	                   { JOptionPane.showMessageDialog(null, "취소"); }
//	            }
//	         });
//			}
//		}
		//
		else if(e.getSource().equals(area.back))	//구역 이전버튼
		{ area.frame.dispose(); main.createGui();  }
		else if(e.getSource().equals(seat.back))	//자리 이전버튼
		{ seat.frame.dispose();  //area.createGui(); 
			main.createGui();
		}
		else if(e.getSource().equals(main.button[2])) //회원가입
		{ main.frame.dispose(); sign.createGui(); }
		else if(e.getSource().equals(login.back))	//뒤로가기
		{ login.frame.dispose();  main.createGui(); }
		else if(e.getSource().equals(login.signup))	//회원가입화면
		{ login.frame.dispose();  sign.createGui(); }
		else if(e.getSource().equals(main.button[1]))	// 예매확인
		{
			//join_crud_control.userChk();
			if(join_crud_control.userChk(join_crud_control.list) != -1)
			{
				Calendar today = Calendar.getInstance();
				String folderpath = today.get(1) +"-" + (today.get(2) +1) +"-" +today.get(5) +"_" +"file";	
				String filepath = "Ticket_"+join_crud_control.list.get(join_crud_control.userChk).getName()+".txt";
				System.out.println(filepath);
				File folder = new File("D:\\"+folderpath);
				File file = new File("D:\\"+folderpath+"\\"+filepath);
				if(!(folder.exists())) { folder.mkdir(); }
				try {
					file.createNewFile();
				} catch (Exception e1) {
					e1.getStackTrace();
				}
				Path input = Paths.get("D:\\"+folderpath +"\\"+ filepath);
				try {
					BufferedReader reader = Files.newBufferedReader(input, StandardCharsets.UTF_8);
					for(;;)
					{
						String readline = reader.readLine();
						if(readline==null)
						{ break; }
						System.out.println(readline);
						ticket.textArea.setText(readline+"\n");
						ticket.creategui();
						
					}
					//
					reader.close();
				} catch (Exception e2) {
					e2.getStackTrace();
				}
			}

		}
		else if(e.getSource().equals(ticket.button))
		{ main.createGui(); ticket.frame.dispose(); seat.frame.dispose(); ticket.textArea.setText(null); } //티켓화면 
		///////////////////////////////
		else if(e.getSource().equals(login.btn_find_id))	//아이디 찾기
		{
			if(join_crud_control.findIdChk(join_crud_control.list) != -1)
			{ JOptionPane.showMessageDialog(null, "회원님의 아이디는 : "+join_crud_control.list.get(join_crud_control.findId).getId()); }
		}
		else if(e.getSource().equals(login.btn_find_pw))// 비밀번호 찾기
		{
			if(join_crud_control.findPwChk(join_crud_control.list) != -1)
			{
				JOptionPane.showMessageDialog(null, "회원님의 비밀번호는 : " +join_crud_control.list.get(join_crud_control.findPw).getPass());
			}
		}
		if(e.getSource().equals(area.button))
		{
			//JOptionPane.showMessageDialog(null, "예약불가능 자리는 " +ticket.textArea.getText());
			////
		    int res = JOptionPane.showConfirmDialog(null, "선택하신 구장이 "+area.button.getText()+" 이 맞습니까?", "확인창",
		    	      JOptionPane.YES_NO_CANCEL_OPTION,
		    	      JOptionPane.PLAIN_MESSAGE);
    	      if(res==0)
    	      { 
    	    	  area.frame.dispose();
    	    	  seat.createGui(); 
//    	    	  join_crud_control.list.get(join_crud_control.userChk)
    	    	  join_crud_control.list.get(join_crud_control.login_find).setBox(area.button.getText());
    	    	  
//    	    	  seat.label_1.setText(area.button[i].getText());  
    	      }
    	      else if(res==1) 
    	      { JOptionPane.showMessageDialog(null, "아니오"); }
    	      else 
    	      { JOptionPane.showMessageDialog(null, "취소"); }
    	      
		}
		boolean[][] reserChk = new boolean[6][7];
		///////////////////////////////////////
		//frame.setTitle();
		
		for(int i=0; i<6; i++)
		{
			for(int j=0;j<7;j++)
			{
				if(e.getSource().equals(seat.dd[i][j]))
				{	
					System.out.println("예약가능여부  : " + join_crud_control.reservation(join_crud_control.list));
					temp=seat.dd[i][j].getText();
					if(join_crud_control.reservation(join_crud_control.list) == -1 ) //&& seat.dd[i][j].getBackground()!=Color.green
					{
						//1. view초기화
						//seat.seat_in();
						//2. 해당날짜에 색상입히기 
						join_crud_control.list.get(date);
						//System.out.println("ddddd :" +join_crud_control.list.get(date));
						int temp=JOptionPane.showConfirmDialog(null,Chelsea_Using.temp+"의 좌석을 예약하시겠습니까?");
						if(temp==0)
						{
							JOptionPane.showMessageDialog(null,Chelsea_Using.temp+"의 좌석이 예약되었습니다.");
							seat.dd[i][j].setBackground(Color.green); //자리선택하고 예약하면 초록색으로 변화줌
							Calendar today = Calendar.getInstance();
							String folderpath = today.get(1) +"-" + (today.get(2) +1) +"-" +today.get(5) +"_" +"file";	//오늘날짜 폴더만들기
							String filepath = "Ticket_"+join_crud_control.list.get(join_crud_control.login_find).getName() +".txt";
							/////////////////////
							File folder = new File("D:\\"+folderpath);	//폴더만들기
							if( !(folder.exists() )) { folder.mkdir(); }
							File file = new File("D:\\"+folderpath +"\\" +filepath); //파일만들기
							try {
								file.createNewFile();
							} catch (Exception e2) {
								e2.printStackTrace();
							}
							Path output = Paths.get("D:\\"+folderpath +"\\" +filepath); //폴더+파일경로
							try {
								BufferedWriter writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8); //output경로에 써줄거다
								writer.write(" 회원명 : " +join_crud_control.list.get(join_crud_control.login_find).getName()+"  ||"); 		//writer.newLine(); //띄어쓰기
								writer.write(" 구장 : "+join_crud_control.list.get(join_crud_control.login_find).getBox()+"  ||");			//writer.newLine();
								writer.write(" 좌석위치 : " +Chelsea_Using.temp+"  ||");				//writer.newLine();
								writer.write(" 가격 : " +join_crud_control.list.get(join_crud_control.login_find).getPrice()+"  ||");			//writer.newLine();
								writer.write("예약날짜 : " +join_crud_control.list.get(join_crud_control.login_find).getDate() );
								//펜뚜껑 닫기//
								writer.close(); 
//								JOptionPane.showMessageDialog(null, "파일쓰기성공");
							} catch (Exception e1) {
								e1.printStackTrace();
//								JOptionPane.showMessageDialog(null, "파일쓰기오류");
							}
							///
							//reserChk[i][j] = true;
							
						}
					}
					else if(join_crud_control.reservation(join_crud_control.list) != -1)
					{ JOptionPane.showMessageDialog(null, "예약불가"); }
				}//end if

			}//end j
		}//end i
		

	}//end actionPerformed
	
		
}//end Chelsea_Using class






