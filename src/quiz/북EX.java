package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class ��EX {

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
		testMap.put("100001", new Book("100001", 1, "�ι�����1", "�ι�����1"));
		testMap.put("200005", new Book("200005", 2, "�ڿ�����1", "�ڿ���������1"));
		testMap.put("400004", new Book("400004", 4, "��Ÿ����1", "��Ÿ����1"));
		testMap.put("100009", new Book("100009", 1, "�ι�������2", "�ι�����2"));
		testMap.put("300007", new Book("300007", 3, "�Ƿ�ͱ��1", "�Ƿ�����1"));
		testMap.put("200003", new Book("200003", 2, "�ڿ�����2", "�ڿ���������2"));

	}

	public static void menu() {

		int sel=0;

		do {
			System.out.println();
			System.out.println("+++ ���� ���� ���α׷� +++");
			System.out.println();
			System.out.println(" 1. �� ���� �߰�");
			System.out.println(" 2. ���� ����");
			System.out.println(" 3. ���� �˻� ���");
			System.out.println(" 4. ��ü ���");
			System.out.println(" 6. ����");

			do {
				System.out.print("  >> ");
				sel = sc.nextInt();
				if(sel<1 || sel>6) {
					System.out.println("1~6�� �Է��ϼ���");
				}
			} while(sel<1 || sel>6);

			switch(sel) {
			case NEW:
				System.out.println(" + + + ���ο� å ���� �Է� + + +");

				bmMap.putBook(inputBook());
				break;

			case DEL:
				System.out.println(" + + + å ���� ���� + + +");

				deleteBook();
				break;

			case SEARCH:
				System.out.println(" + + + å ���� �˻� + + +");

				searchBook();
				break;

			case PRINT_ALL:
				System.out.println(" + + + å ���� ��ü ��� + + +");

				displayAll();				
				break;

			case EXIT:
				break;
			}

		} while( sel != EXIT );
	}



	//Book ��ü�� �ʵ尪�� Ű����� �Է¹޾� �ʱ�ȭ�ϰ� ��ü ����
	private static Book inputBook() {
		Book book = new Book();

		System.out.print("å ��ȣ : ");
		book.setbNo( sc.next() );

		System.out.print("ī�װ�(1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ) : ");
		book.setCategory( sc.nextInt() );
		sc.nextLine();

		System.out.print("å ����: ");
		book.setTitle( sc.nextLine() );

		System.out.print("å ���� : ");
		book.setAuthor( sc.nextLine() );

		return book;
	}

	private static void deleteBook() {
		System.out.print("������ å�� ��ȣ�� �Է��ϼ��� : ");
		bmMap.removeBook(sc.next());
	}

	private static void searchBook() {
		System.out.print("�������� �Է��ϼ��� : ");
		String bookName = sc.next();
		bmMap.printBook(bookName);
	}

	private static void displayAll() {
		bmMap.displayAll();
	}

}
