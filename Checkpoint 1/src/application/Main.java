package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//make gridPaneMain
			GridPane gridPaneMain = new GridPane();
			Scene scene = new Scene(gridPaneMain, 400, 200);
			primaryStage.setTitle("My Schedule");
			gridPaneMain.setPadding(new Insets(10));
			gridPaneMain.setHgap(15);
			gridPaneMain.setVgap(15);
			
			//title for window
			Label wordLabel = new Label("Fall Semester Schedule 2021");
			gridPaneMain.add(wordLabel, 0, 0);
			

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
