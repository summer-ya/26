package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class BookManagerMap implements BookManagerMapInterface {

	private HashMap<String, Book> booksMap;
	public BookManagerMap( ) {
		this.booksMap = new HashMap<>(); // 기본생성자

	}
	public BookManagerMap(HashMap<String, Book> booksMap) {
		this.booksMap = booksMap;

	}

	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}
	public void removeBook(String bNo) {
		booksMap.put(bNo, null);

	}

	public String searchBook(String bTitle) {
		Set<String> bNos = booksMap.keySet();
		Iterator<String> iter = bNos.iterator();

		while(iter.hasNext() ) {

			Book currentBook = booksMap.get(iter.next());

			if(bTitle.equals(currentBook.getTitle())) {
				return currentBook.getbNo();
			}
		}
		return null;

	}
	public void displayAll() {
		System.out.println("번호\t카테고리\t제목\t저자");

		Set bNos = booksMap.keySet();
		Iterator<String> iter = bNos.iterator();

		while(iter.hasNext()) {
			printBook(iter.next());
		}
	}

	public void printBook(String bNo) {
		Book book = booksMap.get(bNo);

		if(book == null) {
			System.out.println(bNo +"에 해당하는 책이 없습니다");
			return;
		}
		System.out.println(book.getbNo()+"\t" ); //책번호
		System.out.println(getCategoryText(book.getCategory())+"\t");
		System.out.println(book.getTitle()+"\t"); //제목
		System.out.println(book.getAuthor()); //저자
	}
	private String getCategoryText(int category) {
		switch(category) {
		case HUMAN :
			return "인문\t";
		case NATURAL :
			return "자연과학";
		case MEDICAL :
			return "의료\t";
		case ETC :
			return "기타\t";
		default :
			return null;
		}

	}

}
