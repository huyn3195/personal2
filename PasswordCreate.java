package UserSignUp;

import java.util.Scanner;

import javax.swing.JPasswordField;

public class PasswordCreate {
	private String password;
	private String hiddenPassword;
public void PasswordInput(){
	Scanner scan=new Scanner(System.in);
	System.out.println("Create your password: ");
	password=scan.nextLine();
	String hiddenPassword=password.replaceAll(".", "*");
 }
public String getPassword() {
	return hiddenPassword;
}
public String getPasswordLogin() {
	return password;
}
}
