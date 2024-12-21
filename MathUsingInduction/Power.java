package MathUsingInduction;
import javax.swing.JOptionPane;
public class Power {

	public Power() {
	boolean loop = true;
	int num1 = 0;
	int pow1 = 0;

	//Loops if the input was not a number
	do {
		try {
		loop = false;
		//Gets user input
		String num = JOptionPane.showInputDialog("What is the number?");
		String pow = JOptionPane.showInputDialog("What is the power of the number?");
		//changes the input to numbers
		num1 = Integer.parseInt(num);
		pow1 = Integer.parseInt(pow);
		}
		//Checks if the input was a number
		catch(Exception e) {
			loop = true;
			JOptionPane.showMessageDialog(null, "A number was not inputed. Please try again!");
		}
	}while(loop == true);
		int sum = num1;
		//Loops till the equation is complete
		while(pow1>1) {
			sum *= num1;
			System.out.println("The sum of power #" + pow1 + " is " + sum);
			pow1--;
		}
		JOptionPane.showMessageDialog(null, "The sum of the power function is " + sum);
	}

	public void run() {
		
	}
}