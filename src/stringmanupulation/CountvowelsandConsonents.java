package stringmanupulation;

public class CountvowelsandConsonents {

	public static void main(String[] args) {
		String str="sanjaykumar";
		int len=str.length();
		int vowelscount=0;
		int consonantscount=0;
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			 if (Character.isLetter(ch)) { 
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowelscount++;
			}else {
				consonantscount++;
			}
			 }
		}
		System.out.println("no of vowles is "+vowelscount);
		System.out.println("no of consonents is "+consonantscount);
	}

}
