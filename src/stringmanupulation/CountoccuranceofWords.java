package stringmanupulation;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountoccuranceofWords {

	public static void main(String[] args) {
		String str="iam sanjaykumar iam QA engineer";
		String[] s=str.split(" ");
		
		HashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(int i=0;i<s.length;i++) {
			String word=s[i];
			if(map.keySet().contains(word)) {
				int count=map.get(word);
				count++;
				map.put(word, count);
			}else {
				map.put(word, 1);
			}
		}
		for(String name:map.keySet()) {
			System.out.println(name+ " ----->"+ map.get(name));
		}

	}

}
