package sub4;

/*
 * 날짜 : 2020/11/11
 * 이름 : 김철학
 * 내용 : 다형성(Polymorphism) 실습하기 교재 p205
 * 
 * 다형성
 *  - 상속관계에 있는 부모클래스의 구체적인 실체가 상속받는 자식클래스로 변하는 성질
 *  - 부모클래스 타입으로 객체를 선언하는 것
 *  - 다형성 적용으로 객체의 타입을 통일함으로써 코드의 유연성을 높임
 * 
 */
public class PolyTest {
	public static void main(String[] args) {
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
	}
}
