package quiz;

public class ��� {
	
	private String name; // �̸�
	
	private int money;   // �ܾ�
	
	
	//�޼ҵ� ���
	//���� �Ա��ϱ�(deposit) , �Ű������� ������ ������, ����Ÿ���� ����
	
	public void deposit(int money) {
		this.money += money;
		
	}
	
	// �� ����ϱ�, �Ű������� ������ ������, ����Ÿ�� ����
	public void withdraw(int money) {
		this.money -= money;
	}
	
	
	//�ܾ� �����ֱ� �Ű�����/����Ÿ�� ����
	public void showMoney() {
		System.out.println(name +"���� �ܾ� : "+ money+ "�޷�");
	}
	public ���(String name, int money) {
		this.name = name;
		this.money = money;
	}

	
	
}
