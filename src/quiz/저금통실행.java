package quiz;

public class 저금통실행 {
	public static void main(String[] args) {
		
		장부 bank = new 장부("미스티", 1000);

		bank.deposit(7000);
		bank.showMoney();
		bank.withdraw(2000);
		bank.showMoney();
	}

}
