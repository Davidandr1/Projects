package TextEditor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TextHelper {
	
	public TextHelper(){

	}
	public void run() {
	
	}
	public static void addText(StringBuilder newtext, String add) {
		newtext = newtext.append(add);	
		
	}
	public static void removeText(StringBuilder newtext, String remove) {
		char input = remove.charAt(0);
	    int length = newtext.length();

	    for (int i = 0; i < length; i++) {
	        if (newtext.charAt(i) == input) {
	            newtext.deleteCharAt(i);
	            i--;
	            length--;
	        }
	    }
	    newtext = new StringBuilder(newtext);
		
	}
	public static void replaceText(StringBuilder newtext, String input1, String input2) {
		char remove = input1.charAt(0);
	    char replace = input2.charAt(0);

	    int length = newtext.length();
	    for (int i = 0; i < length; i++) {
	        if (newtext.charAt(i) == remove) {
	            newtext.setCharAt(i, replace);
	        }
	    }
	    newtext = new StringBuilder(newtext);

	}
	public static void displayText(StringBuilder newtext) {
		JOptionPane.showMessageDialog(null, "Here is the text: " + newtext);
	}
	public static void reverseText(StringBuilder newtext) {
		newtext.reverse();
	}
	public static void uppercaseText(StringBuilder newtext) {
		String uppercase = newtext.toString();
		uppercase = uppercase.toUpperCase();
		newtext.setLength(0);
		newtext.append(uppercase);
		newtext = new StringBuilder(newtext);
		
		
	}
	public static void lowercaseText(StringBuilder newtext) {
		String lowercase = newtext.toString();
		lowercase = lowercase.toLowerCase();
		newtext.setLength(0);
		newtext.append(lowercase);
		newtext = new StringBuilder(newtext);	
	}
	public static void saveText(StringBuilder newtext) {
		
		File myFile = new File("TextChange.txt");
	    List<String> list = new ArrayList<>();
	    String newlist = newtext.toString();
	    list.add(newlist);

	    try (BufferedWriter output = new BufferedWriter(new FileWriter(myFile))) {
	    	 int size = list.size();
	         for (int i = 0; i < size; i++) {
	        	 output.write(list.get(i) + "\n");
	         }
	         }catch (IOException e) {
	            e.printStackTrace();
	         }
	    }
	public static void showHistory() {
		File myFile = new File("TextChange.txt");
		String aList;
	    StringBuilder newtext = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
		while ((aList = reader.readLine()) != null) {
            newtext.append(aList).append("\n");
        }
        JOptionPane.showMessageDialog(null, "Here is the text history:\n" + newtext.toString());

	    }catch (IOException e) {
	    	  e.printStackTrace();
		}
		
}
}