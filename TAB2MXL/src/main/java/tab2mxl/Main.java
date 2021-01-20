package tab2mxl;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
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
	}
	
	protected void confirmWorking() { 
		System.out.println("Hi");
	}
}
