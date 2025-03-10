package stringmanupulation;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Removeduplicatesandprint {

	public static void main(String[] args) {
		String str="sanjaykumarroyal";
		int len=str.length();
		
		HashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			set.add(ch);
		}
		StringBuilder sb= new StringBuilder();
		for(Character c:set) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
	}

}
