package button;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/*
 * Javafx GUI class
 */

public class GUI extends Application {

	private Desktop dt = Desktop.getDesktop(); //User Desktop

	/**
	 * Overridden start method that originally came from the Application class from Javafx. 
	 * This method is the body structure of the GUI.
	 */
    @Override
    public void start(Stage primaryStage) {
    	
    	primaryStage.setTitle("TTT(TextToTablature)"); //Title

        final Button ob = new Button("Browse"); //Push button that is redirected to a file selecting page
        final FileChooser fc = new FileChooser(); //Opens browser to select the txt file
        final Label ol = new Label("TTT is a desktop application used for converting "
        		+ "txt tablatures into formal tablatures."); //Description of the use of the desktop application
        final Label obl = new Label("Please select the tablature in txt format: "); //Indicator on what the button is for
        final Label el = new Label("");//Empty label
        final GridPane inputValues = new GridPane(); //The parent which concludes of children such as buttons and labels
        final Pane rg = new VBox(12); //Base class that is used to have the children of inputValues public
        
        Font font = Font.font("Browsed", FontWeight.EXTRA_BOLD, 40); //Font for the buttons
        Font font1 = Font.font("label font", FontWeight.NORMAL, 20); //Font for the plan texts

        ob.setFont(font);
        obl.setFont(font1);
        ol.setFont(font1);
        
        ob.setOnAction(
        	new EventHandler<ActionEvent>() {
        		@Override
        		public void handle(final ActionEvent e) {
        			File fi = fc.showOpenDialog(primaryStage);
        			if (fi != null) {
        				openFile(fi);
        			}
        		}
        }); //This opens fc when the button ob is pushed
        
        GridPane.setConstraints(ob, 1, 2);
        GridPane.setConstraints(obl, 0, 2);
        GridPane.setConstraints(el, 0, 1);
        GridPane.setConstraints(ol, 0, 0);
        inputValues.setHgap(6);
        inputValues.setVgap(6);
        inputValues.getChildren().addAll(ob, ol, el, obl);
        
        rg.getChildren().addAll(inputValues);
        rg.setPadding(new Insets(12, 12, 12, 12));
        
        Scene Scene1 = new Scene(rg);
        primaryStage.setScene(Scene1);
        primaryStage.show();
    }
    
    /**
	 * The method that opens fc and takes a input file
	 */
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
    
    /**
     * Main function that runs the Application.launch() method
     */
    public static void main(String[] args) {
        launch(args);
    }

}