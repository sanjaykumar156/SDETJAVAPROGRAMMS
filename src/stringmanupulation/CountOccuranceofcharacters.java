package stringmanupulation;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountOccuranceofcharacters {

	public static void main(String[] args) {
		String str= "sanjaykumar";
		int len=str.length();
		
		HashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				count++;
				map.put(ch,count);
			}else {
				map.put(ch, 1);
			}
	}
		for(Character c:map.keySet()) {
			System.out.println(c+" -----> "+map.get(c)+" "+"times");
		}

}
}
