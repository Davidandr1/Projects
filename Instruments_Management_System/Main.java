package Library;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}	
	
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
