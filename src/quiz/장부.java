package quiz;

public class 장부 {
	
	private String name; // 이름
	
	private int money;   // 잔액
	
	
	//메소드 기능
	//돈을 입금하기(deposit) , 매개변수로 정수형 데이터, 리턴타입은 없음
	
	public void deposit(int money) {
		this.money += money;
		
	}
	
	// 돈 출금하기, 매개변수로 정수형 데이터, 리턴타입 없음
	public void withdraw(int money) {
		this.money -= money;
	}
	
	
	//잔액 보여주기 매개변수/리턴타입 없음
	public void showMoney() {
		System.out.println(name +"님의 잔액 : "+ money+ "달러");
	}
	public 장부(String name, int money) {
		this.name = name;
		this.money = money;
	}

	
	
}
