package arraysmanupulation;

import java.util.Arrays;

public class FindSeondLargestnumber {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int len=arr.length;
		Arrays.sort(arr);
		Arrays.toString(arr);
		int secondlargest=arr[len-2];
		System.out.println("The second largest number is ---->"+ " " +secondlargest);

	}

}
