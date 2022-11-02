import java.util.*;
public class LearnMap {

	public static void main(String[] args) {
     
		//Map<String, Integer> numbers  = new HashMap<>();
		Map<String, Integer> numbers  = new TreeMap<>();//ye sorted karta he

		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four", 4);
		
		System.out.println(numbers);
		numbers.put("two", 20);// yha pe overide hogi value
		//numbers.putIfAbsent("two", 40);//yha pe override nhi hogi
		System.out.println(numbers);
		
//		for(Map.Entry<String, Integer> e:numbers.entrySet()) {
//			System.out.println(e);
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}
		
		for(String key: numbers.keySet()) {
			System.out.println(key);
		}
		
		for(Integer value :numbers.values()) {
			System.out.println(value);
		}
		
		System.out.println(numbers.containsValue(3));
		
		
	}

}
