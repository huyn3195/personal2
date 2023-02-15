package UserSignUp;

import java.util.Scanner;




public class SignupEmail {
	private String email;
	public void emailInput() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your email");
		email=scan.nextLine();
	}
	public String getEmail() {
		return email;
		
	}
	
	
}
