
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static boolean isValidEmail(String email) {
		String regex="^(.+)@(.+)$";
		//intialize the Pattern object
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		return matcher.matches();
	
		
		
	}
	public static void main(String[]args) {
		List<String>emails= new ArrayList<String>();
		//Valid email addresses
		emails.add("rajyam@example.com");
		emails.add("sureshbob@example.com");
		emails.add("rock@example.me.org");
		//invalid email addresses
		emails.add("aman.example.com");
		emails.add("alvida.bob@example.com");
		emails.add("nish@example.com");
		for(String value:emails) {
			System.out.println("The Email address"+value+"is"+(isValidEmail(value)?"valid":"invalid"));
			
			
		}
		System.out.println("Enter any email address to check");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The Email address"+input+"is"+(isValidEmail(input)?"valid":"invalid"));
		
		
		
		
		
		
		
	}

}
