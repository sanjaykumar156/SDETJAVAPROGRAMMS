package arraysmanupulation;

import java.util.Arrays;

public class ChecktwoarrysareEqual {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5,6};
		int[] arr2 = {1, 2, 3, 4, 5};
	
//		if (arr1.length != arr2.length) {
//		    System.out.println("Arrays are not equal");
//		} else {
//		    boolean isEqual = true;
//		    for (int i = 0; i < arr1.length; i++) {
//		        if (arr1[i] != arr2[i]) {
//		            isEqual = false;
//		            break;
//		        }
//		    }
//		    if (isEqual) {
//		        System.out.println("Arrays are equal");
//		    } else {
//		        System.out.println("Arrays are not equal");
//	}
//
//}
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}
}
