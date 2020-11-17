package sub1;

public class Apple extends Object {

	private String country;
	private int price;
	
	// 동적로딩 객체 생성을 위한 생성자
	public Apple() {
		this.country = "대한민국";
		this.price = 2000;
	}
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
	
	@Override
	public String toString() {
		show();		
		return super.toString();
	}
	
	
}
