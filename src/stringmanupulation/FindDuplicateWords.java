package stringmanupulation;

import java.util.HashSet;

public class FindDuplicateWords {

	public static void main(String[] args) {
		String str="iam sanjaykumar sanjaykumar iam";
		String[] s= str.split(" ");
		
		HashSet<String>set= new HashSet<String>();
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					set.add(s[i]);
				}
			}
		}
		for(String name:set) {
			System.out.println(name);
		}
	}
}
