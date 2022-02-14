package phase1;
import java.util.regex.Pattern;
import java.util.*;

// Main class

public class Regular_Expression {
	// Main driver method
		public static void main(String args[])
		{

			// Following line prints "true" because the whole
			// text "geeksforgeeks" matches pattern
			// "geeksforge*ks"
			System.out.println(Pattern.matches(
					"geeksforge*ks", "geeksforgeeks"));

			// Following line prints "false" because the whole
			// text "geeksfor" doesn't match pattern "g*geeks*"
			System.out.println(
					Pattern.matches("g*geeks*", "geeksfor"));
		}

}
