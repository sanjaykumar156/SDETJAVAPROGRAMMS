package arraysmanupulation;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int arr2[]= {6,7,8,9};
		int n=arr1.length;
		int m=arr2.length;
		int mergedarr[]=new int[n+m];
		for(int i=0;i<n;i++) {
			mergedarr[i]=arr1[i];
		} 
		for (int i = 0; i < m; i++) {
            mergedarr[n + i] = arr2[i];
		}
		System.out.println(Arrays.toString(mergedarr));
	}
}