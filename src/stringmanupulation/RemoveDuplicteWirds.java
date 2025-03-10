package stringmanupulation;

import java.util.HashSet;

public class RemoveDuplicteWirds {

	public static void main(String[] args) {
		String str="iam sanjay kumar iam";
		String[] s=str.split(" ");
		int len=s.length;
		HashSet<String>set=new HashSet<String>();
		for(int i=0;i<len;i++) {
			String c=s[i];
			set.add(c);
		}
		StringBuilder sb= new StringBuilder();
		for(String ch:set) {
			sb.append(ch).append(" ");
		}
		System.out.println(sb);
	}

}
