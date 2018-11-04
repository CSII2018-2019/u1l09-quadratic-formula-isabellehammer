import javax.swing.JOptionPane;

public class U1L09 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		String input;
		
		input = JOptionPane.showInputDialog("for ax^2 + bx + c, enter a: ");
		a = (int) Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("enter b: ");
		b = (int) Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("enter c: ");
		c = (int) Double.parseDouble(input);
		
		double xPlus = (-b + Math.sqrt((b*b)- (4*a*c))/(2*a));
		double xMinus = (-b - Math.sqrt((b*b)-(4*a*c))/(2*a));
		
		JOptionPane.showMessageDialog(null, "A value: " + a + "\nB value:" + b + "\nC value:" + c);
		
	}
	private double XPlus (double a, double b, double c){
	    return ((-b) + Math.sqrt(( b * b) - (4 * a * c))) / (2 * a);
	    System.out.println("square root: " + (((-b) + Math.sqrt(( b * b) - (4 * a * c))) / (2 * a));
	}

	private double XMinus (double a, double b, double c) {
	    return ((-b) - Math.sqrt(( b * b) - (4 * a * c))) / ( 2 * a);
	    System.out.println("square root: " - (((-b) + Math.sqrt(( b * b) - (4 * a * c))) / (2 * a));
	}
	
}