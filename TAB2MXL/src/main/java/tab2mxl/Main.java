package tab2mxl;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		list.add("Rafael");
		list.add("Mohammed");
		list.add("Nick");
		list.add("Shawn");
		list.add("Yashraj");
		for (String e: list) { 
			System.out.println("Member name: ");
			System.out.println(e);
		}
	}
}
