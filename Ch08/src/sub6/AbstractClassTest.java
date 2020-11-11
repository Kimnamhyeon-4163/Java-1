package sub6;

/*
 * 날짜 : 2020/11/11
 * 이름 : 김철학
 * 내용 : 추상클래스 실습하기 교재 p216
 * 
 * 추상클래스 
 *  - 추상메서드가 선언된 클래스
 *  - 추상클래스를 상속 받아 통일성 있는 구조를 갖는 클래스 정의
 *  - 추상클래스를 상속받는 자식클래스의 타입선언은 다형성을 적용 
 *  
 */
public class AbstractClassTest {

	public static void main(String[] args) {
	
		// 추상클래스는 직접 객체생성을 할 수 없다.
		//Unit u = new Unit();
		
		Unit u1 = new Marine();
		Unit u2 = new Zealot();
		
		u1.move();
		u1.attack();
		
		u2.move();
		u2.attack();		
	}
}
