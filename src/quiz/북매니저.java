package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class �ϸŴ��� {
	
	private HashMap<String, Book> booksMap = new HashMap<>();
	
	public �ϸŴ���() { }

	public �ϸŴ���(HashMap<String, Book> booksMap) {
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
