package arraysmanupulation;

import java.util.HashSet;

public class FindDupplicatesinarray {

	public static void main(String[] args) {
		int[] arr= {1,2,1,3,4,5,1,2,6};
		int len=arr.length;
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> duplicate = new HashSet<Integer>();
		for (int num : arr) {
            if (!set.add(num)) {
                duplicate.add(num);
            }
        }
		System.out.println("duplicate elements is" +duplicate);

	}

}
