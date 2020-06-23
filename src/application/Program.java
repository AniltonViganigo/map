package application;

import java.util.Map;
import java.util.TreeMap;




public class Program {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "9999-8888");
		
		cookies.remove("email");
		cookies.put("phone", "9999-1234");
		
		System.out.println("Contains 'email' key: " + cookies.containsKey("email"));
		
		System.out.println("Phone number:" + cookies.get("phone"));
		
		System.out.println("Size: " + cookies.size());
		
		
		
		System.out.println("All cookies:");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		

	}

}
