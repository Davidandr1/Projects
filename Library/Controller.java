package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 
import java.util.ArrayList;

public class Controller {

	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	private TextField userinput;
	@FXML
	private TextField userinput1;
	@FXML
	private TextField userinput2;
	@FXML
	private TextField userinput3;
	@FXML
	private CheckBox myCheckBox;
	@FXML
	private TableColumn txtClm1;
	
	//public ArrayList<String> brand = new ArrayList<String>();
	public ArrayList<String> instruments = new ArrayList<String>();
	//public ArrayList<String> serialNumber = new ArrayList<String>();
	//public ArrayList<String> checkOut = new ArrayList<String>();
	public void addToLib(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("AddToLib.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Adding Instrument");
		stage.show();
	}
	
	public void seeLib(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Library Inventory");
		stage.show();
	}
	
	public void seeAvailableLib(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("AvailableInventory.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Available Instruments");
		stage.show();
	}
	
	public void goBack(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void saveInstrument(ActionEvent event) throws IOException{
		String file = "Library.txt";
		String checkBox;
		FileWriter fileWriter = new FileWriter(file,true);
		String str1 = userinput1.getText();
		String str2 = userinput2.getText();
		String str3 = userinput3.getText();
		if(myCheckBox.isSelected()) { checkBox = "Yes"; }
		else { checkBox="no"; }
		fileWriter.write(str1+"#"+str2+"#"+str3+"#"+checkBox+"\n");
		fileWriter.flush();
		fileWriter.close();
	}
	
	public void showInstruments(ActionEvent event) throws IOException{
		
		File myObj = new File("Library.txt");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
		    instruments.add(data);
		}
		myReader.close();
		System.out.println(instruments);
		
	}
	
	
}
