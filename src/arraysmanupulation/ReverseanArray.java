package arraysmanupulation;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6};
		int len=arr.length;
		 int[] revarr = new int[len];
		for(int i=len-1;i>=0;i--) {
			revarr[i] = arr[len - 1 - i];
		}
		System.out.println(Arrays.toString(revarr));
	}
}
