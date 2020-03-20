import java.util.Scanner;
import java.util.regex.Pattern;
public class InputCharacter {
	public static void main(String[] args) {

    	Pattern pattern = Pattern.compile("");
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a character: ");
    	String values = sc.next();

		if(pattern.matches("[0-9]", values))
		{
			System.out.println(values + " is a digit");
		}
		else if(pattern.matches("[a-zA-Z]", values))
		{
			System.out.println(values + " is a letter");
		}
		else
		{
			System.out.println(values + " is a symbol");
		}
    }
}
