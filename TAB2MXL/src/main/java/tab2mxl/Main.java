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
		public boolean isValid("((]]([}}{")
		/**
		 * Given a string s containing just the characters,
		 * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
		 */
		public boolean isValid(String s) {
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') stack.push(s.charAt(i));
				if (s.charAt(i) == '[') stack.push(s.charAt(i));
				if (s.charAt(i) == '{') stack.push(s.charAt(i));
				if (s.charAt(i) == ')' ) {
					if (stack.empty() || stack.peek() != '(') return false;
					else stack.pop();
				}
				if (s.charAt(i) == ']' ) {
					if (stack.empty() || stack.peek() != '[') return false;
					else stack.pop();
				}
				if (s.charAt(i) == '}' ) {
					if (stack.empty() || stack.peek() != '{') return false;
					else stack.pop();
				}
			}
			return stack.empty();
		}
	}
}
