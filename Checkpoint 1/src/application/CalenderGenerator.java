package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class CalenderGenerator extends Application {
	@Override
	public void start(Stage primaryStage)
    {
		Group root = new Group();
		Scene scene = new Scene(root, 851, 826);
		Stage stage = new Stage();
		
		Text mondayText = new Text();
		mondayText.setText("Monday");
		mondayText.setX(150); mondayText.setY(50);
		root.getChildren().add(mondayText);
		
		Text tuesdayText = new Text();
		tuesdayText.setText("Tuesday");
		tuesdayText.setX(300); tuesdayText.setY(50);
		root.getChildren().add(tuesdayText);
		
		Text wednesdayText = new Text();
		wednesdayText.setText("Wednesday");
		wednesdayText.setX(450); wednesdayText.setY(50);
		root.getChildren().add(wednesdayText);
		
		Text thursdayText = new Text();
		thursdayText.setText("Thursday");
		thursdayText.setX(600); thursdayText.setY(50);
		root.getChildren().add(thursdayText);
		
		Text fridayText = new Text();
		fridayText.setText("Friday");
		fridayText.setX(750); fridayText.setY(50);
		root.getChildren().add(fridayText);
		
		Text time1 = new Text();
		time1.setText("8am");
		time1.setX(50); time1.setY(100);
		root.getChildren().add(time1);
		
		Text time2 = new Text();
		time2.setText("9am");
		time2.setX(50); time2.setY(175);
		root.getChildren().add(time2);
		
		Text time3 = new Text();
		time3.setText("10am");
		time3.setX(50); time3.setY(250);
		root.getChildren().add(time3);
		
		Text time4 = new Text();
		time4.setText("11am");
		time4.setX(50); time4.setY(325);
		root.getChildren().add(time4);
		
		Text time5 = new Text();
		time5.setText("12pm");
		time5.setX(50); time5.setY(400);
		root.getChildren().add(time5);
		
		Text time6 = new Text();
		time6.setText("1pm");
		time6.setX(50); time6.setY(475);
		root.getChildren().add(time6);
		
		Text time7 = new Text();
		time7.setText("2pm");
		time7.setX(50); time7.setY(550);
		root.getChildren().add(time7);
		
		Text time8 = new Text();
		time8.setText("3pm");
		time8.setX(50); time8.setY(625);
		root.getChildren().add(time8);
		
		Text time9 = new Text();
		time9.setText("4pm");
		time9.setX(50); time9.setY(700);
		root.getChildren().add(time9);
		
		Text time10 = new Text();
		time10.setText("5pm");
		time10.setX(50); time10.setY(775);
		root.getChildren().add(time10);
		
		Line line1 = new Line();
		line1.setStartX(100);line1.setStartY(0);
		line1.setEndX(100);line1.setEndY(875);
		root.getChildren().add(line1);
		
		Line line2 = new Line();
		line2.setStartX(250);line2.setStartY(0);
		line2.setEndX(250);line2.setEndY(875);
		root.getChildren().add(line2);
		
		Line line3 = new Line();
		line3.setStartX(400);line3.setStartY(0);
		line3.setEndX(400);line3.setEndY(875);
		root.getChildren().add(line3);
		
		Line line4 = new Line();
		line4.setStartX(550);line4.setStartY(0);
		line4.setEndX(550);line4.setEndY(875);
		root.getChildren().add(line4);
		
		Line line5 = new Line();
		line5.setStartX(700);line5.setStartY(0);
		line5.setEndX(700);line5.setEndY(875);
		root.getChildren().add(line5);
		
		Line lastline = new Line();
		lastline.setStartX(850);lastline.setStartY(0);
		lastline.setEndX(850);lastline.setEndY(875);
		root.getChildren().add(lastline);
		
		
		
		
		//starting 8pm lines
		Line line6 = new Line();
		line6.setStartX(0);line6.setStartY(75);
		line6.setEndX(1000);line6.setEndY(75);
		root.getChildren().add(line6);
		
		Line line7 = new Line();
		line7.setStartX(0);line7.setStartY(150);
		line7.setEndX(1000);line7.setEndY(150);
		root.getChildren().add(line7);
		
		Line line8 = new Line();
		line8.setStartX(0);line8.setStartY(225);
		line8.setEndX(1000);line8.setEndY(225);
		root.getChildren().add(line8);
		
		Line line9 = new Line();
		line9.setStartX(0);line9.setStartY(300);
		line9.setEndX(1000);line9.setEndY(300);
		root.getChildren().add(line9);
		
		Line line10 = new Line();
		line10.setStartX(0);line10.setStartY(375);
		line10.setEndX(1000);line10.setEndY(375);
		root.getChildren().add(line10);
		
		Line line11 = new Line();
		line11.setStartX(0);line11.setStartY(450);
		line11.setEndX(1000);line11.setEndY(450);
		root.getChildren().add(line11);
		
		Line line12 = new Line();
		line12.setStartX(0);line12.setStartY(525);
		line12.setEndX(1000);line12.setEndY(525);
		root.getChildren().add(line12);
		
		Line line13 = new Line();
		line13.setStartX(0);line13.setStartY(600);
		line13.setEndX(1000);line13.setEndY(600);
		root.getChildren().add(line13);
		
		Line line14 = new Line();
		line14.setStartX(0);line14.setStartY(675);
		line14.setEndX(1000);line14.setEndY(675);
		root.getChildren().add(line14);
		
		Line line15 = new Line();
		line15.setStartX(0);line15.setStartY(750);
		line15.setEndX(1000);line15.setEndY(750);
		root.getChildren().add(line15);
		
		Line line16 = new Line();
		line16.setStartX(0);line16.setStartY(825);
		line16.setEndX(1000);line16.setEndY(825);
		root.getChildren().add(line16);
		
		
		Image image = new Image("head.png");
		ImageView imageView = new ImageView(image);
		imageView.setX(0);
		imageView.setY(0);
		root.getChildren().add(imageView);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
