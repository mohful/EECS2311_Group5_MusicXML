package tab2mxl;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
	
	protected void check() { 
		System.out.println("Hi");
	}
	
	protected void check2() {
		System.out.println("Hello");
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
	}
}
