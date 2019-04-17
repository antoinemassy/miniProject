package bean;

import java.util.HashMap;

public class Reservation {
	private HashMap<String, Boolean> books = new HashMap<String, Boolean>();
	

	public Reservation() {
		books.put("Les miserables", true);
		books.put("Le petit chaperon rouge", true);
		books.put("La princesse de cleves", true);
		books.put("Le rouge et le noir", true);
		books.put("La bible",false);
	}
	
	public boolean isExisting(String bookName) {
		return books.containsKey(bookName);
	}
	
	public String getBooks() {
		String str="Books we have : ";
		for ( String key : books.keySet() ) {
			str = str + key+ " - ";
		}	
		return str;
		
	}
	
	public boolean isAvailable(String bookName) {
		if(books.containsKey(bookName)) {
			return books.get(bookName);
		}else {
			return false;
		}
	}
	
	public void reserve(String bookName) {
		if(books.containsKey(bookName)) {
			books.put(bookName, false);
		}
		
	}
}
