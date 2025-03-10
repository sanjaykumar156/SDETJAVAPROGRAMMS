package arraysmanupulation;

import java.util.Arrays;

public class MoveallZerosInarray {

	public static void main(String[] args) {
		int[] arr= {0,1,2,3,0,0,4,5,6,0,1,0};
		
		int index=0;
		
		for(int num:arr) {
			if(num!=0) {
				arr[index++]=num;
			}
		}
		while(index<arr.length) {
			arr[index++]=0;
		}
		System.out.println(Arrays.toString(arr));
		


	}

}
