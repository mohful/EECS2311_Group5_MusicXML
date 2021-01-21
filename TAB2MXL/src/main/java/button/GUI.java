package button;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class GUI extends Application {

	private Desktop dt = Desktop.getDesktop();
	
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    	
    	primaryStage.setTitle("TTT(TextToTablature)");

        final Button ob = new Button("Browse");
        final FileChooser fc = new FileChooser();

        Font font = Font.font("Browsed", FontWeight.EXTRA_BOLD, 32);

        ob.setFont(font);
        
        ob.setOnAction(
        	new EventHandler<ActionEvent>() {
        		@Override
        		public void handle(final ActionEvent e) {
        			File fi = fc.showOpenDialog(primaryStage);
        			if (fi != null) {
        				openFile(fi);
        			}
        		}
        });

        VBox vbox = new VBox(ob);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void openFile(File fi) {
    	try {
            dt.open(fi);
        } catch (IOException ex) {
            Logger.getLogger(
                GUI.class.getName()).log(
                    Level.SEVERE, null, ex
                );
        }
    }

}