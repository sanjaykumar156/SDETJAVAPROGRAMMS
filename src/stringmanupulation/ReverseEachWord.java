package stringmanupulation;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="iam working as QA engineer";
		
		String[] s=str.split(" ");
		int length=s.length;
		String rev="";
		for(int i=0;i<length;i++) {
			String word=s[i];
			for(int j=word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
			}
			rev+=" ";
		}
		System.out.println(rev.trim());
	}

}
