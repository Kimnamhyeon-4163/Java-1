package sub1;

/*
 * 날짜 : 2020/11/17
 * 이름 : 김철학
 * 내용 : 자바 API(내장클래스) 실습하기 교재 p284
 */
public class ObjectTest {
	public static void main(String[] args) {
		
		// 다형성에 활용되는 Object 클래스 교재 p284
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2500);
		Object b1 = new Banana("대만", 2000);
		Object b2 = new Banana("중국", 1500);
		
		// toString() : 교재 p290
		a1.toString();
		a2.toString();
		b1.toString();
		b2.toString();
	}
}
