package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//creates grid pane
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(5);
			grid.setVgap(5);
			grid.setPadding(new Insets(10, 10, 10, 10));
			
			//sets scene
			Scene scene = new Scene(grid, 700, 600);
			primaryStage.setScene(scene);
			
			//name of text box
			Label schedule = new Label("Insert Class Schedule:");
			grid.add(schedule, 0, 1);
			
			//Creates text box
			TextArea userTextField = new TextArea();
			grid.add(userTextField, 1, 1);
			
			BorderPane root = new BorderPane();
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
