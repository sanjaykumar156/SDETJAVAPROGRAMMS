package arraysmanupulation;

public class FindSmalestandLargestnumber {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,-1,8};
		int len=arr.length;
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<len;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("largest number in array is" +" "+largest);
		System.out.println("smallest number in array is" +" "+smallest);
	}

}
