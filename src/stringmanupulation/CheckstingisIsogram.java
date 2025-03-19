package stringmanupulation;

public class CheckstingisIsogram {

	public static void main(String[] args) {
		String str="sanjyy";
		int len=str.length();
		boolean isogarm=true;
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			for(int j=i+1;j<len;j++) {
				char c=str.charAt(j);
				if(ch==c) {
					isogarm=false;
				}
			}
		}
		if(isogarm) {
			System.out.println("isogram");
		}else {
			System.out.println("not isogram");
		}
	}

}
