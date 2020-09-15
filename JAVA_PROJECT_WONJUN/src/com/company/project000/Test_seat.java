package com.company.project000;

import java.util.Scanner;

class Seat_reservation {
	//Chelsea_Control control;
	//
	//Seat_view seat;
//   String[][] seatField = new String[3][12];
	String[] seatField = new String[36];
	
   public Seat_reservation() { // 이차원배열을 좌석으로 이용, 빈자리로 초기화
	   //seat = new Seat_view();
	   ///
       for (int i =0; i <seatField.length; i++) 
       { seatField[i] = "---"; }
   }//end Seat_reservation
   public void reserve() {
      System.out.println("이름을 입력하세요 >>>");
      Scanner scanner = new Scanner(System.in);
      String name = scanner.next();
      int find = 1;
      while (find == 1) {
         if (validName(name)) 
         { // 좌석을 예약한 적이 없다면
            System.out.println("좌석타입을 선택하세요 >>> ");
            System.out.print("1) VIP석 2) R석 3) S석 4) 메인메뉴 \n입력 >>> ");
            scanner = new Scanner(System.in);
            int type = scanner.nextInt();	//자리 종류
            if (type == 1) // VIP석을 선택하였을 때
            { 
               while (true) {
                  try {
                     System.out.println("좌석번호를 선택하세요 >>> ");
//                     System.out.print("[VIP]");
                     for (int i = 0; i <12; i++) 
                     {
                        System.out.println("[VIP]"+ "[" + (i + 1) + "]" +seatField[i]);
                     }
                     System.out.println(" ");
                     scanner = new Scanner(System.in);
                     int seatNum = scanner.nextInt();
                     if (seatField[seatNum - 1] == "---") 
                     {
                        seatField[seatNum - 1] = name;
                        System.out.println("예약이 되었습니다.");
                        find = 0;
                        break;
                     } else 
                     { System.out.println("예약불가능한 자리입니다. 다시 선택하세요."); }
                  } catch (ArrayIndexOutOfBoundsException e) {
                     System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                  }
               }
            } 
            else if (type == 2) 
            {
               while (true)  // R석을 선택하였을 때
               {
                  try {
                     System.out.println("좌석번호를 선택하세요 >>>");
//                     System.out.print("[R]");
                     for(int i = 12; i <24; i++) 
                     {
                        System.out.println("[R]"+ "[" + (i + 1) + "]" + seatField[i]);
                     }
                     scanner = new Scanner(System.in);
                     int seatNum = scanner.nextInt();
                     if (seatField[seatNum - 1] == "---") 
                     {
                        seatField[seatNum - 1] = name;
                        System.out.println("예약이 되었습니다.");
                        find = 0;
                        break;
                     }
                     else 
                     {
                        System.out.println("예약불가능한 자리입니다. 다시 선택하세요.");
                     }
                  } catch (ArrayIndexOutOfBoundsException e) {
                     System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                  }
               }

            } 
            else if (type == 3) 
            { // S석을 선택하였을 때
               while (true) {
                  try {
                     System.out.println("좌석번호를 선택하세요 >>> ");
//                     System.out.print("[S]");
                     for (int i =24; i <36; i++) 
                     {
                        System.out.println("[S]" +"[" + (i + 1) + "]" + seatField[i]);
                     }
                     scanner = new Scanner(System.in);
                     int seatNum = scanner.nextInt();
                     if (seatField[seatNum - 1] == "---")
                     {
                        seatField[seatNum - 1] = name;
                        System.out.println("예약이 되었습니다.");
                        find = 0;
                        break;
                     } 
                     else 
                     {
                        System.out.println("예약불가능한 자리입니다. 다시 선택하세요.");
                     }

                  } catch (ArrayIndexOutOfBoundsException e) {

                     System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                  }
               }
            }
            else if (type == 4)
            { // 메인 메뉴 선택하였을 때
               break;
            }
            else 
            { System.out.println("다시 입력해주세요."); }
         } 
         else 
         { // validName가 false 일 때
            System.out.println("한 번 예약한 적이 있습니다.");
            break;
         }

      }

   }//end 
   public void confirm() { // 조회를 선택하였을 때

      for (int i = 0; i <seatField.length; i++)
      {
         if (i >=0 && i<12) 
         { 
        	 System.out.print("[VIP석]" ); 
        	 System.out.println("[" + (i + 1) + "] " + seatField[i] );
         }
         else if (i >=12 && i<24) 
         { 
        	 System.out.print("[R석]" ); 
        	 System.out.println("[" + (i + 1) + "] " + seatField[i]);
         }
         else if (i >=24 && i<36)
         { 
        	 System.out.print("[S석]"  );
        	 System.out.println("[" + (i + 1) + "] " + seatField[i]);
         }
         
      }  
//         for (int j = 0; j < 10; j++) 
//         { System.out.print("[" + (j + 1) + "] " + seatField[i][j]); }
//         System.out.println(" ");
//      }

   }//end confirm
   public void cancel() { // 취소를 선택하였을 때
      while (true) {
         try {
            System.out.println("취소할 좌석타입을 선택하세요 ");
            System.out.print("1) VIP석 2) R석 3) S석 4) 메인메뉴 \n입력 >>> ");
            Scanner s = new Scanner(System.in);
            int type = s.nextInt();
            if (type == 4)
            { break; }
            else if(type ==1)
            {
                for (int i = 0; i <seatField.length; i++)
                {
                   if (i >=0 && i<12) 
                   { 
                  	 System.out.print("[VIP석]" ); 
                  	 System.out.println("[" + (i + 1) + "] " + seatField[i] );
                   }
                }
            }
            else if(type ==2)
            {
                for (int i = 0; i <seatField.length; i++)
                {
                    if(i >=12 && i<24) 
                    { 
                   	 System.out.print("[R석]" ); 
                   	 System.out.println("[" + (i + 1) + "] " + seatField[i]);
                    }
                }
            }
            else if(type ==3)
            {
                for (int i = 0; i <seatField.length; i++)
                {
                    if (i >=24 && i<36)
                    { 
                   	 System.out.print("[S석]"  );
                   	 System.out.println("[" + (i + 1) + "] " + seatField[i]);
                    }
                }
            }
            System.out.println(" ");
            System.out.println("취소할 좌석번호를 선택하세요 >>> " );
            s = new Scanner(System.in);
            int seatNum = s.nextInt();
            if (seatNum >= 1 && seatNum <= 12)
            {
               if(seatField[seatNum - 1] != "---")
               {
                  seatField[seatNum - 1] = "---";
                  System.out.println("취소됐습니다.");
                  break;
               }
               else 
               {
                  System.out.println("이미 빈 자리 입니다.");
                  continue;
               }
            }
            else 
            { System.out.println("잘못된 입력입니다."); }
            ///////////////////////
            if (seatNum >= 13 && seatNum <= 24)
            {
               if(seatField[seatNum - 1] != "---")
               {
                  seatField[seatNum - 1] = "---";
                  System.out.println("취소됐습니다.");
                  break;
               }
               else 
               {
                  System.out.println("이미 빈 자리 입니다.");
                  continue;
               }
            }
            else 
            { System.out.println("잘못된 입력입니다."); }
            ///////////////
            if (seatNum >= 23 && seatNum <= 36)
            {
               if(seatField[seatNum - 1] != "---")
               {
                  seatField[seatNum - 1] = "---";
                  System.out.println("취소됐습니다.");
                  break;
               }
               else 
               {
                  System.out.println("이미 빈 자리 입니다.");
                  continue;
               }
            }
            else 
            { System.out.println("잘못된 입력입니다."); }
         } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
         }

      }//end while

   }//end cancel
   boolean validName(String name) { // 입력받은 이름으로 예약된 좌석이 있는지 확인

      for (int i = 0; i < seatField.length; i++) 
      {
          if (seatField[i].equals(name)) 
          { return false; }
          else 
          { return true; }
      }
      return true;
   }

}//end class
public class Test_seat {
   
   public static void main(String[] args) {
      Seat_reservation seat = new Seat_reservation();
      int menuNum;
      while (true) {
         System.out.print("1) 예약 2) 조회 3) 취소 4) 종료  \n입력 >>> " );
         Scanner scanner = new Scanner(System.in);
         menuNum = scanner.nextInt();
         if (menuNum == 1 || menuNum == 2 || menuNum == 3) 
         {
            switch (menuNum) 
            {
            case 1:
               seat.reserve();
               break;
            case 2:
               seat.confirm();
               break;
            case 3:
               seat.cancel();
               break;
            }

         } 
         else if (menuNum == 4) 
         {
            System.out.println("종료합니다.");
            System.exit(0);
         } 
         else 
         {
            System.out.println("잘못입력했습니다.");
         }

      }//end while

   }//end main

}//end class