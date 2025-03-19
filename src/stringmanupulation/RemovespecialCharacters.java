package stringmanupulation;

public class RemovespecialCharacters {

	public static void main(String[] args) {
		String str="abc@#$eg";
		String result=str.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(result);
	}

}