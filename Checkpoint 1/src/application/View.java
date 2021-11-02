package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;  

public class View extends Application {
	
	public void start(Stage s) {
		
		// I don't know what they want
		// also, let's do 8 am to 5 pm
		// then change the size by the percentages and all!
		// I hope this works
		
		GridPane one = new GridPane();
		one.setPadding(new Insets(5,5,5,5));
		
		// I wish there was a better
		// way to do this but whatever
		
		double side = 20.0;
		Polygon sq = new Polygon();
		sq.getPoints().addAll(new Double[] {
				0.0,0.0,
				side,0.0,
				side,side,
				0.0,side
		});
		
		Color lightRed = Color.rgb(255, 100, 100);
		sq.setFill(lightRed);
		one.add(sq, 0, 0);
		
		Polygon sq2 = new Polygon();
		sq2.getPoints().addAll(new Double[] {
				0.0,0.0,
				side,0.0,
				side,side,
				0.0,side
		});
		
		Color lightGreen = Color.rgb(100, 255, 100);
		sq2.setFill(lightGreen);
		one.add(sq2, 1, 0);
		
		
		
		
		
		
		
		Scene sc = new Scene(one,300,100);
		s.setScene(sc);
		s.show();
	}
	
	// the end
	public static void main(String[] args) {
		
		launch(args);
	}
}