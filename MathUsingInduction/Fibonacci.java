package MathUsingInduction;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
public class Fibonacci {
	
	public Fibonacci(){
		int sum = 0;
		boolean loop = true;
		JFrame frame = new JFrame("Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
		do{
			try {
				loop = false;
				String number1 = JOptionPane.showInputDialog("Enter the number you would like to put into a Fibonacci Sequence");
				sum = Integer.parseInt(number1);
			}
			catch (Exception e) {
				loop = true;
				JOptionPane.showMessageDialog(null, "A number was not inputed. Please try again!");
			}
		}while(loop == true);
		int i = sum;
		int fib = sum;
		int num = 1;
		while(i> 0){	
			sum = sum +(fib-1);
			System.out.println("Sum number " + num + " is " + sum );	
			fib--;
			i--;
			num++;
		} 
	}
	
	public void run(){
	}
}	

