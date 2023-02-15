package UserSignUp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UserLogin extends JFrame {
	private JLabel emailLabel;
    private JTextField emailField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;
    
    public UserLogin() {
    	setTitle("Login Page");
    	setSize(300,150);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(new GridLayout(3,2));
    	
    	emailLabel=new JLabel("Enter your email: ");
    	emailField= new JTextField();
    	passwordLabel=new JLabel("Enter your password: ");
    	passwordField= new JPasswordField();
    	loginButton=new JButton("Login ");
    	
    	loginButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String email=emailField.getText();
				String password=new String(passwordField.getPassword());
				if(checkCredentials(email,password)) {
					JOptionPane.showMessageDialog(null,"Successful");
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter password or email again");
				}
			}
    		
    	});
         add(emailLabel);
         add(emailField);
         add(passwordLabel);
         add(passwordField);
         add(new JLabel());
         add(loginButton);
    	 setVisible(true);
    }
    public boolean checkCredentials(String email,String password) {
    	PasswordCreate obj1=new PasswordCreate();
    	String password2=obj1.getPasswordLogin();
    	SignupEmail obj2=new SignupEmail();
    	String email2=obj2.getEmail();
    	if(email.equals(email2)&&password.equals(password2)) {
    		return true;
    	}else {
    		return false;
    	}
    }
}
