package tab2mxl;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application{
	
	//Pushing to resolve conflict
	protected void check() { 
		System.out.println("Hi professo");
		System.out.println("Yeah Hai");
		System.out.println("Rafael");
		System.out.println("Mohammed");
		System.out.println("Junhyeong");
		System.out.println("Yashraj");
		System.out.println("Shawn");
	}
	
	
	protected void check2() { 
		System.out.println("Test");
		System.out.println("Yeah Hai");
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rafael Dolores");
		list.add("Mohammed Fulwala");
		list.add("Nick Park");
		list.add("Shawn Verma");
		list.add("Yashraj Rathore");
		for (String e: list) { 
			System.out.println("Member name: ");
			System.out.println(e);
		}
		Application.launch(args);
	}
	
	protected void confirmWorking() { 
		System.out.println("Hi");
	}


	@Override
	public void start(Stage primaryStage) throws Exception  { 
		primaryStage.setTitle("TexttoTab");
		
		Label label = new Label("TexttoTab is a desktop application that converts txt based tablature into readable format");
		Scene scene = new Scene(label, 400, 200);
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
}
