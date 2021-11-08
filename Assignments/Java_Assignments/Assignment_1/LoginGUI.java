import java.util.*;
public class LoginGUI {
	public static void main(String args[]) {
		int check = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username ");
		String user_name = sc.nextLine();
		
		System.out.println("Enter Password");
		String Password = sc.nextLine();
		
		System.out.println("Welcome " +user_name);
		
		System.out.println("Enter Login Detail");
		
		System.out.println("Enter username");
		String Login_name = sc.nextLine();
		
		System.out.println("Enter Password");
		String Login_password = sc.nextLine();
		
		while(check<=2) {
			if(!user_name.equals(Login_name) || !Password.equals(Login_password)) {
				System.out.println("Invalid User and Password");
				
				System.out.println("Enter user_Name");
			     Login_name = sc.nextLine();
			     
			     System.out.println("Enter password");
			     Login_password = sc.nextLine();
				
			}else {
				System.out.println("Welcome You are Logged IN");
				break;
			}
			check++;
		}
		if(check>2) {
			System.out.println("Contact Admin");
		}
	}

}
