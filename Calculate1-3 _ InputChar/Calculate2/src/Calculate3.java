import javax.swing.JOptionPane;
public class Calculate3 {
	public static void main(String[] args) {
		int a,b,sum,product,difference;
		double quotient;

    	a=Integer.parseInt(JOptionPane.showInputDialog("Enter first no:"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Enter second no:"));

        sum = a+b;
		product = a*b;
		difference = a-b;
		quotient = (double)a/(double)b;

    	JOptionPane.showMessageDialog(null,"The sum of " + a + " and " + b + " is: " + sum +
    	"\nThe product of " + a +  " and "  + b +  " is: " + product +
    	"\nThe difference of " + a +  " and "  + b +  " is: " + difference +
    	"\nThe quotient of " + a +  " and " + b + " is: " + quotient);
    }
}
