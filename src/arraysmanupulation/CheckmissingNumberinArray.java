package arraysmanupulation;

public class CheckmissingNumberinArray {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6,7,8,9,10};
		int n=arr.length+1;

		int expectedsum=n*(n+1)/2;
		int actualsum=0;
		
		for(int i=0;i<arr.length;i++) {
			actualsum+=arr[i];
		}
		int missingnum=expectedsum-actualsum;
		System.out.println(missingnum);

	}

}
