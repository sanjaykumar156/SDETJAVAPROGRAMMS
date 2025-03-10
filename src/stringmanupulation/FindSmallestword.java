package stringmanupulation;

public class FindSmallestword {

	public static void main(String[] args) {
		String str="iam sanjay kumar i";
		String[] s=str.split(" ");
		
		String smallest=s[0];
		for(int i=1;i<s.length;i++) {
			if(s[i].length()<smallest.length()) {
				smallest=s[i];
			}
		}
		System.out.println(smallest);

	}

}
