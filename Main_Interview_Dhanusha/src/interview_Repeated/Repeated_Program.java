package interview_Repeated;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_Program {
	public static void main(String[] args) {
		Map<Object,Integer> m =  new LinkedHashMap<Object,Integer>();
		String str = "life is beautiful , life is precious";
		String[] sp = str.split("");
		
		for (String string : sp) {
			
			if (m.containsKey(string)) {
				
				Integer value = m.get(string);
				
				m.put(string, value+1);
				
			}
			else {
				m.put(string, 1);
				
			}
			
			System.out.println(string);
			
		}
		
		Set<Entry<Object, Integer>> entrySet = m.entrySet();
		
		for (Entry<Object, Integer> entry : entrySet) {
			if (entry.getValue()>=0) {
				System.out.println(entry);
				
			}
			
		}
			
		}
		
		
	}


