package stringmanupulation;

public class ReverseonlyAlphabets {

	public static void main(String[] args) {
		String str="sanjaykumar@123";
		char[] c=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(char ch:c) {
			if(Character.isLetter(ch)) {
				sb.append(ch);
			}
			
		}
		System.out.println(sb.toString());
		

	}

}
