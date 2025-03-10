package stringmanupulation;

import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
		String str="sanjaykumar";
		int len=str.length();
		HashSet<Character> set= new HashSet<Character>();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					set.add(str.charAt(i));
				}
			}
		}
		for(Character s:set) {
			System.out.println(s);
		}
	}
}
