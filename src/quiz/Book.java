package quiz;

public class Book {
	
	
	private String bNo;   //������ȣ
	private int category;  //�����з��ڵ�
	private String title;   //å����
	private String author;  //����
	
	
	public Book() { }
	public Book(String bNo, int category, String title, String author) {

		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {

		return "Book [bNo=" +bNo+", category="+category+", title="+title+",author="+author+"]";
	}
	
	
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
}