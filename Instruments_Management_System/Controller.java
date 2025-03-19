package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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

	/**
     * Opens the AddToLib.fxml view.
     *
     * @param event The action event triggering this method.
     * @throws IOException If the FXML file is not found.
     */
	public void addToLib(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("AddToLib.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Adding Instrument");
		stage.show();
	}
	
	/**
     * Opens the Inventory.fxml view to see the complete library.
     *
     * @param event The action event triggering this method.
     * @throws IOException If the FXML file is not found.
     */
	public void seeLib(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Library Inventory");
		stage.show();
	}
	
	 /**
     * Opens the AvailableInventory.fxml view to see available instruments.
     *
     * @param event The action event triggering this method.
     * @throws IOException If the FXML file is not found.
     */
	public void seeAvailableLib(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("AvailableInventory.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Available Instruments");
		stage.show();
	}
	
	/**
     * Returns to the main application screen.
     *
     * @param event The action event triggering this method.
     * @throws IOException If the FXML file is not found.
     */
	public void goBack(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	/**
     * Saves an instrument's details to a file.
     * Ensures that all input fields are filled before writing to the file.
     *
     * @param event The action event triggering this method.
     * @throws IOException If an error occurs during file writing.
     */
	public void saveInstrument(ActionEvent event) throws IOException{
		String file = "Library.txt";
		String checkBox;
		FileWriter fileWriter = new FileWriter(file,true);
		String str1 = userinput1.getText();
		String str2 = userinput2.getText();
		String str3 = userinput3.getText();
		if(myCheckBox.isSelected()) { checkBox = "Yes"; }
		else { checkBox="no"; }
		if(str1.isEmpty()||str2.isEmpty()||str3.isEmpty()) {
			ErrorMessage(event);
		}else {
			fileWriter.write(str1+"#"+str2+"#"+str3+"#"+checkBox+"\n");
			fileWriter.flush();
			fileWriter.close();	
			clearFields();
		}
	}
	
	 /**
     * Reads and displays instruments from the file.
     * The data is stored in a list and printed to the console.
     *
     * @param event The action event triggering this method.
     * @throws IOException If an error occurs while reading the file.
     */
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

	/**
     * Displays an error message if any input field is left blank.
     *
     * @param event The action event triggering this method.
     */
	public void ErrorMessage(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Error Message");
		alert.setHeaderText("Input Error");
		alert.setContentText("One of the inputs have been left blank");
		alert.showAndWait();
	}
	
	/**
     * Clears all input fields in the form.
     */
	public void clearFields() {
		userinput1.setText(null);
		userinput2.setText(null);
		userinput3.setText(null);
	}
	
	
}
