package arraysmanupulation;

import java.util.HashMap;

public class Findoccuranceofelements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,1,2,3,55};
		int len=arr.length;
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<len;i++) {
			int num=arr[i];
			if(map.containsKey(num)) {
				int count=map.get(num);
				count++;
				map.put(num, count);
			}else {
				map.put(num, 1);
			}
		}
		for(int number:map.keySet()) {
			System.out.println(number +"------->" + map.get(number));
		}

	}

}
