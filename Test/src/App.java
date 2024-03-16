import java.beans.EventHandler;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class App extends Application{

    public void start(Stage primarStage){

        Label content1 = new Label("Milimeters to Feet");
        TextField receiveInput1 = new TextField();
        Button button1 = new Button("Submit");
        Label output1 = new Label();
        VBox box1 = new VBox(content1, receiveInput1, button1, output1);
        button1.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0) {
                    try {
                        output1.setText(MiltoFeet(Integer.parseInt(receiveInput1.getText())) + "ft.");
                    } catch (Exception e) {
                        output1.setText("Please enter a valid input.");
                    }
            }
        });
       
        Label content2 = new Label("Centimeters to Feet");
        TextField receiveInput2 = new TextField();
        Button button2 = new Button("Submit");
        Label output2 = new Label();
        VBox box2 = new VBox(content2, receiveInput2, button2, output2);
        button2.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0) {
                try {
                    output2.setText(CentoFeet(Integer.parseInt(receiveInput2.getText())) + "ft.");
                } catch (Exception e) {
                    output2.setText("Please enter a valid input.");
                }
            }
        });

        Label content3 = new Label("Meters to Feet");
        TextField receiveInput3 = new TextField();
        Button button3 = new Button("Submit");
        Label output3 = new Label();
        VBox box3 = new VBox(content3, receiveInput3, button3, output3);
        button3.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0) {
                try {
                    output3.setText(MettoFeet(Integer.parseInt(receiveInput3.getText())) + "ft.");
                } catch (Exception e) {
                    output3.setText("Please enter a valid input.");
                }
               
            }
        });

        Label content4 = new Label("Kilometers to Feet");
        TextField receiveInput4 = new TextField();
        Button button4 = new Button("Submit");
        Label output4 = new Label();
        VBox box4 = new VBox(content4, receiveInput4, button4, output4);
        button4.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0) {
                try {
                    output4.setText(KilotoFeet(Integer.parseInt(receiveInput4.getText())) + "ft.");
                } catch (Exception e) {
                    output4.setText("Please enter a valid input.");
                }    
            }
        });
       

        TitledPane titledPane1 = new TitledPane();
        titledPane1.setCollapsible(true);
        titledPane1.setExpanded(false);
        titledPane1.setContent(box1);

        TitledPane titledPane2 = new TitledPane();
        titledPane2.setCollapsible(true);
        titledPane2.setExpanded(false);
        titledPane2.setContent(box2);

        TitledPane titledPane3 = new TitledPane();
        titledPane3.setCollapsible(true);
        titledPane3.setExpanded(false);
        titledPane3.setContent(box3);

        TitledPane titledPane4 = new TitledPane();
        titledPane4.setCollapsible(true);
        titledPane4.setExpanded(false);
        titledPane4.setContent(box4);
        


        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(titledPane1, titledPane2, titledPane3, titledPane4);
        Scene scene = new Scene(accordion, 300, 200);

      
        primarStage.setTitle("Metric Converter");
        primarStage.setScene(scene);
        primarStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public String MiltoFeet(int input){
        return Double.toString(input * .00328084);
    }
    public String CentoFeet(int input){
        return Double.toString( input * .0328084);
    }
    public String MettoFeet(int input){
        return Double.toString(input * 3.28084);
    }
    public String KilotoFeet(int input){
        return Double.toString(input * 3280.84);
    }
    

      // Rectangle rect = new Rectangle(200, 1000, Color.BLACK);
        // ScrollPane s1 = new ScrollPane();
        // s1.setPrefSize(120, 120);
        // s1.setContent(rect);
        // Scene scene2 = new Scene(s1, 300, 500);

}