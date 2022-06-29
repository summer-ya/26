package quiz;

public class Macaroni implements Makepizza {
	

	@Override
	public void makePizza() {
		System.out.println("마카로니 피자를 만들어요");
	}
	
	public static void main(String[] args) {
		
		Makepizza pizza = new Macaroni();
		System.out.println("오늘은 페퍼로니가 땡기는데");
		pizza.makePizza();
		
	}

}
