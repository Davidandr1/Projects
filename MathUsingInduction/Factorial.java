package MathUsingInduction;

import javax.swing.JOptionPane;

public class Factorial {

	public Factorial() {
		boolean loop = true;
		int facInt = 0;
		do {
			try {
				loop = false;
				String fac = JOptionPane.showInputDialog("Enter a number to see the Factorial Calculation of that number!");
				facInt = Integer.parseInt(fac);
			}
			catch(Exception e) {
				loop = true;
				JOptionPane.showMessageDialog(null,"A number was not inputed. Please try again!");
			}
		}while(loop == true);
		int num = 1;
		int i = facInt;
		while(i > 1) {
			i--;
			facInt *= (i);
			System.out.println("Factorial #" + num + " is " + facInt);
			num++;
		}
	}
	
	public void run() {
		
	}
}
