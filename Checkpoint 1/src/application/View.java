package application;

import java.awt.Rectangle;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;  

public class View extends Application {
	
	public View(Stage s, SubmitHandler courseList) {
		
		GridPane one = new GridPane();
		one.setPadding(new Insets(5,5,5,5));
		one.setVgap(20);
		one.setHgap(20);
		
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
		//one.add(sq, 0, 0);
		
		Polygon sq2 = new Polygon();
		sq2.getPoints().addAll(new Double[] {
				0.0,0.0,
				side,0.0,
				side,side,
				0.0,side
		});
		
		Color lightGreen = Color.rgb(100, 255, 100);
		sq2.setFill(lightGreen);
		//one.add(sq2, 1, 0);
		
		Label aa = new Label("8 am");
		Label bb = new Label("9 am");
		Label cc = new Label("10 am");
		Label dd = new Label("11 am");
		Label ee = new Label("12 noon");
		Label ff = new Label("1 pm");
		Label gg = new Label("2 pm");
		Label hh = new Label("3 pm");
		Label ii = new Label("4 pm");
		Label jj = new Label("5 pm");
		
		one.add(aa,0,1);
		one.add(bb,0,2);
		one.add(cc,0,3);
		one.add(dd,0,4);
		one.add(ee,0,5);
		one.add(ff,0,6);
		one.add(gg,0,7);
		one.add(hh,0,8);
		one.add(ii,0,9);
		one.add(jj,0,10);
		
		Label mon = new Label("Monday");
		Label tue = new Label("Tuesday");
		Label wed = new Label("Wednesday");
		Label thu = new Label("Thursday");
		Label fri = new Label("Friday");
		
		one.add(mon,1,0);
		one.add(tue,2,0);
		one.add(wed,3,0);
		one.add(thu,4,0);
		one.add(fri,5,0);
		
	

		String weekday = "Monday";
		//if(weekday == "Monday") {

        Rectangle rectangle = new Rectangle();
        rectangle.setX(200);
        rectangle.setY(200);
        rectangle.setWidth(300);
        rectangle.setHeight(400);
        rectangle.setStroke(Color.TRANSPARENT);
        rectangle.setFill(Color.valueOf("#00ffff"));
		//notes or something
		//}
		
	
		
		Scene sc = new Scene(one,800,500);
		s.setScene(sc);
		s.show();
	}
	
	// the end
	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}