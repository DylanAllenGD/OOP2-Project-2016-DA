/*@(#)Customers.java
 *
 *
 *@Dylan Allen
 *
 *Version 1.0 23/11/2016
 */

public class Customers {
	//attributes(Customer details)
	
	private String cusName;
	private char cusGender;
	private int cusID;
	private String cusAddr;
	private int cusNum;
	

	//no-argument constructor
	public Customers() {
		setCusName("Unknown");
		setCusGender('u');
		setCusID(0);
		setCusAddr("Unknown");
		setCusNum(0);
	}
	
	//three-argument constructor
	public Customers(String cusName, char cusGender, int cusID, String cusAddr, String cusPass, int cusNum) {
		setCusName(cusName);
		setCusGender(cusGender);
		setCusID(cusID);
		setCusAddr(cusAddr);
		setCusNum(cusNum);
	}
	
	//mutator methods
	public void setCusName(String cusName){
		this.cusName = cusName;
	}
	
	public void setCusGender(char cusGender){
		this.cusGender = cusGender;
	}
	
	public void setCusID(int cusID){
		this.cusID = cusID;
	}
	
	public void setCusAddr(String cusAddr){
		this.cusAddr = cusAddr;
	}
	
	public void setCusNum(int cusNum){
		this.cusNum = cusNum;
	}
	
	//accessor methods
	public String getCusName(){
		return cusName;
	}
	
	public char getCusGender(){
		return cusGender;
	}
	
	public int getCusID(){
		return cusID;
	}
	
	public String getCusAddr(){
		return cusAddr;
	}
	
	public int getCusNum(){
		return cusNum;
	}
	
	//toString method for printing
	
	public String toString(){
		return "Customer name: "+getCusName()+"\nCustomer Gender: "+getCusGender()+"\nCustomer ID Number: "+getCusID()+"\nCustomer Address: "+getCusAddr()+"\nCustomer Phone Number: "+getCusNum();
	}
}