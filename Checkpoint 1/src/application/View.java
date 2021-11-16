package application;

import java.awt.Rectangle;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;  

public class View extends Application {
	
	private Stage primaryStage;
	
	public View(Stage primaryStage, SubmitHandler courseList) {
		
		//make gridPaneMain
		GridPane gridPaneMain = new GridPane();
		gridPaneMain.setAlignment(Pos.CENTER);
		Scene scene = new Scene(gridPaneMain, 900, 300);
		this.primaryStage = primaryStage;
		primaryStage.setTitle("My Schedule");
		gridPaneMain.setPadding(new Insets(10));
		gridPaneMain.setHgap(15);
		gridPaneMain.setVgap(15);
		
		//TimeLabel along side of gridPaneMain
		Label TimeLabel8am = new Label("8 am");
		Label TimeLabel9am = new Label("9 am");
		Label TimeLabel10am = new Label("10 am");
		Label TimeLabel11am = new Label("11 am");
		Label TimeLabel12pm = new Label("12 noon");
		Label TimeLabel1pm = new Label("1 pm");
		Label TimeLabel2pm = new Label("2 pm");
		Label TimeLabel3pm = new Label("3 pm");
		Label TimeLabel4pm = new Label("4 pm");
		Label TimeLabel5pm = new Label("5 pm");
		
		gridPaneMain.add(TimeLabel8am,0,1);
		gridPaneMain.add(TimeLabel9am,0,2);
		gridPaneMain.add(TimeLabel10am,0,3);
		gridPaneMain.add(TimeLabel11am,0,4);
		gridPaneMain.add(TimeLabel12pm,0,5);
		gridPaneMain.add(TimeLabel1pm,0,6);
		gridPaneMain.add(TimeLabel2pm,0,7);
		gridPaneMain.add(TimeLabel3pm,0,8);
		gridPaneMain.add(TimeLabel4pm,0,9);
		gridPaneMain.add(TimeLabel5pm,0,10);
		
		Label mon = new Label("Monday");
		Label tue = new Label("Tuesday");
		Label wed = new Label("Wednesday");
		Label thu = new Label("Thursday");
		Label fri = new Label("Friday");
		
		gridPaneMain.add(mon,1,0);
		gridPaneMain.add(tue,2,0);
		gridPaneMain.add(wed,3,0);
		gridPaneMain.add(thu,4,0);
		gridPaneMain.add(fri,5,0);
		
	

		String weekday = "Monday";
		//if(weekday == "Monday") {
	        // set title for the stage
	        stage.setTitle("creating Rectangle");
	 
	        // create a rectangle
	        Rectangle rectangle = new Rectangle(100.0d, 100.0d, 120.0d, 80.0d);
	 
	        // create a Group
	        Group group = new Group(rectangle);
	 
	        // create a scene
	        Scene scene = new Scene(group, 500, 300);
	 
	        
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
	    }
		//}
	
	public void showStage() {
		primaryStage.show();
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
 }
	