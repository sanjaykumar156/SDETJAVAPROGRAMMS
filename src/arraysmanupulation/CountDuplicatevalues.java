package arraysmanupulation;

public class CountDuplicatevalues {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,1,2,3};
		int len=arr.length;
		
		int count=0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		System.out.println("Duplicate value count is" +count);

	}

}
