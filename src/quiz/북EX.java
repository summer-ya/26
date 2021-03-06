package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class 북EX {

	private static final Scanner sc = new Scanner(System.in);
	private static final BookManagerMap bmMap = new BookManagerMap();

	private static final int NEW =1;
	private static final int DEL = 2;
	private static final int SEARCH = 3;
	private static final int PRINT_ALL =4;
	private static final int EXIT = 6;

	public static void main(String[] args) {

		menu();
	}


	private static void test() {

		HashMap<String, Book> testMap = new HashMap<>();
		testMap.put("100001", new Book("100001", 1, "인문서적1", "인문저자1"));
		testMap.put("200005", new Book("200005", 2, "자연과학1", "자연과학저자1"));
		testMap.put("400004", new Book("400004", 4, "기타서적1", "기타저자1"));
		testMap.put("100009", new Book("100009", 1, "인문학정의2", "인문저자2"));
		testMap.put("300007", new Book("300007", 3, "의료와기기1", "의료저자1"));
		testMap.put("200003", new Book("200003", 2, "자연과학2", "자연과학저자2"));

	}

	public static void menu() {

		int sel=0;

		do {
			System.out.println();
			System.out.println("+++ 도서 관리 프로그램 +++");
			System.out.println();
			System.out.println(" 1. 새 도서 추가");
			System.out.println(" 2. 도서 삭제");
			System.out.println(" 3. 도서 검색 출력");
			System.out.println(" 4. 전체 출력");
			System.out.println(" 6. 종료");

			do {
				System.out.print("  >> ");
				sel = sc.nextInt();
				if(sel<1 || sel>6) {
					System.out.println("1~6만 입력하세요");
				}
			} while(sel<1 || sel>6);

			switch(sel) {
			case NEW:
				System.out.println(" + + + 새로운 책 정보 입력 + + +");

				bmMap.putBook(inputBook());
				break;

			case DEL:
				System.out.println(" + + + 책 정보 삭제 + + +");

				deleteBook();
				break;

			case SEARCH:
				System.out.println(" + + + 책 정보 검색 + + +");

				searchBook();
				break;

			case PRINT_ALL:
				System.out.println(" + + + 책 정보 전체 출력 + + +");

				displayAll();				
				break;

			case EXIT:
				break;
			}

		} while( sel != EXIT );
	}



	//Book 객체의 필드값을 키보드로 입력받아 초기화하고 객체 리턴
	private static Book inputBook() {
		Book book = new Book();

		System.out.print("책 번호 : ");
		book.setbNo( sc.next() );

		System.out.print("카테고리(1.인문/2.자연과학/3.의료/4.기타) : ");
		book.setCategory( sc.nextInt() );
		sc.nextLine();

		System.out.print("책 제목: ");
		book.setTitle( sc.nextLine() );

		System.out.print("책 저자 : ");
		book.setAuthor( sc.nextLine() );

		return book;
	}

	private static void deleteBook() {
		System.out.print("삭제할 책의 번호를 입력하세요 : ");
		bmMap.removeBook(sc.next());
	}

	private static void searchBook() {
		System.out.print("도서명을 입력하세요 : ");
		String bookName = sc.next();
		bmMap.printBook(bookName);
	}

	private static void displayAll() {
		bmMap.displayAll();
	}

}
