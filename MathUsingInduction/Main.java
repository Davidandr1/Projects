package MathUsingInduction;


import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String option = null;
		do {
		option = JOptionPane.showInputDialog("Would you like to solve for a 1.Factorial Calculation, 2.Fibonacci Sequence, 3.Power Function?");
		
		switch(option) {
		
		case "1":
		Factorial fac1 = new Factorial();
		fac1.run();
		break;
		
		case "2":
		Fibonacci fib1 = new Fibonacci();
		fib1.run();
		break;
			
		case "3":
		Power po = new Power();
		po.run();
		break;
		
		default:
			JOptionPane.showMessageDialog(null, "An invalid number was entered. Please try again!");
		}

		option = JOptionPane.showInputDialog("Would you like to do another one?\n(Yes or No)");
		
		}while(option.equalsIgnoreCase("yes"));
	}
}
