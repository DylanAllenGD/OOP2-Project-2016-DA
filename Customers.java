/*@(#)Customers.java
 *
 *@Dylan Allen
 *
 *@Version 1.1 01/12/16
 */
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 public class Customers extends JFrame implements ActionListener {
 	
 	int cusNum;
 	String cusName;
 	int cusID;
 	String cusAddr;
 	int quit;
 	JMenu fileMenu;
 	JMenu customerMenu;
 	
 	public static void main(String[] args) {
 		Customers myMenu = new Customers();
 		myMenu.setVisible(true);
 	}
 	
 	public Customers() {
 		Container cPane;
 		setTitle("Customer Information Panel");
 		setSize(300,300);
 		setResizable(true);
 		setLocation(400,400);
 		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
 		cPane = getContentPane();
 		cPane.setLayout(new FlowLayout());
 		
 		createFileMenu();
 		createCustomerMenu();
 		
 		JMenuBar CustomerInterface = new JMenuBar();
 		setJMenuBar(CustomerInterface);
 		CustomerInterface.add(fileMenu);
 		CustomerInterface.add(customerMenu);
 	}
 	
 	public void actionPerformed(ActionEvent event) {
 		String menuName;
 		menuName = event.getActionCommand();
 		
 		if(menuName.equals("Quit")) {
 		quit = JOptionPane.showConfirmDialog(null,"Are you sure you want to quit?","Exit the program",JOptionPane.YES_NO_OPTION);
 		if(JOptionPane.YES_OPTION == quit) {
 			System.exit(0);
 			}	
 		}
 		else if(menuName.equals("Customer Details")) {
 			cusName = JOptionPane.showInputDialog("Please enter your name: ");
 			cusID = Integer.parseInt(JOptionPane.showInputDialog("Please assign yourself an ID number(less than 10 numbers): "));
 			cusAddr = JOptionPane.showInputDialog("Please enter your address: ");
 			cusNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter your phone number: "));
 			}
 			else if(menuName.equals("Display Details")) {
 			JOptionPane.showMessageDialog(null,"Name: "+cusName+"\nID No.: "+cusID+"\nAddress: "+cusAddr+"\nPhone Number: "+cusNum);
 			}
 		}
 		
 		private void createFileMenu() {
 		JMenuItem quit;
 		fileMenu = new JMenu("File Menu");
 		quit = new JMenuItem("Quit");
 		quit.addActionListener(this);
 		fileMenu.add(quit);
 		}
 		
 		private void createCustomerMenu() {
 		JMenuItem customerDetails;
 		JMenuItem detailsDisplay;
 		customerMenu = new JMenu("Customer Menu");
 		customerDetails = new JMenuItem("Customer Details");
 		customerDetails.addActionListener(this);
 		customerMenu.add(customerDetails);
 		detailsDisplay = new JMenuItem("Display Details");
 		detailsDisplay.addActionListener(this);
 		customerMenu.add(detailsDisplay);
 		}	
 		
 	}