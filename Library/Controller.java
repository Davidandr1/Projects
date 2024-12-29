package Library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class Controller {

	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void addToLib(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("AddToLib.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void seeLib(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void seeAvailableLib(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("AvailableInventory.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
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
		//Save Instruments to a file
	}
	
}
