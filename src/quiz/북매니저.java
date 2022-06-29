package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class 合概聪历 {
	
	private HashMap<String, Book> booksMap = new HashMap<>();
	
	public 合概聪历() { }

	public 合概聪历(HashMap<String, Book> booksMap) {
		this.booksMap = booksMap;
	}
	
	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}
	public void removeBook(String bNo) {
		booksMap.remove(bNo);
	}
	public String searchBook(String bTitle) {
		Set<String> bNos = booksMap.keySet();
		Iterator<String> iter = bNos.iterator();
		
		while(iter.hasNext()) {
			Book currentBook = booksMap.get(iter.next());
			
			if(bTitle.equals(currentBook.getTitle())) {
				return currentBook.getbNo();
			}
		}
		return null;
	}
	

}
