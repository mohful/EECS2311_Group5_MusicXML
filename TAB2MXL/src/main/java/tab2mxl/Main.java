package tab2mxl;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rafael Dolores");
		list.add("Mohammed Fulwala");
		list.add("Nick Park");
		list.add("Shawn I forgot your last name, sorry");
		list.add("Yashraj I forgot your last name, sorry");
		for (String e: list) { 
			System.out.println("Member name: ");
			System.out.println(e);
		}
	}
}
