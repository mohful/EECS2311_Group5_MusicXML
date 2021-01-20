package tab2mxl;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
	
	protected void check() { 
		System.out.println("Hi professo");
	}
	/**
	 * Given a string s containing just the characters,
	 * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	 */
	public static boolean isValid(String s) {
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
	
	/**
	 * Given an array nums and a value val, 
	 * remove all instances of that value in-place and return the new length.
	 * @param nums
	 * @param val
	 * @return
	 */
	
	public static int removeElement(int[] nums, int val) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
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
		System.out.println(isValid("((]]([}}{"));
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(removeElement(arr, 2));
	}
	
	protected void confirmWorking() { 
		System.out.println("Hi");
	}
}
