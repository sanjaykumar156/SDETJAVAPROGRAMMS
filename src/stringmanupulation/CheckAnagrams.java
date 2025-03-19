package stringmanupulation;

import java.util.Arrays;

public class CheckAnagrams {

	public static void main(String[] args) {
		String str="listen";
		String str2="silent";
		 char[] arr1 = str.toCharArray();
	     char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("anagrams");
		}else {
			System.out.println("not annagrams");
		}

	}

}
