package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import com.hello.Design;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Login {

	private static JFrame frame;
	private JPasswordField txtPassword;
	private JTextField txtUsername;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//invokeLater. Causes runnable to have its run method
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//The try statement allows you to define a block of code to be tested for errors while it is being executed.
				try {
					Login window = new Login();
					window.frame.setVisible(true);
					//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Here we create the panel, what color and size to have.
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 204, 204));
		frame.setBounds(200, 200, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//We create a text and set it's properties
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(200, 25, 80, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(70, 120, 66, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(130, 117, 96, 19);
		frame.getContentPane().add(txtPassword);
		//Create a button 
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				// here we check if the password is right
				if(password.contains("123") && username.contains("123")){
					txtPassword.setText(null);	 
					txtUsername.setText(null);	 
					
					//Here we access the oder panel called "Design"
					Design info = new Design();
					Design.main(null);
					Login.frame.setVisible(false);
				}
				// If the password is not correct we will receive an error
				else {
					JOptionPane.showMessageDialog(null, "invalid login","Login error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		// In this part I created the buttons and when I press the button it will do an action for example reset everything
		btnNewButton.setBounds(50, 200, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		//ActionListener is a class that is responsible for handling all action events such as when the user clicks on a component
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnNewButton_1.setBounds(270, 200, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel Username = new JLabel("User:");
		Username.setBounds(70, 70, 45, 13);
		frame.getContentPane().add(Username);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 153, 204));
		separator.setBounds(50, 168, 340, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 153, 204));
		separator_1.setBounds(50, 49, 340, 2);
		frame.getContentPane().add(separator_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(130, 67, 96, 19);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this is used that every time i press the button 1 to write 1 in the textfield
				String EnterNumber = txtUsername.getText() + jbtn1.getText();
				txtUsername.setText(EnterNumber);
			}
		});
		//I created some images and using the code below I implemented them
		jbtn1.setIcon(new ImageIcon(Login.class.getResource("/Login_Sys/1.PNG")));
		jbtn1.setBounds(251, 66, 40, 20);
		frame.getContentPane().add(jbtn1);
		
		
		JButton jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this is used that every time i press the button 2 to write 2 in the textfield
				String EnterNumber = txtUsername.getText() + jbtn2.getText();
				txtUsername.setText(EnterNumber);
				
			}
		});
		jbtn2.setIcon(new ImageIcon(Login.class.getResource("/Login_Sys/2.PNG")));
		jbtn2.setBounds(300, 66, 39, 20);
		frame.getContentPane().add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this is used that every time i press the button 3 to write 3 in the textfield
				String EnterNumber = txtUsername.getText() + jbtn3.getText();
				txtUsername.setText(EnterNumber);
			}
		});
		jbtn3.setIcon(new ImageIcon(Login.class.getResource("/Login_Sys/3.PNG")));
		jbtn3.setBounds(349, 66, 40, 20);
		frame.getContentPane().add(jbtn3);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this is used that every time i press the button 4 to write 4 in the textfield
				String EnterNumber = txtUsername.getText() + jbtn4.getText();
				txtUsername.setText(EnterNumber);
			}
		});
		jbtn4.setIcon(new ImageIcon(Login.class.getResource("/Login_Sys/4.PNG")));
		jbtn4.setBounds(251, 96, 40, 20);
		frame.getContentPane().add(jbtn4);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this is used that every time i press the button 5 to write 5 in the textfield
				String EnterNumber = txtUsername.getText() + jbtn5.getText();
				txtUsername.setText(EnterNumber);
			}
		});
		jbtn5.setIcon(new ImageIcon(Login.class.getResource("/Login_Sys/5.PNG")));
		jbtn5.setBounds(300, 97, 40, 20);
		frame.getContentPane().add(jbtn5);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this is used that every time i press the button 6 to write 6 in the textfield
				String EnterNumber = txtUsername.getText() + jbtn6.getText();
				txtUsername.setText(EnterNumber);
			}
		});
		jbtn6.setIcon(new ImageIcon(Login.class.getResource("/Login_Sys/6.PNG")));
		jbtn6.setBounds(349, 97, 40, 21);
		frame.getContentPane().add(jbtn6);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this is used that every time i press the button 7 to write 7 in the textfield
				String EnterNumber = txtUsername.getText() + jbtn7.getText();
				txtUsername.setText(EnterNumber);
			}
		});
		jbtn7.setIcon(new ImageIcon(Login.class.getResource("/Login_Sys/7.PNG")));
		jbtn7.setBounds(251, 127, 40, 20);
		frame.getContentPane().add(jbtn7);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this is used that every time i press the button 8 to write 8 in the textfield
				String EnterNumber = txtUsername.getText() + jbtn8.getText();
				txtUsername.setText(EnterNumber);
			}
		});
		jbtn8.setIcon(new ImageIcon(Login.class.getResource("/Login_Sys/8.PNG")));
		jbtn8.setBounds(300, 128, 40, 20);
		frame.getContentPane().add(jbtn8);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this is used that every time i press the button 9 to write 9 in the textfield
				String EnterNumber = txtUsername.getText() + jbtn9.getText();
				txtUsername.setText(EnterNumber);
			}
		});
		jbtn9.setIcon(new ImageIcon(Login.class.getResource("/Login_Sys/9.PNG")));
		jbtn9.setBounds(349, 128, 40, 20);
		frame.getContentPane().add(jbtn9);
	}
}
