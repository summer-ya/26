package quiz;

public class Macaroni implements Makepizza {
	

	@Override
	public void makePizza() {
		System.out.println("��ī�δ� ���ڸ� ������");
	}
	
	public static void main(String[] args) {
		
		Makepizza pizza = new Macaroni();
		System.out.println("������ ���۷δϰ� ����µ�");
		pizza.makePizza();
		
	}

}
