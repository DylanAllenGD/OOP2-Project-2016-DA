/*@(#)DeliveryMenu.java
 *
 *@Dylan Allen
 *
 *Version 1.3 06/12/16
 */
 
 
 //Necessary API packages for the menu class
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 //Menu class, the main class used as the GUI
 
 public class DeliveryMenu extends JFrame implements ActionListener {
 	
 	int idNum = (int)(Math.random() * 1000 + 1);
 	Customers customer = new Customers();
 	Inventory inventory = new Inventory();
 	int quit;
 	JMenu customerMenu;
 	JMenu inventoryMenu;
 	
 	public static void main(String[] args) {
 			DeliveryMenu myMenu = new DeliveryMenu();
 			myMenu.setVisible(true);
 	}
 	
 	public DeliveryMenu() {
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
 	
 	public void actionPerformed(ActionEvent event) {
 		String menuName;
 		menuName = event.getActionCommand();
 		
 		if(menuName.equals("Quit")){
 			quit = JOptionPane.showConfirmDialog(null,"Are you sure you want to quit?","Exit Application",JOptionPane.YES_NO_OPTION);
 			if(JOptionPane.YES_OPTION == quit){
 				System.exit(0);
 	}
 }
 		else if(menuName.equals("Customer Details")){
 			customer.setCusName = JOptionPane.showInputDialog(null,"Please enter your name here: ");
 			customer.setCusAddr = JOptionPane.showInputDialog(null,"Please enter your address here: ");
 			customer.setCusNum = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your phone number here: "));
 			customer.setCusID(rNumber);
 			JOptionPane.showMessageDialog(null,customer.toString());
 			
 		}
 
 	}
 		
 		private void createCustomerMenu() {
 			JMenuItem quit;
 			customerMenu = new JMenu("Customer Menu");
 			quit = new JMenuItem("Quit");
 			quit.addActionListener(this);
 			customerMenu.add(quit);
 		}
 }


 
 		