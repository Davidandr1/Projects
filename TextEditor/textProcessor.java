//Runs the menu and gets the character input
import javax.swing.JOptionPane;

public class textProcessor {	
		
	public static void main(String[] args) {
		
		TextHelper trial = new TextHelper();
		trial.run();
		String text = JOptionPane.showInputDialog("Enter a sentence!");
		StringBuilder newtext = new StringBuilder(text);
		String repeat = "yes";
		String option = JOptionPane.showInputDialog("Would you like to do: 1.Add text, 2.Remove certain characters, 3.Replace certain characters, 4.Display current text, 5.Reverse the text, 6.Convert text to uppercase, 7.Convert text to lowercase, 8.Save to history, 9.Display history");
		while(repeat.equalsIgnoreCase("yes")) {
		
		switch(option)
		{
		case "1":
			String add = JOptionPane.showInputDialog("What would you like to add?");
			TextHelper.addText(newtext,add);
			JOptionPane.showMessageDialog(null, "Here is the edited sentence " + newtext);
			break;
		case "2":
			String remove = JOptionPane.showInputDialog("What character would you like to remove?");
			TextHelper.removeText(newtext,remove);
			JOptionPane.showMessageDialog(null, "Here is the edited sentence " + newtext);
			break;
		case "3":
			String input1 = JOptionPane.showInputDialog("What character would you like to remove?");
			String input2 = JOptionPane.showInputDialog("What character would you like to replace it with?");
			TextHelper.replaceText(newtext,input1, input2);
			JOptionPane.showMessageDialog(null, "Here is the edited sentence " + newtext);
			break;
		case "4":
			TextHelper.displayText(newtext);
			break;
		case "5":
			TextHelper.reverseText(newtext);
			JOptionPane.showMessageDialog(null, "Here is the edited sentence " + newtext);
			break;
		case "6":
			TextHelper.uppercaseText(newtext);
			JOptionPane.showMessageDialog(null, "Here is the edited sentence " + newtext);
			break;
		case "7":
			TextHelper.lowercaseText(newtext);
			JOptionPane.showMessageDialog(null, "Here is the edited sentence " + newtext);
			break;
		case "8":
			TextHelper.saveText(newtext);
			break;
		case "9":
			TextHelper.showHistory();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Not a valid number");
		}
		repeat = JOptionPane.showInputDialog("Would you like to edit the text again?");	
		if(repeat.equalsIgnoreCase("yes")) {
			 option = JOptionPane.showInputDialog("Would you like to do: 1.Add text, 2.Remove certain characters, 3.Replace certain characters, 4.Display current text, 5.Reverse the text, 6.Convert text to uppercase, 7.Convert text to lowercase, 8.Save to history, 9.Display history");
		}
		else;

		}
	}
}

