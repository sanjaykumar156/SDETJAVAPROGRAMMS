package arraysmanupulation;

import java.util.ArrayList;

public class SearchanelememntinArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,6};
		int len= arr.length;
		int searchele=6;
		ArrayList<Integer> num= new ArrayList<Integer>();
		for(int i=0;i<len;i++) {
			if(arr[i]==searchele) {
				num.add(i);
			}
		}
		if(!num.isEmpty()) {
		System.out.println("element found at index" +": "+ num);
		}else {
			System.out.println("element not found");
		}
	}

}
