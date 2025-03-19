package arraysmanupulation;

import java.util.ArrayList;

public class ExtractnumberfromString {

	public static void main(String[] args) {
		String str="sanjay1245";
		ArrayList<Character> list=new ArrayList<Character>();
		for (char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) {
				list.add(ch);
			}
		}
		System.out.println(list);

	}

}
