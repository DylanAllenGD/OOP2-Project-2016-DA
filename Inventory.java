/*Inventory.java
 *
 *
 *#(@)Dylan Allen
 *
 *Version 1.0 23/11/2016
 */
 
 public class Inventory{
 	private String item;
 	private int quantity;
 	private double cost;
 	private int itemID;
 	private String sellBy;
 
 public Inventory() {
	setItem("Unknown");
	setQuantity(0);
	setCost(0.00);
	setItemID(0);
	setSellBy("Unknown");
	}
 
 public Inventory(String item, int quantity, double cost, int itemID, String sellBy) {
 	
 	setItem(item);
 	setQuantity(quantity);
 	setCost(cost);
 	setItemID(itemID);
 	setSellBy(sellBy);
 }
 
 public void setItem(String item){
 	this.item = item;
 }
 
 public void setQuantity(int quantity){
 	this.quantity = quantity;
 }
 
 public void setCost(double cost){
 	this.cost = cost;
 }
 
 public void setItemID(int itemID){
 	this.itemID = itemID;
 }
 
 public void setSellBy(String sellBy){
 	this.sellBy = sellBy;
 }
 
 public String getItem(){
 	return item;
 }
 
 public int getQuantity(){
 	return quantity;
 }
 
 public double getCost(){
 	return cost;
 }
 
 public int getItemID(){
 	return itemID;
 }
 
 public String getSellBy(){
 	return sellBy;
 }
 
 public String toString(){
 	return "Item Name: "+getItem()+"\nItem Quantity: "+getQuantity()+"\nItem Cost: "+getCost()+"\nItem ID Number: "+getItemID()+"\nItem Sell-By Date: "+getSellBy();
 }
 }