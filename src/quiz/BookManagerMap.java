package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class BookManagerMap implements BookManagerMapInterface {

	private HashMap<String, Book> booksMap;
	public BookManagerMap( ) {
		this.booksMap = new HashMap<>(); // �⺻������

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
		System.out.println("��ȣ\tī�װ�\t����\t����");

		Set bNos = booksMap.keySet();
		Iterator<String> iter = bNos.iterator();

		while(iter.hasNext()) {
			printBook(iter.next());
		}
	}

	public void printBook(String bNo) {
		Book book = booksMap.get(bNo);

		if(book == null) {
			System.out.println(bNo +"�� �ش��ϴ� å�� �����ϴ�");
			return;
		}
		System.out.println(book.getbNo()+"\t" ); //å��ȣ
		System.out.println(getCategoryText(book.getCategory())+"\t");
		System.out.println(book.getTitle()+"\t"); //����
		System.out.println(book.getAuthor()); //����
	}
	private String getCategoryText(int category) {
		switch(category) {
		case HUMAN :
			return "�ι�\t";
		case NATURAL :
			return "�ڿ�����";
		case MEDICAL :
			return "�Ƿ�\t";
		case ETC :
			return "��Ÿ\t";
		default :
			return null;
		}

	}

}
