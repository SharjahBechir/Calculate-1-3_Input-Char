import java.io.*;
public class Calculate2 {
	public static void main(String[] args) throws IOException {
  		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int sum,product,difference;
		double quotient;

    	System.out.println("Enter first no:");
		int a = Integer.parseInt(br.readLine());
    	System.out.println("Enter second no:");
		int b = Integer.parseInt(br.readLine());

        sum = a+b;
		product = a*b;
		difference = a-b;
		quotient = (double)a/(double)b;

    	System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    	System.out.println("The product of " + a +  " and "  + b +  " is: " + product);
    	System.out.println("The difference of " + a +  " and "  + b +  " is: " + difference);
    	System.out.println("The quotient of " + a +  " and " + b + " is: " + quotient);
    }
}

/*1
 *