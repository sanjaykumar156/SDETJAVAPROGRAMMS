package arraysmanupulation;

public class CheckPalindrome {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,1};
		int len=arr.length;
		String rev="";
		String original="";
		for(int i=0;i<len;i++) {
			original+=arr[i];
		}
		for(int j=len-1;j>=0;j--) {
			rev+=arr[j];
		}
		if(original.equals(rev)) {
			System.out.println("The given array is a palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
	}

}
