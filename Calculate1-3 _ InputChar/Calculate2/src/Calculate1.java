import java.util.Scanner;
public class Calculate1{
	public static void main(String[] args)	{
		Scanner sc = new Scanner (System.in);
		int a,b,sum,product,difference;
		double quotient;

    	System.out.println("Enter first no:");
		a=sc.nextInt();
    	System.out.println("Enter second no:");
		b=sc.nextInt();

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

/*6 variables
 *to use it in system.out.println for the calculation
 *