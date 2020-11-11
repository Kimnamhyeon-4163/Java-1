package sub6;

// 추상클래스 : 1개 이상의 추상메서드를 갖는 클래스
public abstract class Unit {

	public void move() {
		System.out.println("Unit move...");
	}
	
	// 추상메서드
	public abstract void attack();
	
}
