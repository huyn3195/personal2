package UserSignUp;



public class SignupPage {
	public static void main(String[]args) {
		new SignupPage();
		new UserLogin();
	}
	public  SignupPage() {
		SignupEmail email=new SignupEmail();
		email.emailInput();
		
		PasswordCreate password=new PasswordCreate();
		password.PasswordInput();
		 String email1=email.getEmail();
		 String password1=password.getPassword();
		 System.out.println("User email: "+email1);
		 System.out.println("Password: "+password1);	
	}
}
