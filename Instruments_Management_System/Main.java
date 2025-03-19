package Library;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


/**
 * The Main class serves as the entry point for the JavaFX application.
 * It initializes and launches the GUI.
 */
public class Main extends Application {

	/**
     * The main method that starts the application.
     * Calls the `launch` method to initiate JavaFX.
     *
     * @param args Command-line arguments passed to the application.
     */
	public static void main(String[] args) {
		launch(args);
	}	
	
	/**
     * Initializes and displays the main application window.
     * Loads the `Main.fxml` file, applies a stylesheet, sets an application icon,
     * and sets the title of the window.
     *
     * @param stage The primary stage for the application.
     */
	@Override
	public void start(Stage stage){
		
		try {
		Parent	root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		Image icon = new Image("books-icon.png");
		stage.getIcons().add(icon);
		stage.setTitle("Library Program");		
		stage.show();
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
