package stringmanupulation;

public class Fidinglargestword {

	public static void main(String[] args) {
		String str="iam sanjay kumar";
		String[] s=str.split(" ");
		
		String largest=s[0];
		for(int i=1;i<s.length;i++) {
			if(s[i].length()>largest.length()) {
				largest=s[i];
			}
		}
		System.out.println(largest);
	}

}