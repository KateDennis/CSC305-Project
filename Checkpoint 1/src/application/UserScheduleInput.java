package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*; 
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font; 

public class UserScheduleInput extends Application{
	@Override
	public void start(Stage primaryStage) {
		try {
			//make gridPaneMain
			GridPane gridPaneMain = new GridPane();
			gridPaneMain.setAlignment(Pos.CENTER);
			Scene scene = new Scene(gridPaneMain, 900, 300);
			primaryStage.setTitle("My Schedule");
			gridPaneMain.setPadding(new Insets(10));
			gridPaneMain.setHgap(15);
			gridPaneMain.setVgap(15);
			
			//title for window
			Label wordLabel = new Label("Arches Semester Data to Calender");
			wordLabel.setFont(new Font("Arial", 20));
			gridPaneMain.add(wordLabel, 0, 0); 
			
			//name of text box 
			Label schedule = new Label("Insert Class Schedule:");
			gridPaneMain.add(schedule, 0, 2);
 
			//Creates text box
			TextArea userTextField = new TextArea();
			gridPaneMain.add(userTextField, 1, 2);
			
			//Creates submit button 
			Button submit = new Button("Submit");
			gridPaneMain.add(submit, 2, 2);
			 
			//Submit Button
			submit.setOnAction(value -> {
				
				//Storing data from class schedule
				String scheduleText = userTextField.getText();
				String[] classSchedule = scheduleText.split("\n");
				SubmitHandler submittedCourseList = new SubmitHandler(classSchedule);
				
				ConflictChecker checkingConflicts = new ConflictChecker(submittedCourseList.getCourseList());
				if (checkingConflicts.getHasConflicts()) {
					Stage conflictStage = new Stage();
					GridPane gridPaneConflicts = new GridPane();
					gridPaneConflicts.setAlignment(Pos.CENTER);
					Scene sceneConflicts = new Scene(gridPaneConflicts, 900, 300);
					conflictStage.setTitle("Conflicts");
					gridPaneConflicts.setPadding(new Insets(10));
					gridPaneConflicts.setHgap(15);
					gridPaneConflicts.setVgap(15);
					
					int count = 0;
					for (String conflict : checkingConflicts.getConflictList()) {
						gridPaneConflicts.add(new Label(conflict), 0, count);
						count++;
						
					sceneConflicts.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					conflictStage.setScene(sceneConflicts);
					conflictStage.show();
					}
				} else {
				
					CalenderGenerator generatedCalender = new CalenderGenerator(primaryStage, submittedCourseList);
					generatedCalender.makeGrid();
					generatedCalender.showStage();
				}
				
				
				//FOR TESTING PURPOSES ONLY
				System.out.println(submittedCourseList.toString());
				
			});
			
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
