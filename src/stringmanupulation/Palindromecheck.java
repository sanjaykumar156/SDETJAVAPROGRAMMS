package stringmanupulation;

public class Palindromecheck {

	public static void main(String[] args) {
		String str="madame";
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
			if(rev.equals(str)) {
				System.out.println("The given string is a palindrome string");
			}else {
				System.out.println("not palindromee");
			}
	}

}
