/*@(#)Customers.java
 *
 *@Dylan Allen
 *
 *@Version 1.2 01/12/16
 */

public class Customers extends DeliveryMenu {
private String cusName;
private String cusAddr;
private int cusNum;
private int cusID;	

public Customers() {
	setCusName("Unknown");
	setCusAddr("Unknown");
	setCusNum(0);
	setCusID(0);
}

public Customers (String cusName, String cusAddr, int cusNum, int cusID) {
	setCusName(cusName);
	setCusAddr(cusAddr);
	setCusNum(cusNum);
	setCusID(cusID);
}

public void setCusName(String cusName) {
	this.cusName = cusName;
}

public void setCusAddr(String cusAddr) {
	this.cusAddr = cusAddr;
}

public void setCusNum(int cusNum) {
	this.cusNum = cusNum;
}

public void setCusID(int cusID) {
	this.cusID = cusID;
}

public String getCusName() {
	return cusName;
}

public String getCusAddr() {
	return cusAddr;
}

public int getCusNum() {
	return cusNum;
}

public int getCusID() {
	return cusID;
}

public String toString() {
	return "Customer name: "+getCusName()+"\nCustomer Address: "+getCusAddr()+"\nCustomer Phone Number: "+getCusNum()+"\nCustomer ID Number: "+getCusID();
}
}
