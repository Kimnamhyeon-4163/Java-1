package sub2;

/*
 * 날짜 : 2020/11/16
 * 이름 : 김철학
 * 내용 : 익명객체 실습하기 
 */
public class AnonyObjectTest {
	
	public static void main(String[] args) {
		
		// 익명객체 - 인터페이스를 클래스 구현없이 바로 new 연산으로 생성한 객체
		Person p = new Person() {
			
			@Override
			public void show() {
				System.out.println("Person show...");
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello...");
			}
		};
		
		p.show();
		p.hello();
		
	}
}
