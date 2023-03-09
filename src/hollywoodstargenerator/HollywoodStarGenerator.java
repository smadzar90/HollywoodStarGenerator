/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package hollywoodstargenerator;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author stipanmadzar
 */
public class HollywoodStarGenerator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final double X1 = 199.0, Y1 = 25.0;
        final double X2 = 219.0, Y2 = 80.0;
        final double X3 = 219.0 + 58.52, Y3 = 80.0;
        final double X4 = 224.0, Y4 = 115.0;
        final double X5 = 245.0, Y5 = 170.0;
        final double X6 = 199.0, Y6 = 140.0;
        final double X7 = 199.0 - 46.0, Y7 = 170.0;
        final double X8 = 199.0 - 25.0, Y8 = 115.0;
        final double X9 = 199.0 - 78.52, Y9 = 80.0;
        final double X10 = 179.0, Y10 = 80.0;
        final double TEXT_X = 199.0, TEXT_Y = 107.0;
        
        Polygon star = new Polygon(X1, Y1, X2, Y2, X3, Y3, 
                                  X4, Y4, X5, Y5, X6, Y6, 
                                  X7, Y7, X8, Y8, X9, Y9, 
                                  X10, Y10);
        star.setFill(Color.CYAN);
        star.setStrokeWidth(5.0);
        star.setStroke(Color.GOLD);
        Text name = new Text(TEXT_X, TEXT_Y, "Your-Name");
        name.setFill(Color.BLUE);
        name.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        name.setX(name.getX() - name.getLayoutBounds().getWidth() / 2);
        DropShadow shadow = new DropShadow();
        shadow.setOffsetX(15.0);
        shadow.setOffsetY(15.0);
        name.setEffect(shadow);
        TextField textField = new TextField();
        textField.setMaxWidth(150);
        textField.setPromptText("Type your name here");
        textField.setFocusTraversable(false); 
        Button btn1 = new Button("Generate");
        Button btn2 = new Button("Reset");
        HBox box = new HBox(10, btn1, btn2);
        box.setAlignment(Pos.CENTER);
        
        btn1.setOnAction(e -> {
       
            if(!textField.getText().isEmpty()) {
                
                String yourName = textField.getText();
                name.setText(yourName);   
            }
            else {
                textField.setPromptText("Type your name here");
                textField.setFocusTraversable(false); 
            }  
        });
        
        btn2.setOnAction(e -> {
            textField.clear();
            textField.setPromptText("Type your name here");
            textField.setFocusTraversable(false); 
            name.setText("Your-Name");  
            
        });
        
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        StackPane pane = new StackPane(star, name);
        root.setMargin(pane, new Insets(-20, 0, 0, 0));
        root.getChildren().addAll(pane, textField, box); 
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Draw a Super-Star");
        primaryStage.setScene(scene);
        primaryStage.show();     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
