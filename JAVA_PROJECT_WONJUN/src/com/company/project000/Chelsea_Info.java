package com.company.project000;

public class Chelsea_Info {
	//멤버변수
	public static int cnt =0;
	private String name;
	private String email;
//	private int phoneNumber;	
	private String id,  pass;
	private String seat;
	public static String teamName = "(주)Chelsea Ticket";
	//
	private int price;
	private String box;
	///
	private String date;
	
	
	//getter/setter
	
	public String getSeat() { return seat; }
	public void setSeat(String seat) { this.seat = seat; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public String getPass() { return pass; }
	public void setPass(String pass) { this.pass = pass; }
	//
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	//
	public String getBox() { return box; }
	public void setBox(String box) { this.box = box; }
	//

	//생성자
	public Chelsea_Info(String name, String email, String id, String pass, String seat,
			int price, String box, String date) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
		this.pass = pass;
		this.seat = seat; 
		//
		this.price =price;
		this.box =box;
		//
		this.date= date;
		}
	public Chelsea_Info(String name, String email, String id, String pass, String seat, int price, String box) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
		this.pass = pass;
		this.seat = seat; 
		//
		this.price =price;
		this.box =box;
		//

		}

	public String getDate() { return date; }
	public void setDate(String date) { this.date = date; }

	@Override
	public String toString() {
		return "Chelsea_Info [name=" + name + ", email=" + email + ", id=" + id + ", pass=" + pass + ", seat=" + seat
				+ ", price=" + price + ", box=" + box + ", date=" + date + "]";
	}
	public Chelsea_Info() {  }
	
	
	
	
	
	
	//멤버함수
	
}//end Chelsea_Info class
