package arraysmanupulation;

import java.util.Arrays;

public class FindSecondsmallestElement {

	public static void main(String[] args) {
		int arr[] = {1,5,6,4,2,3,7,9,5};
		Arrays.sort(arr);
		Arrays.toString(arr);
		int element=arr[1];
		System.out.println("second smallest element in an array is" +": "+element);
	}

}
