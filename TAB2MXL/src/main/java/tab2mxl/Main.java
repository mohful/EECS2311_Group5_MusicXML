package tab2mxl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		File file = new File("MusicXML");
		
		try { 
			Scanner sc = new Scanner(file); //
			
			while (sc.hasNextLine()) { 
				int i = sc.nextInt();
				System.out.println(i);
			}
			sc.close();
		}
		catch (FileNotFoundException e) { 
			e.printStackTrace();
		}
		
	}
	
	
}
