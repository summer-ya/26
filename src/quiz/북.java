package quiz;

public class 북 {
	
	private String bNo; // 도서번호
	private int category; //도서분류코드(1.인문2.자연과학3.의료4.기타)
	private String title; //책제목
	private String author; //저자
	
	public 북() { }

	public 북(String bNo, int category, String title, String author) {

		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "북 [bNo=" + bNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
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
