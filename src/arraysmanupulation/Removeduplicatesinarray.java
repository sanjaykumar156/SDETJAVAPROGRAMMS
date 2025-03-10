package arraysmanupulation;

import java.util.Arrays;
import java.util.HashSet;

public class Removeduplicatesinarray {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,1,2};
		int len=arr.length;
		HashSet<Integer>set= new HashSet<Integer>();
		for(int i=0;i<len;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}
}
