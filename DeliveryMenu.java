/*@(#)DeliveryMenu.java
 *
 *@Dylan Allen
 *
 *Version 1.0 29/11/16
 */
 
 
 //Necessary API packages for the menu class
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 //Menu class, the main class used as the GUI
 
 public class DeliveryMenu extends JFrame implements ActionListener {
 	int quit;
 	JMenu customerMenu;
 	
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
 		
 		Color c1 = new Color(0xa43d75);
 		Color c2 = new Color(0x671110);
 		
 		JMenuBar DeliverySystem = new JMenuBar();
 		setJMenuBar(DeliverySystem);
 		DeliverySystem.add(customerMenu);
 		DeliverySystem.setBackground(c1);
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
 	}
 		
 		private void createCustomerMenu() {
 			JMenuItem quit;
 			customerMenu = new JMenu("Customer Menu");
 			quit = new JMenuItem("Quit");
 			quit.addActionListener(this);
 			customerMenu.add(quit);
 		}
 }


 
 		