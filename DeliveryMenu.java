/*@(#)DeliveryMenu.java
 *
 *@Dylan Allen
 *
 *Version 1.0 29/11/16
 */
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 public Class DeliveryMenu extends JFrame, Customers, Inventory implements ActionListener {
 	
 	ArrayList<String> itemNames = new ArrayList();
 	itemNames.add("Carrots");
 	itemNames.add("Jack Daniels");
 	itemNames.add("Potatoes");
 	itemNames.add(")
 	itemNames = item;
 	int quit;
 	JMenu customerMenu;
 	JMenu inventoryMenu;
 	
 	public static void main(String[] args) {
 			DeliveryMeny myMenu = new DeliveryMenu();
 			myMenu.setVisible(true);
 	}
 	
 	public DeliveryMenu(); {
 		Container cPane;
 		setTitle("Allen's Groceries");
 		setSize(400,400);
 		setResizable(true);
 		setLocation(300,300);
 		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
 		cPane = getContentPane();
 		cPane.setLayout(new FlowLayout());
 		
 		createCustomerMenu();
 		createInventoryMenu();
 		
 		Color c1 = new Color(0xa43d75);
 		Color c2 = new Color(0x671110);
 		
 		JMenuBar DeliverySystem = new JMenuBar();
 		setJMenuBar(DeliverySystem);
 		DeliverySystem.add(customerMenu);
 		DeliverySystem.setBackground(c1);
 		DeliverySystem.add(inventoryMenu);
 		DeliverySystem.setBackground(c2);
 	}
 	
 	public void ActionPerformed(ActionEvent event) {
 		String menuName;
 		menuName = event.getActionCommand();
 		
 		if(event.name="Quit"){
 			quit = JOptionPane.showConfirmDialog(null,"Are you sure you want to quit?","Exit Application",JOptionPane.YES_NO_OPTION);
 			if(JOptionPane.YES_OPTION == quit){
 				System.exit(0);
 			}
 		}
 		else if(event.name="Customer Details"){
 			cusName = JOptionPane.showInputDialog("Please enter your name: ");
 			cusGender = JOptionPane.showInputDialog("Please enter your gender(m or f): ");
 			cusID = JOptionPane.showInputDialog("Please assign yourself an ID number(less than 10 numbers): ");
 			if(cusID.length >= 10){
 			cusID = JOptionPane.showInputDialog("Sorry, that number was too long, please try again: ");
 			}
 			cusAddr = JOptionPane.showInputDialog("Please enter your address: ");
 			cusNum = JOptionPane.showInputDialog("Please enter your phone number: ");
 		}
 		else if(event.name="Inventory Details"){
 			
 			
 			Random idGenerator = new Random();
    		for (int i = 1; i <= 10; i++){
      		int id = idGenerator.nextInt(300);
      		itemID = id;
      		
      		Random quantityGenerator = new Random();
    		for (int i = 1; i <= 10; i++){
      		int quantity = quantityGenerator.nextInt(50);
      		
      		long sellbymin = Timestamp.valueOf("2016-12-05").getTime();
			long sellbymax = Timestamp.valueOf("2016-12-15").getTime();
			long difference = sellbymax - sellbymin + 1;
			Timestamp rand = new Timestamp(sellbymin + (long)(Math.random() * difference));
			sellBy = rand;
			
			Random costGenerator = new Random();
    		for (int i = 1; i <= 10; i++){
      		int itemcost = costGenerator.nextDouble(60.00);
      		cost = itemcost;
 		}
 	}
 }