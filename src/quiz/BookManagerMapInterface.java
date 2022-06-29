package quiz;

public interface BookManagerMapInterface {

	public static final int HUMAN = 1;
	public static final int NATURAL = 2;
	public static final int MEDICAL = 3;
	public static final int ETC = 4;
	
	public void putBook(Book book);
	
	
	public void removeBook(String bNo);
	
	public String searchBook(String bTitle);
	
	public void displayAll();
	
	public void printBook(String bNo);
	
}
